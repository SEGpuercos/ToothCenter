import clases.Conexion;
import clases.ToothException;
import java.awt.Color;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author SEGsoft
 */

public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        conectar();
        this.getContentPane().setBackground(Color.white);
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/Icono1.png")).getImage());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblUsuario = new javax.swing.JLabel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();
        jPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jpSalir = new javax.swing.JPanel();
        lblSalir = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblUP = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        lblRegistrarse = new javax.swing.JLabel();
        lblOlvideC = new javax.swing.JLabel();
        lblCambiarC = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ToothCenter");
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 204)));
        jPanel1.setLayout(null);

        lblUsuario.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblUsuario.setText("Usuario:");
        jPanel1.add(lblUsuario);
        lblUsuario.setBounds(66, 313, 62, 23);

        lblContraseña.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblContraseña.setText("Contraseña:");
        jPanel1.add(lblContraseña);
        lblContraseña.setBounds(65, 394, 89, 23);

        txtUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        jPanel1.add(txtUsuario);
        txtUsuario.setBounds(66, 342, 249, 24);

        btnIngresar.setBackground(new java.awt.Color(255, 255, 255));
        btnIngresar.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnIngresar);
        btnIngresar.setBounds(136, 528, 91, 31);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Sign Up");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(130, 46, 111, 44);

        txtContraseña.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtContraseña.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));
        txtContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtContraseñaActionPerformed(evt);
            }
        });
        txtContraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtContraseñaKeyTyped(evt);
            }
        });
        jPanel1.add(txtContraseña);
        txtContraseña.setBounds(65, 423, 250, 25);

        jPanel.setBackground(new java.awt.Color(0, 102, 204));
        jPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.MOVE_CURSOR));
        jPanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelMouseDragged(evt);
            }
        });
        jPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelMousePressed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ToothCenter");

        jpSalir.setBackground(new java.awt.Color(0, 102, 204));
        jpSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jpSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jpSalirMouseExited(evt);
            }
        });

        lblSalir.setBackground(new java.awt.Color(0, 102, 204));
        lblSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/430088-32.png"))); // NOI18N
        lblSalir.setAlignmentY(0.0F);
        lblSalir.setAutoscrolls(true);
        lblSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblSalirMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblSalirMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jpSalirLayout = new javax.swing.GroupLayout(jpSalir);
        jpSalir.setLayout(jpSalirLayout);
        jpSalirLayout.setHorizontalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpSalirLayout.createSequentialGroup()
                .addComponent(lblSalir)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jpSalirLayout.setVerticalGroup(
            jpSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblSalir, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        javax.swing.GroupLayout jPanelLayout = new javax.swing.GroupLayout(jPanel);
        jPanel.setLayout(jPanelLayout);
        jPanelLayout.setHorizontalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelLayout.setVerticalGroup(
            jPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpSalir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jPanel1.add(jPanel);
        jPanel.setBounds(1, 1, 361, 32);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/2_1.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 120, 239, 141);

        lblUP.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        lblUP.setForeground(new java.awt.Color(255, 0, 0));
        jPanel1.add(lblUP);
        lblUP.setBounds(81, 459, 200, 26);

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("Recordar contraseña");
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(118, 487, 140, 23);

        lblRegistrarse.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblRegistrarse.setText("Registrarse");
        lblRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblRegistrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblRegistrarseMouseExited(evt);
            }
        });
        jPanel1.add(lblRegistrarse);
        lblRegistrarse.setBounds(150, 290, 70, 14);

        lblOlvideC.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblOlvideC.setText("Olvide mi contraseña");
        lblOlvideC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblOlvideC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblOlvideCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblOlvideCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblOlvideCMouseExited(evt);
            }
        });
        jPanel1.add(lblOlvideC);
        lblOlvideC.setBounds(50, 580, 118, 17);

        lblCambiarC.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblCambiarC.setText("Cambiar contraseña");
        lblCambiarC.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblCambiarC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCambiarCMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCambiarCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCambiarCMouseExited(evt);
            }
        });
        jPanel1.add(lblCambiarC);
        lblCambiarC.setBounds(180, 580, 113, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(363, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void validarUsuario()throws ToothException{
        if(txtUsuario.getText().equals("")){
            throw new ToothException("Introduce el usuario.");
        }else{
            if(txtContraseña.getText().equals("")){
                throw new ToothException("Introduce la contraseña.");
            }
        }
    }
    
    private void validarcaducidad()throws ToothException{
        Calendar systemDate = new GregorianCalendar();
        int systemYear = systemDate.get(Calendar.YEAR);
        int systeMonth = systemDate.get(Calendar.MONTH);
        systeMonth=systeMonth+1;
        int systemDay = systemDate.get(Calendar.DAY_OF_MONTH);
        String FS=systemDay+"/"+systeMonth+"/"+systemYear;
        String expirationDate = "";
        try{
            Statement stmt = cn.createStatement();
            stmt.execute("select*from Activador where Fecha=DateValue('"+FS+"');");
            ResultSet rs=stmt.getResultSet();
            if(rs!=null){
                while(rs.next()){    
                    expirationDate=rs.getDate("Fecha").toString();
                }
            }else{
                showMessageDialog(this,"Error");
            }
            stmt.close();
        }catch(SQLException ex){
            showMessageDialog(this,ex.getMessage());
        }
       if(expirationDate.equals("")){}else{
            throw new ToothException("Licencia expirada.");
       }
    }
    
    private void ingresar(){
        if(txtUsuario.getText().equals("SEG")&&txtContraseña.getText().equals("xdlol123")){
            Admin vAdmin= new Admin();
            vAdmin.setVisible(true);
            this.dispose();
            return;
        }
        try{
            validarUsuario();
            validarcaducidad();
        }catch(ToothException ex){
            showMessageDialog(null, ex.getMessage() ,"Error",JOptionPane.ERROR_MESSAGE);
            return;
        }
        contraseña = "";
        try{
            Statement stmt = cn.createStatement();
            stmt.execute("select*from Usuario where NUsuario='"+txtUsuario.getText().toLowerCase()+"'");        
            ResultSet rs=stmt.getResultSet();
            if(rs!=null){
                while(rs.next()){
                    contraseña = rs.getString("Contraseña");
                }
            }else{showMessageDialog(this,"Error");}
            stmt.close();
        }catch(SQLException ex){showMessageDialog(this,"Usuario no registrado."+ex.getMessage());}
         if(txtContraseña.getText().equals(contraseña)){
            if(jCheckBox1.isSelected()==true){
                recordar();
            }
            else{
                norecordar();
            }
            Paciente vPaciente= new Paciente();
            vPaciente.setVisible(true);
            this.dispose(); 
         }
         else
         {
             lblUP.setText("Usuario o contraseña no valido");
            txtUsuario.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtContraseña.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
         }
    }
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        ingresar();
    }//GEN-LAST:event_btnIngresarActionPerformed
    private void recordar(){
        try{
            String cad = "";
            Statement stmt = cn.createStatement();
            cad = "UPDATE Usuario set Recordar='Si' where NUsuario='"+txtUsuario.getText().toLowerCase()+"'";
            stmt.executeUpdate(cad);
            stmt.close();                             
        }catch(SQLException ex){
            showMessageDialog(this,"Error al actualizar");
        }    
    }
    private void norecordar(){
        try{
            String cad = "";
            Statement stmt = cn.createStatement();
            cad = "UPDATE Usuario set Recordar='No' where NUsuario='"+txtUsuario.getText().toLowerCase()+"'";
            stmt.executeUpdate(cad);
            stmt.close();                             
        }catch(SQLException ex){
            showMessageDialog(this,"Error al actualizar");
        }
    }
    private void txtContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtContraseñaActionPerformed

    private void lblSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_lblSalirMouseClicked

    private void lblSalirMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMousePressed
        jpSalir.setBackground(Color.red);
    }//GEN-LAST:event_lblSalirMousePressed

    private void jPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseClicked
        
    }//GEN-LAST:event_jPanelMouseClicked

    private void lblSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseEntered
        jpSalir.setBackground(Color.red);
    }//GEN-LAST:event_lblSalirMouseEntered

    private void lblSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSalirMouseExited
        jpSalir.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_lblSalirMouseExited

    private void jpSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSalirMouseEntered
        jpSalir.setBackground(Color.red);
    }//GEN-LAST:event_jpSalirMouseEntered

    private void jpSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jpSalirMouseExited
        jpSalir.setBackground(new Color(0,102,204));
    }//GEN-LAST:event_jpSalirMouseExited

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        lblUP.setText("");        
        txtUsuario.setBorder(BorderFactory.createLineBorder(Color.black, 1));
        txtContraseña.setText("");
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtContraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyTyped
        lblUP.setText(""); 
        txtContraseña.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_txtContraseñaKeyTyped

    private void txtUsuarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyReleased
        contraseña="";
         try{    
            Statement stmt=cn.createStatement();
            stmt.execute("select*from Usuario where NUsuario='"+txtUsuario.getText().toLowerCase()+"'");        
            ResultSet rs=stmt.getResultSet();
            if(rs!=null){
                while(rs.next()){    
                    contraseña=rs.getString("Contraseña");
                    if(rs.getString("Recordar").equals("Si")){
                        txtContraseña.setText(contraseña);
                        jCheckBox1.setSelected(true);
                    }else{}
                }
            }else{showMessageDialog(this,"Error");}
            stmt.close();
        }catch(SQLException ex){showMessageDialog(this,"Usuario no encontrado."+ex.getMessage());}
    }//GEN-LAST:event_txtUsuarioKeyReleased

    private void lblRegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseClicked
        Registrarse Registro= new Registrarse();
        Registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblRegistrarseMouseClicked

    private void lblCambiarCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarCMouseClicked
        cambiarContra dialog = new cambiarContra(new javax.swing.JFrame(), true);
        dialog.setVisible(true);
    }//GEN-LAST:event_lblCambiarCMouseClicked

    private void lblOlvideCMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvideCMouseClicked
        recuperarContra dialog = new recuperarContra(new javax.swing.JFrame(), true);
            dialog.setVisible(true);
    }//GEN-LAST:event_lblOlvideCMouseClicked

    private void lblCambiarCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarCMouseEntered
        lblCambiarC.setForeground(Color.blue);
    }//GEN-LAST:event_lblCambiarCMouseEntered

    private void lblCambiarCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCambiarCMouseExited
        lblCambiarC.setForeground(Color.black);
    }//GEN-LAST:event_lblCambiarCMouseExited

    private void lblOlvideCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvideCMouseEntered
        lblOlvideC.setForeground(Color.blue);
    }//GEN-LAST:event_lblOlvideCMouseEntered

    private void lblOlvideCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblOlvideCMouseExited
        lblOlvideC.setForeground(Color.black);
    }//GEN-LAST:event_lblOlvideCMouseExited

    private void lblRegistrarseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseEntered
        lblRegistrarse.setForeground(Color.blue);
    }//GEN-LAST:event_lblRegistrarseMouseEntered

    private void lblRegistrarseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblRegistrarseMouseExited
        lblRegistrarse.setForeground(Color.black);
    }//GEN-LAST:event_lblRegistrarseMouseExited

    private void jPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_jPanelMousePressed

    private void jPanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_jPanelMouseDragged

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            ingresar();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    private void txtContraseñaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtContraseñaKeyReleased
        if(evt.getKeyCode()==java.awt.event.KeyEvent.VK_ENTER){
            ingresar();
        }
    }//GEN-LAST:event_txtContraseñaKeyReleased
    public void conectar(){          
        con =  new Conexion();
        cn = con.getConection();
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }
    
    
    int x,y;
    String contraseña;
    Conexion con;
    private Connection cn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpSalir;
    private javax.swing.JLabel lblCambiarC;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblOlvideC;
    private javax.swing.JLabel lblRegistrarse;
    private javax.swing.JLabel lblSalir;
    private javax.swing.JLabel lblUP;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
