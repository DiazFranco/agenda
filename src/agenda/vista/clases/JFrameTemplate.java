package agenda.vista.clases;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.net.URL;
import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public abstract class JFrameTemplate extends JFrame {

    protected final static String PATH_RECURSOS = "/agenda/vista/recursos/";
    private Component parent;
    private JPanel jPanelContenido;
    private JPanel jPanelFooter;
    private static final int PADDING = 5;

    public JFrameTemplate(String titulo, Component parent) {
        super(titulo); // Invoca al constructor de la superclase con el título de la ventana
        this.parent = parent;
        this.jPanelContenido = new JPanel();
        this.jPanelFooter = new JPanelFooter();
        this.cargar();
    }

    public JFrameTemplate(String titulo) {
        this(titulo, null);
    }

    public void mostrarCartelDeError(String mensaje) {
        JOptionPane.showMessageDialog(parent, mensaje, "Error", JOptionPane.ERROR_MESSAGE);
    }

    public void mostrarCartelDeInfo(String mensaje) {
        JOptionPane.showMessageDialog(parent, mensaje, "Info", JOptionPane.INFORMATION_MESSAGE);
    }

    private void cargar() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE); // La aplicación por defecto se cierra al presionar la cruz
        this.cargarImagenes(); // Personaliza el ícono de la ventana
        this.setResizable(false); // Impide que la ventana cambie de dimensiones
        this.establecerLayout();
        this.setLocationRelativeTo(this);
    }

    private void establecerLayout() {
        super.getContentPane().setLayout(new BorderLayout()); // Establece la disposición de la ventana
        super.getContentPane().add(jPanelContenido, BorderLayout.CENTER); // El contenido se inserta en el medio
        super.getContentPane().add(jPanelFooter, BorderLayout.PAGE_END); // El footer (pie) se inserta debajo
        this.jPanelContenido.setBorder(BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING));
        //this.pack();
    }

    private void cargarImagenes() {
        this.setIconImage(getImagen(PATH_RECURSOS + "user-id-icon.png")); // Establece el ícono de la ventana
    }

    protected void cargarIcono(JLabel label, String nameIcon) {
        label.setIcon(new ImageIcon(getURL(PATH_RECURSOS + nameIcon)));
    }

    protected void cargarIcono(AbstractButton btn, String nameIcon) {
        btn.setIcon(new ImageIcon(getURL(PATH_RECURSOS + nameIcon)));
    }

    private Image getImagen(String ruta) {
        Image img = null;
        try {
            img = Toolkit.getDefaultToolkit().getImage(getURL(ruta));
        } catch (Exception e) {
            System.out.println("No se pudo cargar recurso " + ruta + ": " + e.getMessage());
        }
        return img;
    }

    private URL getURL(String ruta) {
        URL u = getClass().getResource(ruta);
        if (u == null) {
            throw new RuntimeException("No se pudo cargar recurso " + ruta);
        }
        return u;
    }

    public void cerrarVentana() {
        this.dispose();
    }

    @Override
    public final JComponent getContentPane() {
        return jPanelContenido;
    }

    private class JPanelFooter extends JPanel {


        public JPanelFooter() {
            establecerLayout();
            setearComponentes();
        }

        private void establecerLayout() {
            this.setLayout(new BorderLayout());
            this.setBorder(BorderFactory.createEmptyBorder(PADDING, PADDING, PADDING, PADDING));
        }


        private void setearComponentes() {
            for (Component comp : this.getComponents()) {
                JLabel jl = (JLabel) comp;
                jl.setAlignmentX(Component.CENTER_ALIGNMENT);
                jl.setAlignmentY(Component.CENTER_ALIGNMENT);
            }
        }

    }
}
