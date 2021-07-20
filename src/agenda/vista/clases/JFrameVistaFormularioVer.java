
package agenda.vista.clases;

import agenda.modelo.clases.Contacto;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.*;


public class JFrameVistaFormularioVer extends JFrameVistaFormulario {

    private JToggleButton jToggleButtonGuardar;
    private JToggleButton jToggleButtonEditar;
    private JButton jButtonBorrar;
    private Contacto contacto;

    public JFrameVistaFormularioVer(String titulo, Component parent, Contacto contacto) {
        super(titulo, parent);
        this.contacto = contacto;
        initComponents();
        cargarIconos();
        llenarCampos();
        habilitarCampos(false);
    }
    
    private void cargarIconos() {
        cargarIcono(jToggleButtonEditar, "edit-user-icon.png");
        cargarIcono(jButtonBorrar, "remove-user-icon.png");
        cargarIcono(jToggleButtonGuardar, "check-icon.png");
    }

    public JFrameVistaFormularioVer(String titulo, Contacto co) {
        this(titulo, null, co);
    }

    public final void initComponents() {
        this.jToggleButtonGuardar = new JToggleButton();
        jToggleButtonGuardar.setBackground(new Color(238, 245, 247));
        jToggleButtonGuardar.setFont(new Font("Lato", 0, 16)); // NOI18N
        jToggleButtonGuardar.setForeground(new Color(24, 19, 9));
        jToggleButtonGuardar.setText("Guardar");
        jToggleButtonGuardar.setHorizontalAlignment(SwingConstants.LEFT);
        jToggleButtonGuardar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jToggleButtonGuardar.setIconTextGap(20);
        jToggleButtonGuardar.setPreferredSize(new Dimension(400, 53));
        getJPanelBotonera().add(jToggleButtonGuardar);
        this.jToggleButtonEditar = new JToggleButton();
        jToggleButtonEditar.setBackground(new Color(238, 245, 247));
        jToggleButtonEditar.setFont(new Font("Lato", 0, 16)); // NOI18N
        jToggleButtonEditar.setForeground(new Color(24, 19, 9));
        jToggleButtonEditar.setText("Editar");
        jToggleButtonEditar.setHorizontalAlignment(SwingConstants.LEFT);
        jToggleButtonEditar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jToggleButtonEditar.setIconTextGap(20);
        jToggleButtonEditar.setPreferredSize(new Dimension(400, 53));
        getJPanelBotonera().add(jToggleButtonEditar);
        this.jButtonBorrar = new JButton();
        jButtonBorrar.setBackground(new Color(238, 245, 247));
        jButtonBorrar.setFont(new Font("Lato", 0, 16)); // NOI18N
        jButtonBorrar.setForeground(new Color(24, 19, 9));
        jButtonBorrar.setText("Borrar");
        jButtonBorrar.setHorizontalAlignment(SwingConstants.LEFT);
        jButtonBorrar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButtonBorrar.setIconTextGap(20);
        jButtonBorrar.setPreferredSize(new Dimension(400, 53));
        getJPanelBotonera().add(jButtonBorrar);
    }

    private void llenarCampos() {
        getjTextFieldNombre().setText(contacto.getNombre());
        getjTextFieldApellido().setText(contacto.getApellido());
        getjTextFieldMail().setText(contacto.getMail());
        getjTextFieldTelefono().setText(contacto.getTelefono());
        getjTextFieldDireccion().setText(contacto.getDireccion());
        getjXDatePickerNacimiento().setDate(contacto.getFechaDeNacimiento());
        getjComboBoxCategoria().setSelectedIndex(contacto.getCategoria().ordinal() - 1);
        getjLabelIconoCalendario().setText("(" + contacto.getEdad() + ")");
    }
    
    @Override
    public Contacto getContacto() {
        Contacto co = super.getContacto();
        co.setId(this.contacto.getId());
        return co;
    }

    public void manejarAccionGuardar(ActionListener il) {
       this.jToggleButtonGuardar.addActionListener(il);
    }


    public void manejarAccionEditar(ItemListener il) {
        this.jToggleButtonEditar.addItemListener(il);
    }

    public void manejarAccionBorrar(ActionListener al) {
        this.jButtonBorrar.addActionListener(al);
    }
}
