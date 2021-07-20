
package agenda.vista.clases;

import agenda.modelo.clases.Categoria;
import agenda.modelo.clases.Contacto;
import agenda.modelo.clases.Exporter;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;


public class JFrameVistaPrincipal extends JFrameTemplate {

    public JFrameVistaPrincipal(String titulo, Component parent) {
        super(titulo, parent);
        initComponents();
        cargarIconos();
        ocultarColumnaID();
        actualizarEstado(false);
    }

    public JFrameVistaPrincipal(String titulo) {
        this(titulo, null);
    }

    private void cargarIconos() {
        cargarIcono(jLabelCategoria, "tag-icon.png");
        cargarIcono(jButtonConectar, "broken-link.png");
        cargarIcono(jButtonExportar, "excel-icon.png");
        cargarIcono(jButtonAgregar, "add-user-icon.png");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelCabecera = new javax.swing.JPanel();
        jPanelFiltro = new javax.swing.JPanel();
        jLabelCategoria = new javax.swing.JLabel();
        jComboBoxFiltroCategoria = new javax.swing.JComboBox<>();
        jLabelLeyenda = new javax.swing.JLabel();
        jLabelEstado = new javax.swing.JLabel();
        jPanelBotonera = new javax.swing.JPanel();
        jButtonConectar = new javax.swing.JButton();
        jButtonExportar = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(217, 200, 184));
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout(10, 10));

        jPanelCabecera.setPreferredSize(new java.awt.Dimension(850, 80));
        jPanelCabecera.setLayout(new java.awt.BorderLayout());

        jPanelFiltro.setPreferredSize(new java.awt.Dimension(400, 50));
        jPanelFiltro.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 10));

        jLabelCategoria.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jLabelCategoria.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabelCategoria.setText("Categoría:");
        jLabelCategoria.setIconTextGap(10);
        jPanelFiltro.add(jLabelCategoria);

        jComboBoxFiltroCategoria.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jComboBoxFiltroCategoria.setToolTipText("");
        jComboBoxFiltroCategoria.setEnabled(false);
        jComboBoxFiltroCategoria.setPreferredSize(new java.awt.Dimension(200, 30));
        jPanelFiltro.add(jComboBoxFiltroCategoria);

        jLabelLeyenda.setFont(new java.awt.Font("Lato", 0, 14)); // NOI18N
        jLabelLeyenda.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLeyenda.setText("DOBLE CLICK  en un contacto para más datos.");
        jLabelLeyenda.setPreferredSize(new java.awt.Dimension(400, 20));
        jLabelLeyenda.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanelFiltro.add(jLabelLeyenda);

        jPanelCabecera.add(jPanelFiltro, java.awt.BorderLayout.WEST);

        jLabelEstado.setFont(new java.awt.Font("Lato Black", 1, 18)); // NOI18N
        jLabelEstado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEstado.setText("status");
        jPanelCabecera.add(jLabelEstado, java.awt.BorderLayout.CENTER);

        jPanelBotonera.setPreferredSize(new java.awt.Dimension(265, 40));
        jPanelBotonera.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 18));

        jButtonConectar.setBackground(new java.awt.Color(238, 245, 247));
        jButtonConectar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonConectar.setForeground(new java.awt.Color(255, 250, 240));
        jButtonConectar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonConectar.setIconTextGap(20);
        jButtonConectar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonConectar.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonConectar.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanelBotonera.add(jButtonConectar);

        jButtonExportar.setBackground(new java.awt.Color(238, 245, 247));
        jButtonExportar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonExportar.setForeground(new java.awt.Color(255, 250, 240));
        jButtonExportar.setEnabled(false);
        jButtonExportar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonExportar.setIconTextGap(20);
        jButtonExportar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonExportar.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonExportar.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanelBotonera.add(jButtonExportar);

        jButtonAgregar.setBackground(new java.awt.Color(238, 245, 247));
        jButtonAgregar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregar.setForeground(new java.awt.Color(255, 250, 240));
        jButtonAgregar.setEnabled(false);
        jButtonAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        jButtonAgregar.setIconTextGap(20);
        jButtonAgregar.setMaximumSize(new java.awt.Dimension(60, 40));
        jButtonAgregar.setMinimumSize(new java.awt.Dimension(40, 40));
        jButtonAgregar.setPreferredSize(new java.awt.Dimension(60, 40));
        jPanelBotonera.add(jButtonAgregar);

        jPanelCabecera.add(jPanelBotonera, java.awt.BorderLayout.EAST);

        getContentPane().add(jPanelCabecera, java.awt.BorderLayout.NORTH);

        jTable1.setBackground(new java.awt.Color(238, 245, 247));
        jTable1.setFont(new java.awt.Font("Lato", 0, 18)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido", "Mail"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new java.awt.Color(36, 123, 160));
        jTable1.setIntercellSpacing(new java.awt.Dimension(0, 3));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new java.awt.Color(75, 147, 177));
        jTable1.setSelectionForeground(new java.awt.Color(238, 245, 247));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public boolean confirmar(String mensaje) {
        int res = JOptionPane.showConfirmDialog(null, mensaje, "Confirmar...", JOptionPane.YES_NO_OPTION);
        return res == 0;
    }

    public void listarContactos(Collection<Contacto> contactos) {
        limpiarFilas();
        for (Contacto c : contactos) {
            agregarFila(c.getId(), c.getNombre(), c.getApellido(), c.getMail());
        }
    }

    private void agregarFila(int id, String nombre, String apellido, String mail) {
        DefaultTableModel dtf = (DefaultTableModel) this.jTable1.getModel();
        dtf.addRow(new Object[]{id, nombre, apellido, mail});
    }

    private void limpiarFilas() {
        DefaultTableModel dtf = (DefaultTableModel) this.jTable1.getModel();
        while (dtf.getRowCount() > 0) {
            dtf.removeRow(0);
        }
    }

    public void exportarContactos(){
        if (this.jTable1.getRowCount()==0) {
            JOptionPane.showMessageDialog (null, "No hay datos en la tabla para exportar.","BCO",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }
        JFileChooser chooser=new JFileChooser();
        FileNameExtensionFilter filter=new FileNameExtensionFilter("Archivos de excel","xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setMultiSelectionEnabled(false);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null)==JFileChooser.APPROVE_OPTION){
            List<JTable> tb=new ArrayList<>();
            List<String>nom=new ArrayList<>();
            this.jTable1.removeColumn(this.jTable1.getColumnModel().getColumn(0));
            tb.add(jTable1);
            nom.add("Contactos");
            String file=chooser.getSelectedFile().toString().concat(".xls");
            try {
                Exporter e=new Exporter(new File(file),tb, nom);
                if (e.export()) {
                    JOptionPane.showMessageDialog(null, "Los datos fueron exportados a excel","Agenda",
                            JOptionPane.INFORMATION_MESSAGE);

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null,"Hubo un error"+ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    private void cargarListaDeFiltros() {
        this.jComboBoxFiltroCategoria.setModel(new DefaultComboBoxModel(Categoria.values()));
    }

    private void ocultarColumnaID() {
        this.jTable1.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        this.jTable1.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        this.jTable1.getColumnModel().getColumn(0).setMaxWidth(0);
        this.jTable1.getColumnModel().getColumn(0).setMinWidth(0);
    }

    public int obtenerIDSeleccionado() {
        int nroFila = this.jTable1.getSelectedRow();
        return (int) this.jTable1.getValueAt(nroFila, 0);
    }

    public final void actualizarEstado(boolean estaConectado) {
        this.jLabelLeyenda.setVisible(estaConectado);
        activarControles(estaConectado);
        this.jButtonConectar.setEnabled(!estaConectado);
        if (estaConectado) {
            cargarListaDeFiltros();
            this.jLabelEstado.setText("CONECTADO");
            this.jLabelEstado.setForeground(new Color(55, 184, 88));
        } else {
            this.jLabelEstado.setText("NO CONECTADO");
            this.jLabelEstado.setForeground(new Color(255, 87, 71));
        }
    }

    private void activarControles(boolean flag) {
        for (int i = 1; i < this.jPanelBotonera.getComponents().length; i++) {
            this.jPanelBotonera.getComponent(i).setEnabled(flag);
        }
        this.jComboBoxFiltroCategoria.setEnabled(flag);
    }

    public Categoria obtenerCategoriaSeleccionada() {
        return (Categoria) this.jComboBoxFiltroCategoria.getSelectedItem();
    }


    public void manejarAccionConectar(ActionListener al) {
        this.jButtonConectar.addActionListener(al);
    }

    public void manejarAccionAgregar(ActionListener al) {
        this.jButtonAgregar.addActionListener(al);
    }

    public void manejarAccionExportar(ActionListener al) {
        this.jButtonExportar.addActionListener(al);
    }

    public void manejarCambioItemFiltrar(ItemListener il) {
        this.jComboBoxFiltroCategoria.addItemListener(il);
    }

    public void manejarClickEnTabla(MouseListener ml) {
        this.jTable1.addMouseListener(ml);
    }


    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonConectar;
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JComboBox<Categoria> jComboBoxFiltroCategoria;
    private javax.swing.JLabel jLabelCategoria;
    private javax.swing.JLabel jLabelEstado;
    private javax.swing.JLabel jLabelLeyenda;
    private javax.swing.JPanel jPanelBotonera;
    private javax.swing.JPanel jPanelCabecera;
    private javax.swing.JPanel jPanelFiltro;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;

}
