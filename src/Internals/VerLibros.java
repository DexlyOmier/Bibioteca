package Internals;

import Conexion.BaseDeDatos;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class VerLibros extends javax.swing.JInternalFrame 
{
    private static BaseDeDatos bbdd;
    private static Connection c;
    public VerLibros() 
    {
        initComponents();
    }
    
    public void setDatos(BaseDeDatos bbdd)
    {
        this.bbdd=bbdd;
        ingresaDatos();
    }
    
    public static void ingresaDatos()
    {
        ResultSet res; 
        
        DefaultTableModel modelo=(DefaultTableModel)jTable1.getModel();
        modelo.setRowCount(0);
        
        try {
            res=bbdd.getConexion("VerLibros").executeQuery();
            
            while(res.next()){
                Vector v=new Vector();
                v.add(res.getString(1));
                v.add(res.getString(2));
                v.add(res.getString(3));
                v.add(res.getString(4));
                v.add(res.getString(5));
                v.add(res.getInt(6));
                v.add(res.getString(7));
                v.add(res.getInt(8));
                v.add(res.getString(9));
                v.add(res.getInt(10));
                modelo.addRow(v);
                jTable1.setModel(modelo);
            }
            res.close();
        } catch (SQLException ex) 
        {
            JOptionPane.showMessageDialog(null, "Error al leer los datos de la base de datos\n"+ex.getSQLState());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        setTitle("Listado de libros");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Titulo", "Lanzamiento", "Categoria", "Editorial", "Existencia", "Idioma", "Paginas", "Descripcion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 884, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
