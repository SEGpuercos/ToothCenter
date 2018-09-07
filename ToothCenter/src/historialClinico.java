import clases.Conexion;
import clases.ToothException;
import clases.direction;
import java.awt.Color;
import java.sql.*;
import java.util.*;
import java.util.logging.*;
import javax.swing.*;
import static javax.swing.JOptionPane.*;

/**
 *
 * @author SEGsoft
 */
public class historialClinico extends javax.swing.JDialog {

    public historialClinico(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/Icono1.png")).getImage());
        jdcFechaNac.getDateEditor().setEnabled(false);
        fecha=getFecha();
        txtFecha.setText(fecha);
        conectar();
        
    }

    private String getFecha(){
        String f="";
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        mes=mes+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        f=f+año+"/"+mes+"/"+dia;
        return f;
    }
    
    public void llenarcajas(){
        try{
            Statement stmt=cn.createStatement();
            stmt.execute("select*from Paciente where Id="+id_paciente+";");
            ResultSet rs=stmt.getResultSet();
           
            if(rs!=null)
            {
                while(rs.next()){
                    txtNombre.setText(rs.getString("Nombre"));
                    txtEdad.setText(rs.getString("Edad"));
                    txtSexo.setText(rs.getString("Sexo"));
                    txtTutor.setText(rs.getString("Tutor"));
                    txtDomicilio.setText(rs.getString("Domicilio"));
                }
            }else{showMessageDialog(this,"Error");}
            stmt.close();
        }catch(SQLException e){
            showMessageDialog(this,e.getMessage());
        }
    }
    
    public void conectar(){
        con =  new Conexion();
        cn = con.getConection();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        txtSexo = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtTutor = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jdcFechaNac = new com.toedter.calendar.JDateChooser();
        txtOdontologo = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtAntec = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        txtTA = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        txtCirugias = new javax.swing.JTextField();
        txtTSangre = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtConsulta = new javax.swing.JTextArea();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), null));

        jPanel7.setBackground(new java.awt.Color(0, 102, 204));

        jLabel17.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Historia clinica odontologica");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(230, 230, 230)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(230, 230, 230))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel18.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel18.setText("Fecha");

        txtFecha.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtFecha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFecha.setEnabled(false);

        txtNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.setEnabled(false);

        jLabel19.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel19.setText("Nombre");

        jLabel20.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel20.setText("Edad");

        jLabel21.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel21.setText("Sexo");

        txtEdad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEdad.setEnabled(false);

        txtSexo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtSexo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtSexo.setEnabled(false);

        jLabel22.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel22.setText("Padre o tutor");

        txtTutor.setEditable(false);
        txtTutor.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtTutor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTutorActionPerformed(evt);
            }
        });

        txtDomicilio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtDomicilio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDomicilio.setEnabled(false);
        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel23.setText("Domicilio");

        jLabel24.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel24.setText("Fecha de nacimiento");

        jdcFechaNac.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jdcFechaNac.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jdcFechaNac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jdcFechaNacMouseClicked(evt);
            }
        });

        txtOdontologo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtOdontologo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtOdontologo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtOdontologoKeyTyped(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel25.setText("Odontologo tratante");

        jLabel26.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel26.setText("Antecedentes familiares");

        txtAntec.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtAntec.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtAntec.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAntecKeyTyped(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel27.setText("Tension arterial");

        txtTA.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtTA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTAKeyTyped(evt);
            }
        });

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel28.setText("Cirugías");

        txtCirugias.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtCirugias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCirugias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCirugiasActionPerformed(evt);
            }
        });
        txtCirugias.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCirugiasKeyTyped(evt);
            }
        });

        txtTSangre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        txtTSangre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTSangre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTSangreKeyTyped(evt);
            }
        });

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel29.setText("Transfuciones de sangre");

        jLabel30.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        jLabel30.setText("Motivo de consulta");

        txtConsulta.setColumns(20);
        txtConsulta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtConsulta.setRows(5);
        txtConsulta.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtConsultaKeyTyped(evt);
            }
        });
        jScrollPane3.setViewportView(txtConsulta);

        jButton1.setBackground(new java.awt.Color(255, 255, 255));
        jButton1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton1.setText("Siguiente");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel18)
                                    .addComponent(jLabel23))
                                .addGap(10, 10, 10)
                                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel30)
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel29)
                                .addGap(24, 24, 24)
                                .addComponent(txtTSangre, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel28)
                                .addGap(143, 143, 143)
                                .addComponent(txtCirugias, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel27)
                                .addGap(86, 86, 86)
                                .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel26)
                                .addGap(24, 24, 24)
                                .addComponent(txtAntec, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(48, 48, 48)
                                .addComponent(txtOdontologo, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(49, 49, 49)
                                .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addGap(13, 13, 13)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addComponent(txtOdontologo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel26)
                    .addComponent(txtAntec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(txtTA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel27)))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCirugias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addGap(15, 15, 15)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel29)
                    .addComponent(txtTSangre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel30))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtTutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTutorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTutorActionPerformed

    private void txtCirugiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCirugiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCirugiasActionPerformed

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private void validarDatos()throws ToothException{
        String od,ant,tens,cirug,transf,motivo;
        od=txtOdontologo.getText();
        ant=txtAntec.getText();
        tens=txtTA.getText();
        cirug=txtCirugias.getText();
        transf=txtTSangre.getText();
        motivo=txtConsulta.getText();
        if(jdcFechaNac.getDate() == null){
            jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(od.equals("")){
                txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(ant.equals("")){
                txtAntec.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tens.equals("")){
                txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(cirug.equals("")){
                txtCirugias.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(transf.equals("")){
                txtTSangre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(motivo.equals("")){
                txtConsulta.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("No puedes dejar campos en blanco.");
        }
        if(od.equals("")){
            txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(jdcFechaNac.getDate()==null){
                jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(ant.equals("")){
                txtAntec.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tens.equals("")){
                txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(cirug.equals("")){
                txtCirugias.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(transf.equals("")){
                txtTSangre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(motivo.equals("")){
                txtConsulta.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("No puedes dejar campos en blanco.");
        }
        if(ant.equals("")){
            txtAntec.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(jdcFechaNac.getDate()==null){
                jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(od.equals("")){
                txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tens.equals("")){
                txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(cirug.equals("")){
                txtCirugias.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(transf.equals("")){
                txtTSangre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(motivo.equals("")){
                txtConsulta.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("No puedes dejar campos en blanco.");
        }
        if(tens.equals("")){
            txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(jdcFechaNac.getDate()==null){
                jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(od.equals("")){
                txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(ant.equals("")){
                txtAntec.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(cirug.equals("")){
                txtCirugias.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(transf.equals("")){
                txtTSangre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(motivo.equals("")){
                txtConsulta.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("No puedes dejar campos en blanco.");
        }
        if(cirug.equals("")){
            txtCirugias.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(jdcFechaNac.getDate()==null){
                jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(od.equals("")){
                txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(ant.equals("")){
                txtAntec.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tens.equals("")){
                txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(transf.equals("")){
                txtTSangre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(motivo.equals("")){
                txtConsulta.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("No puedes dejar campos en blanco.");
        }
        if(transf.equals("")){
            txtTSangre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(jdcFechaNac.getDate()==null){
                jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(od.equals("")){
                txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(ant.equals("")){
                txtAntec.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tens.equals("")){
                txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(cirug.equals("")){
                txtCirugias.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(motivo.equals("")){
                txtConsulta.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("No puedes dejar campos en blanco.");
        }
        if(motivo.equals("")){
            txtConsulta.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(jdcFechaNac.getDate()==null){
                jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(od.equals("")){
                txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(ant.equals("")){
                txtAntec.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tens.equals("")){
                txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(cirug.equals("")){
                txtCirugias.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tens.equals("")){
                txtTA.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("No puedes dejar campos en blanco.");
        }
    }
    
    private void validarFecha()throws ToothException{
        Calendar fecha = new GregorianCalendar();
        int año = fecha.get(Calendar.YEAR);
        int mes = fecha.get(Calendar.MONTH);
        mes=mes+1;
        int dia = fecha.get(Calendar.DAY_OF_MONTH);
        int d=jdcFechaNac.getDate().getDate();
        int m=jdcFechaNac.getDate().getMonth();
        m=m+1;
        int y=jdcFechaNac.getDate().getYear()+1900;
        //showMessageDialog(this,d+"/"+m+"/"+y+"\n"+dia+"/"+mes+"/"+año);
        if(y>=año){
            if(m>=mes){
                if(d>=dia){
                    jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
                    throw new ToothException("Fecha no valida");
                }
            }
        }
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
            validarDatos();
            validarFecha();
            historialClinico2 dialog = new historialClinico2(new javax.swing.JFrame(), true);
            fecha_n=jdcFechaNac.getDate().getDate()+"/"+(jdcFechaNac.getDate().getMonth()+1)+"/"+(jdcFechaNac.getDate().getYear()+1900);
            dialog.fecha_nacimiento=this.fecha_n;
            dialog.odontologo_tratante=this.txtOdontologo.getText();
            dialog.antecedentes_familiares=this.txtAntec.getText();
            dialog.tension_arterial=this.txtTA.getText();
            dialog.cirugias=this.txtCirugias.getText();
            dialog.transfuciones_sangre=this.txtTSangre.getText();
            dialog.motivo_consulta=this.txtConsulta.getText();
            dialog.id_paciente=this.id_paciente;
            dialog.fecha=this.fecha;
            dialog.tutor=this.txtTutor.getText();
            dialog.setVisible(true);
            this.dispose();
        }catch(ToothException e){
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        llenarcajas();
        
    }//GEN-LAST:event_formWindowActivated

    private void txtOdontologoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOdontologoKeyTyped
        txtOdontologo.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_txtOdontologoKeyTyped

    private void txtAntecKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAntecKeyTyped
        txtAntec.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_txtAntecKeyTyped

    private void txtTAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTAKeyTyped
        txtTA.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_txtTAKeyTyped

    private void txtCirugiasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCirugiasKeyTyped
        txtCirugias.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_txtCirugiasKeyTyped

    private void txtTSangreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTSangreKeyTyped
        txtTSangre.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_txtTSangreKeyTyped

    private void txtConsultaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConsultaKeyTyped
        txtConsulta.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_txtConsultaKeyTyped

    private void jdcFechaNacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jdcFechaNacMouseClicked
        jdcFechaNac.setBorder(BorderFactory.createLineBorder(Color.black, 1));
    }//GEN-LAST:event_jdcFechaNacMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = showOptionDialog(rootPane,"¿Seguro que quieres salir?\nNo podras agregar el historial clinico despues.","Salir",YES_NO_OPTION,QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == YES_OPTION){
            this.dispose();
        }else{}
    }//GEN-LAST:event_formWindowClosing

    private java.sql.Connection cn;
    Conexion con;
    int id_paciente;
    String fecha;
    String fecha_n="";
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private com.toedter.calendar.JDateChooser jdcFechaNac;
    private javax.swing.JTextField txtAntec;
    private javax.swing.JTextField txtCirugias;
    private javax.swing.JTextArea txtConsulta;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtOdontologo;
    private javax.swing.JTextField txtSexo;
    private javax.swing.JTextField txtTA;
    private javax.swing.JTextField txtTSangre;
    private javax.swing.JTextField txtTutor;
    // End of variables declaration//GEN-END:variables
}
