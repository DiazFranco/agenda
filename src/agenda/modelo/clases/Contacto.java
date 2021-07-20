
package agenda.modelo.clases;

import java.sql.Date;
import java.time.LocalDate;
import java.time.Period;


public class Contacto {
    private int id;
    private String nombre;
    private String apellido;
    private String mail;
    private String telefono;
    private String direccion;
    private Date fechaDeNacimiento;
    private Categoria categoria;
    private int edad;
    private boolean activo;
    
    public Contacto(int id, String nombre, String apellido, String mail, String telefono, String direccion, Date fechaDeNacimiento, Categoria categoria, boolean activo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.mail = mail;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.categoria = categoria;
        this.activo = activo;
        calcularEdad();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getMail() {
        return mail;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public int getEdad() {
        return edad;
    }    
    
    private void calcularEdad () {
        LocalDate nacimiento = this.fechaDeNacimiento.toLocalDate();
        LocalDate ahora  = LocalDate.now();
        this.edad = Period.between(nacimiento, ahora).getYears();
    }
    
    public String nombreCompleto() {
        return this.nombre + " " + this.apellido;
    }

    @Override
    public String toString() {
        return "Contacto{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", mail=" + mail + ", telefono=" + telefono + ", direccion=" + direccion + ", fechaDeNacimiento=" + fechaDeNacimiento + ", categoria=" + categoria + ", edad=" + edad + '}';
    }
}
