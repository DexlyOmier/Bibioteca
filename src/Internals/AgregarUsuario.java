package Internals;

import Conexion.BaseDeDatos;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

public class AgregarUsuario extends javax.swing.JInternalFrame 
{
    BaseDeDatos c;
    MD5 md5=new MD5();
    public AgregarUsuario() 
    {
        initComponents();
    }
    
    public void setC(BaseDeDatos c) 
    {
        this.c = c;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Pn = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Pa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dni = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tel = new javax.swing.JFormattedTextField();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        dir = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        Sn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Sa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Agregar usuario");
        setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(35, 53, 103));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Primer Nombre: ");

        Pn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pn.setForeground(new java.awt.Color(102, 102, 102));
        Pn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        Pn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PnKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Primer Apellido: ");

        Pa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Pa.setForeground(new java.awt.Color(102, 102, 102));
        Pa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        Pa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PaKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cedula: ");

        dni.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        dni.setForeground(new java.awt.Color(102, 102, 102));
        try {
            dni.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-######-####U")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        dni.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario: ");

        user.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        user.setForeground(new java.awt.Color(102, 102, 102));
        user.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Contraseña:");

        pass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        pass.setForeground(new java.awt.Color(102, 102, 102));
        pass.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("AGREGAR USUARIO");

        jLabel10.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Telefono: ");

        tel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        tel.setForeground(new java.awt.Color(102, 102, 102));
        try {
            tel.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabel9.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Direccion:");

        dir.setColumns(20);
        dir.setForeground(new java.awt.Color(102, 102, 102));
        dir.setRows(5);
        dir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 3));
        dir.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                dirKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(dir);

        jLabel6.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Segundo Nombre:");

        Sn.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sn.setForeground(new java.awt.Color(102, 102, 102));
        Sn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        Sn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SnKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Segundo Apellido:");

        Sa.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Sa.setForeground(new java.awt.Color(102, 102, 102));
        Sa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(49, 91, 150), 2));
        Sa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SaKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(49, 91, 150));
        jButton1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("GUARDAR");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton1.setContentAreaFilled(false);
        jButton1.setName(""); // NOI18N
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(49, 91, 150));
        jButton2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("LIMPIAR");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Internals/new_add_user_16734.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Pa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Pn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(64, 64, 64)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel8)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel10))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel6)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sn, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Sa, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Pn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6)
                                    .addComponent(Sn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(Sa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(Pa, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(dni, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel10)
                                    .addComponent(tel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 46, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(146, 146, 146))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(user.getText().equals("")||Pn.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Campos necesarios vacios");
        }
        else
        {
            String con="";
            int cont=0;
            while(cont<dni.getText().length()-1)
            {
                con+=(dni.getText().charAt(cont));
                cont++;
            }
            if(con.contains(" "))
                JOptionPane.showMessageDialog(this, "La cedula es necesaria");
            else
            {
                String ph="";
                int val=0;
                while(val<tel.getText().length()-1)
                {
                    ph+=(tel.getText().charAt(val));
                    val++;
                }
                if(ph.contains(" "))
                    JOptionPane.showMessageDialog(this, "Campo vacio detectado");
                else
                {
                    String contra= String.valueOf(pass.getPassword());

                   if( c.ValidarUsuario(dni.getText(), user.getText(), md5.getMD5(contra),Pn.getText() ,Sn.getText() , Pa.getText(), Sa.getText(), dir.getText(), tel.getText()))
                    JOptionPane.showMessageDialog(this, "Usuario Creado","Advertencia",JOptionPane.WARNING_MESSAGE);

                   else
                    JOptionPane.showMessageDialog(this, "Ya existe el usuario","Advertencia",JOptionPane.WARNING_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        String cadena = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[/w{^a-zA-Z}]");
        Matcher m = p.matcher(cadena);  
        if(!m.find()||evt.getKeyChar()=='{'||evt.getKeyChar()=='}'||evt.getKeyChar()=='/'){
            evt.consume();
        } 
        String Caracteres = user.getText();
        if(Caracteres.length()>=29){
            evt.consume();
        } 
    }//GEN-LAST:event_userKeyTyped

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        String cadena = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[/w{^a-zA-Z}]");
        Matcher m = p.matcher(cadena);  
        if(!m.find()){
            evt.consume();
        } 
        String Caracteres = pass.getText();
        if(Caracteres.length()>=39){
            evt.consume();
        } 
    }//GEN-LAST:event_passKeyTyped

    private void PnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PnKeyTyped
        String cadena = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[/w{^a-zA-Z}]");
        Matcher m = p.matcher(cadena);  
        if(!m.find()||evt.getKeyChar()=='{'||evt.getKeyChar()=='}'||evt.getKeyChar()=='/'){
            evt.consume();
        } 
        String Caracteres = user.getText();
        if(Caracteres.length()>=39){
            evt.consume();
        } 
    }//GEN-LAST:event_PnKeyTyped

    private void SnKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SnKeyTyped
        String cadena = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[/w{^a-zA-Z}]");
        Matcher m = p.matcher(cadena);  
        if(!m.find()||evt.getKeyChar()=='{'||evt.getKeyChar()=='}'||evt.getKeyChar()=='/'){
            evt.consume();
        } 
        String Caracteres = user.getText();
        if(Caracteres.length()>=39){
            evt.consume();
        } 
    }//GEN-LAST:event_SnKeyTyped

    private void PaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PaKeyTyped
        String cadena = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[/w{^a-zA-Z}]");
        Matcher m = p.matcher(cadena);  
        if(!m.find()||evt.getKeyChar()=='{'||evt.getKeyChar()=='}'||evt.getKeyChar()=='/'){
            evt.consume();
        } 
        String Caracteres = user.getText();
        if(Caracteres.length()>=39){
            evt.consume();
        } 
    }//GEN-LAST:event_PaKeyTyped

    private void SaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SaKeyTyped
        String cadena = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[/w{^a-zA-Z}]");
        Matcher m = p.matcher(cadena);  
        if(!m.find()||evt.getKeyChar()=='{'||evt.getKeyChar()=='}'||evt.getKeyChar()=='/'){
            evt.consume();
        } 
        String Caracteres = user.getText();
        if(Caracteres.length()>=39){
            evt.consume();
        } 
    }//GEN-LAST:event_SaKeyTyped

    private void dirKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dirKeyTyped
        String cadena = Character.toString(evt.getKeyChar());
        Pattern p = Pattern.compile("[/w{^a-zA-Z}]");
        Matcher m = p.matcher(cadena);  
        if(!m.find()||evt.getKeyChar()=='{'||evt.getKeyChar()=='}'||evt.getKeyChar()=='/'){
            evt.consume();
        } 
    }//GEN-LAST:event_dirKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Pa;
    private javax.swing.JTextField Pn;
    private javax.swing.JTextField Sa;
    private javax.swing.JTextField Sn;
    private javax.swing.JTextArea dir;
    private javax.swing.JFormattedTextField dni;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPasswordField pass;
    private javax.swing.JFormattedTextField tel;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
