
package agenda.vista.clases;

import agenda.modelo.clases.Categoria;
import agenda.modelo.clases.Contacto;
import agenda.modelo.clases.Exporter;

import java.awt.*;
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
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;


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

        jPanelCabecera = new JPanel();
        jPanelFiltro = new JPanel();
        jLabelCategoria = new JLabel();
        jComboBoxFiltroCategoria = new JComboBox<>();
        jLabelLeyenda = new JLabel();
        jLabelEstado = new JLabel();
        jPanelBotonera = new JPanel();
        jButtonConectar = new JButton();
        jButtonExportar = new JButton();
        jButtonAgregar = new JButton();
        jScrollPane1 = new JScrollPane();
        jTable1 = new JTable();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBackground(new Color(217, 200, 184));
        setResizable(false);
        getContentPane().setLayout(new BorderLayout(10, 10));

        jPanelCabecera.setPreferredSize(new Dimension(850, 80));
        jPanelCabecera.setLayout(new BorderLayout());

        jPanelFiltro.setPreferredSize(new Dimension(400, 50));
        jPanelFiltro.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));

        jLabelCategoria.setFont(new Font("Lato", 0, 18)); // NOI18N
        jLabelCategoria.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabelCategoria.setText("Categoría:");
        jLabelCategoria.setIconTextGap(10);
        jPanelFiltro.add(jLabelCategoria);

        jComboBoxFiltroCategoria.setFont(new Font("Lato", 0, 18)); // NOI18N
        jComboBoxFiltroCategoria.setToolTipText("");
        jComboBoxFiltroCategoria.setEnabled(false);
        jComboBoxFiltroCategoria.setPreferredSize(new Dimension(200, 30));
        jPanelFiltro.add(jComboBoxFiltroCategoria);

        jLabelLeyenda.setFont(new Font("Lato", 0, 14)); // NOI18N
        jLabelLeyenda.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelLeyenda.setText("DOBLE CLICK  en un contacto para más datos.");
        jLabelLeyenda.setPreferredSize(new Dimension(400, 20));
        jLabelLeyenda.setVerticalTextPosition(SwingConstants.BOTTOM);
        jPanelFiltro.add(jLabelLeyenda);

        jPanelCabecera.add(jPanelFiltro, BorderLayout.WEST);

        jLabelEstado.setFont(new Font("Lato Black", 1, 18)); // NOI18N
        jLabelEstado.setHorizontalAlignment(SwingConstants.CENTER);
        jLabelEstado.setText("status");
        jPanelCabecera.add(jLabelEstado, BorderLayout.CENTER);

        jPanelBotonera.setPreferredSize(new Dimension(265, 40));
        jPanelBotonera.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 18));

        jButtonConectar.setBackground(new Color(238, 245, 247));
        jButtonConectar.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jButtonConectar.setForeground(new Color(255, 250, 240));
        jButtonConectar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButtonConectar.setIconTextGap(20);
        jButtonConectar.setToolTipText("Conectar");
        jButtonConectar.setMaximumSize(new Dimension(60, 40));
        jButtonConectar.setMinimumSize(new Dimension(40, 40));
        jButtonConectar.setPreferredSize(new Dimension(60, 40));
        jPanelBotonera.add(jButtonConectar);

        jButtonExportar.setBackground(new Color(238, 245, 247));
        jButtonExportar.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jButtonExportar.setForeground(new Color(255, 250, 240));
        jButtonExportar.setEnabled(false);
        jButtonExportar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButtonExportar.setIconTextGap(20);
        jButtonExportar.setToolTipText("Exportar contactos");
        jButtonExportar.setMaximumSize(new Dimension(60, 40));
        jButtonExportar.setMinimumSize(new Dimension(40, 40));
        jButtonExportar.setPreferredSize(new Dimension(60, 40));
        jPanelBotonera.add(jButtonExportar);

        jButtonAgregar.setBackground(new Color(238, 245, 247));
        jButtonAgregar.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        jButtonAgregar.setForeground(new Color(255, 250, 240));
        jButtonAgregar.setEnabled(false);
        jButtonAgregar.setHorizontalTextPosition(SwingConstants.RIGHT);
        jButtonAgregar.setIconTextGap(20);
        jButtonAgregar.setToolTipText("Agregar contacto");
        jButtonAgregar.setMaximumSize(new Dimension(60, 40));
        jButtonAgregar.setMinimumSize(new Dimension(40, 40));
        jButtonAgregar.setPreferredSize(new Dimension(60, 40));
        jPanelBotonera.add(jButtonAgregar);

        jPanelCabecera.add(jPanelBotonera, BorderLayout.EAST);

        getContentPane().add(jPanelCabecera, BorderLayout.NORTH);

        jTable1.setBackground(new Color(238, 245, 247));
        jTable1.setFont(new Font("Lato", 0, 18));
        jTable1.setModel(new DefaultTableModel(
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
        RowSorter<TableModel> sorter = new TableRowSorter<>(jTable1.getModel());
        jTable1.setRowSorter(sorter);
        jTable1.setDragEnabled(true);
        jTable1.setGridColor(new Color(36, 123, 160));
        jTable1.setIntercellSpacing(new Dimension(0, 3));
        jTable1.setRowHeight(30);
        jTable1.setSelectionBackground(new Color(75, 147, 177));
        jTable1.setSelectionForeground(new Color(238, 245, 247));
        jTable1.setShowVerticalLines(false);
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(0);
        }

        getContentPane().add(jScrollPane1, BorderLayout.CENTER);

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


    private JButton jButtonAgregar;
    private JButton jButtonConectar;
    private JButton jButtonExportar;
    private JComboBox<Categoria> jComboBoxFiltroCategoria;
    private JLabel jLabelCategoria;
    private JLabel jLabelEstado;
    private JLabel jLabelLeyenda;
    private JPanel jPanelBotonera;
    private JPanel jPanelCabecera;
    private JPanel jPanelFiltro;
    private JScrollPane jScrollPane1;
    private JTable jTable1;

}
