
import clases.Conexion;
import clases.ToothException;
import java.awt.Color;
import java.sql.*;
import java.util.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author gonzalo
 */
public class Cargar extends javax.swing.JDialog {

    int id;

    /**
     * Creates new form Cargar
     */
    public Cargar(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/Icono1.png")).getImage());
        conectar();
        Calendar fecha = new GregorianCalendar();
        int ano = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH)+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        fechaactual=dia+"/"+mes+"/"+ano;
        txtDescripcion.setEditable(false);
        txtCantidad.setEditable(false);
        llenarcmb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCargar = new javax.swing.JButton();
        cmbCargo = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        lblMonto = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        lblMsgTotal = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmRegresar = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("ToothCenter - Cargar");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCargar.setBackground(new java.awt.Color(255, 255, 255));
        btnCargar.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnCargar.setText("Confirmar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        cmbCargo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        cmbCargo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbCargoItemStateChanged(evt);
            }
        });
        cmbCargo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbCargoMouseClicked(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        lblMonto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMonto.setText("Cantidad en $");

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });
        txtCantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantidadKeyTyped(evt);
            }
        });

        lblMsgTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel1.setText("Descripcion del cargo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbCargo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblMonto))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                        .addComponent(lblMsgTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(21, 21, 21))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCargar)
                            .addComponent(jLabel1)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(cmbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMsgTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblMonto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCargar)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jmRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jmRegresar.setToolTipText("Atras");
        jmRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRegresarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmRegresar);

        jMenu1.setText("Añadir +");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
       id=id;
    }//GEN-LAST:event_formWindowActivated

    private void validarCargo()throws ToothException{
        if(cmbCargo.getSelectedIndex()==0){
            cmbCargo.requestFocus();
            throw new ToothException("Selecciona un tratamiento");
        }else{
            if(cmbCargo.getSelectedIndex()==1){
                String cad=txtDescripcion.getText();
                String cant=txtCantidad.getText();
                if(cad.equals("")){
                    txtDescripcion.requestFocus();
                    throw new ToothException("Agrega una descripción");
                }else{
                    if(cant.equals("")){
                        txtDescripcion.requestFocus();
                        throw new ToothException("Añade una canatidad");
                    }
                    else{
                        if(Float.parseFloat(cant)<=0){
                            txtCantidad.requestFocus();
                            throw new ToothException("¡Error!\nCantidad no valido");
                        }
                        else{
                            showMessageDialog(this,"¡Cargo exitoso!");
                        }
                    }
                }
            }
        }
        
    }
    
    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        try{
            validarCargo();
            insertarcargo();
            this.dispose();
        }catch(ToothException e){
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void cmbCargoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbCargoItemStateChanged
        if(cmbCargo.getSelectedIndex()<=0){
            txtDescripcion.setText("");
            txtCantidad.setText("");
            txtDescripcion.setEditable(false);
            txtCantidad.setEditable(false);
            return;}
        if(cmbCargo.getSelectedIndex()==1){
            txtDescripcion.setText("");
            txtCantidad.setText("");
            txtDescripcion.setEditable(true);
            txtDescripcion.requestFocus();
            txtCantidad.setEditable(true);
            return;
        }
        String A[]=cmbCargo.getSelectedItem().toString().split("-");
        txtDescripcion.setText(A[0]);
        txtCantidad.setText(A[1]);
        txtDescripcion.setEditable(false);
        txtCantidad.setEditable(false);
    }//GEN-LAST:event_cmbCargoItemStateChanged

    public void insertarcargo()
    {
        String cad="";
        try
        {
           Statement stmt=cn.createStatement();
           cad="insert into Movimientos (Id_paciente,Tipo,Descripcion,Monto,Fecha) values ("+id+",'Cargo','"+txtDescripcion.getText()+"',"+txtCantidad.getText()+","+"DateValue('"+fechaactual+"'));";
           
           stmt.executeUpdate(cad);
           stmt.close(); 
        }catch(SQLException ex){showMessageDialog(this,"Error");}
    }
    public void llenarcmb()
    {
        
        try{
            Statement stmt=cn.createStatement();
            stmt.execute("select*from Tratamientos");
            ResultSet rs=stmt.getResultSet();
            String cad="Seleccione Tratamiento,Otro";
            if(rs!=null)
            {
                while(rs.next()){
                    cad=cad+","+rs.getString("Nombre")+"-"+rs.getFloat("Costo");
                    
                }
                Object op[]=cad.split(",");
                javax.swing.DefaultComboBoxModel m=new javax.swing.DefaultComboBoxModel(op);
                cmbCargo.setModel(m);
            }else{showMessageDialog(this,"Error");}
            stmt.close();
        }catch(SQLException ex){showMessageDialog(this,ex.getMessage());}
    }
    public void conectar()
    {
        con =  new Conexion();
        cn = con.getConection();
    }
    
    private void cmbCargoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbCargoMouseClicked

    }//GEN-LAST:event_cmbCargoMouseClicked

    private void jmRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRegresarMouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jmRegresarMouseClicked

    private void txtCantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantidadKeyTyped
        char e=evt.getKeyChar();
        if((e<'0')||(e>'9')){
            evt.consume();
            lblMsgTotal.setText("!");
        }else{
            txtCantidad.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            lblMsgTotal.setText("");
        }
    }//GEN-LAST:event_txtCantidadKeyTyped

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        addCargo obj = new addCargo(new javax.swing.JFrame(), true);
        obj.setVisible(true);
    }//GEN-LAST:event_jMenu1MouseClicked

    String fechaactual;
    private java.sql.Connection cn;
    Conexion con;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCargar;
    private javax.swing.JComboBox<String> cmbCargo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmRegresar;
    private javax.swing.JLabel lblMonto;
    private javax.swing.JLabel lblMsgTotal;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
