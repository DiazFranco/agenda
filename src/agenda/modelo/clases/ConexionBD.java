package agenda.modelo.clases;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;



public class ConexionBD {

    private static Connection con;

    private static boolean isValid = false;

    public static Connection getConexion(String driver, String url, String user, String pass) {
        if (con == null) {
            try {
                Runtime.getRuntime().addShutdownHook(new MiShutDownHook()); // Agregar hook de fin de programa
                Class.forName(driver); // Chequeo de Driver (sujeto a excepciones)
                isValid = validarUserPass(user, pass);
                if (isValid) {
                    con = DriverManager.getConnection(url, user, pass); // Obtener la conexión
                    System.out.println("Conexión exitosa: " + con.getClass().getName());
                } else {
                    throw new RuntimeException("");
                }
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException("No se encuentra driver " + driver, ex);
            } catch (Exception ex) {
                throw new RuntimeException("Usuario y/o password incorrecta", ex);
            }
        }
        return con;
    }

    public static boolean validarUserPass(String user, String pass) {
        Properties properties= new Properties();
        try {
            properties.load(new FileInputStream(new File("src/agenda/modelo/bd/bd-params.properties")));
        String userParam = properties.getProperty("user");
        String passParam = properties.getProperty("pass");
        isValid =  userParam.equals(user) && passParam.equals(pass);
        } catch (Exception e){
           e.printStackTrace();
        }
        return isValid;
    }

    private static class MiShutDownHook extends Thread {

        /* Justo antes de finalizar el programa la JVM invocará
           a este método donde podemos cerrar la conexion */
        @Override
        public void run() {
            try {
                if (con != null) {
                    con.close();
                    System.out.println("Connection liberada");
                }
            } catch (Exception ex) {
                System.out.println("Error liberando Connection al finalizar app: " + ex.getMessage());
            }
        }
    }
}
