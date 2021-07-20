package agenda.vista.clases;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class JFrameVistaLogin extends JFrameTemplate {


    Properties properties;

    public JFrameVistaLogin(String titulo, Component parent) throws IOException {
        super(titulo, parent);
        initComponents();
        cargarIconos();
        manejarAccionCerrar();
        setLocationRelativeTo(null);
        properties = loadProperties();

    }

    public JFrameVistaLogin(String titulo) throws IOException {
        this(titulo, null);
    }
    
    private void cargarIconos() {
        cargarIcono(jButtonConectar, "broken-link.png");
        cargarIcono(jButtonCerrar, "close-icon.png");
    }

    @SuppressWarnings("unchecked")
    //
    private void initComponents() {

        jPanelContenido = new JPanel();
        jPanelEdicion = new JPanel();
        jPanelLabels = new JPanel();
        jLabelUser = new JLabel();
        jLabelPass = new JLabel();
        jPanelCampos = new JPanel();
        jTextFieldUser = new JTextField();
        jPasswordField1 = new JPasswordField();
        jPanelBotonera = new JPanel();
        jButtonConectar = new JButton();
        jButtonCerrar = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelEdicion.setPreferredSize(new Dimension(100, 800));
        jPanelEdicion.setLayout(new BorderLayout(10, 0));

        jPanelLabels.setMinimumSize(new Dimension(80, 90));
        jPanelLabels.setPreferredSize(new Dimension(120, 800));
        jPanelLabels.setLayout(new GridLayout(4, 1));

        jLabelUser.setFont(new Font("Lato", 0, 24)); // NOI18N
        jLabelUser.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelUser.setText("User:");
        jLabelUser.setIconTextGap(15);
        jLabelUser.setPreferredSize(new Dimension(200, 0));
        jPanelLabels.add(jLabelUser);

        jLabelPass.setFont(new Font("Lato", 0, 24)); // NOI18N
        jLabelPass.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelPass.setText("Pass:");
        jLabelPass.setIconTextGap(15);
        jLabelPass.setPreferredSize(new Dimension(200, 0));
        jPanelLabels.add(jLabelPass);

        jPanelEdicion.add(jPanelLabels, BorderLayout.WEST);

        jPanelCampos.setMinimumSize(new Dimension(320, 148));
        jPanelCampos.setPreferredSize(new Dimension(320, 111));
        jPanelCampos.setLayout(new GridLayout(4, 1));

        jTextFieldUser.setFont(new Font("Lato", 0, 15)); // NOI18N
        jTextFieldUser.setForeground(new Color(24, 19, 9));
        jTextFieldUser.setMargin(new Insets(5, 5, 5, 5));
        jTextFieldUser.setSelectionColor(new Color(255, 206, 91));
        jPanelCampos.add(jTextFieldUser);

        jPasswordField1.setFont(new Font("Tahoma", 0, 15)); // NOI18N
        jPasswordField1.setMargin(new Insets(5, 5, 5, 5));
        jPanelCampos.add(jPasswordField1);

        jPanelEdicion.add(jPanelCampos, BorderLayout.CENTER);

        jPanelBotonera.setPreferredSize(new Dimension(850, 53));
        jPanelBotonera.setLayout(new BoxLayout(jPanelBotonera, BoxLayout.LINE_AXIS));

        jButtonConectar.setBackground(new Color(238, 245, 247));
        jButtonConectar.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jButtonConectar.setForeground(new Color(24, 19, 9));
        jButtonConectar.setText("Conectar");
        jButtonConectar.setHorizontalAlignment(SwingConstants.LEFT);
        jButtonConectar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButtonConectar.setIconTextGap(20);
        jButtonConectar.setPreferredSize(new Dimension(400, 53));
        jPanelBotonera.add(jButtonConectar);

        jButtonCerrar.setBackground(new Color(238, 245, 247));
        jButtonCerrar.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jButtonCerrar.setForeground(new Color(24, 19, 9));
        jButtonCerrar.setText("Cerrar");
        jButtonCerrar.setHorizontalAlignment(SwingConstants.LEFT);
        jButtonCerrar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButtonCerrar.setIconTextGap(20);
        jButtonCerrar.setPreferredSize(new Dimension(400, 53));
        jPanelBotonera.add(jButtonCerrar);

        GroupLayout jPanelContenidoLayout = new GroupLayout(jPanelContenido);
        jPanelContenido.setLayout(jPanelContenidoLayout);
        jPanelContenidoLayout.setHorizontalGroup(
            jPanelContenidoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addGroup(jPanelContenidoLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelBotonera, GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addComponent(jPanelEdicion, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jPanelContenidoLayout.setVerticalGroup(
            jPanelContenidoLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanelContenidoLayout.createSequentialGroup()
                .addComponent(jPanelEdicion, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelBotonera, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        getContentPane().add(jPanelContenido, BorderLayout.CENTER);

        pack();
    }

    public void manejarAccionConectar(ActionListener al) {
        this.jButtonConectar.addActionListener(al);
    }

    public Properties loadProperties() throws IOException {
            Properties properties = new Properties();
            properties.load(new FileInputStream(new File("src/agenda/modelo/bd/bd-params.properties")));
        return properties;
    }
    
    public String getDriver() {
        return properties.getProperty("driver");

    }

    public String getUrl() {
        return properties.getProperty("url");
    }

    public String getUser() {
        return this.jTextFieldUser.getText();
    }

    public String getPass() {
        return String.valueOf(this.jPasswordField1.getPassword());
    }

    private void manejarAccionCerrar() {
        this.jButtonCerrar.addActionListener((ActionEvent e) -> {
            cerrarVentana();
        });
    }

    public void cerrarVentana() {
        this.dispose();
    }


    private JButton jButtonCerrar;
    private JButton jButtonConectar;
    private JLabel jLabelPass;
    private JLabel jLabelUser;
    private JPanel jPanelBotonera;
    private JPanel jPanelCampos;
    private JPanel jPanelContenido;
    private JPanel jPanelEdicion;
    private JPanel jPanelLabels;
    private JPasswordField jPasswordField1;
    private JTextField jTextFieldUser;

}
