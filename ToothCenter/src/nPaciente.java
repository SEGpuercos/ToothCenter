
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.*;



/**
 *
 * @author gonzalo
 */
public class nPaciente extends javax.swing.JDialog {

    /**
     * Creates new form nPaciente
     */
    public nPaciente(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/Icono1.png")).getImage());
        conectar();
    }
    private void limpiarCampos(){
        txtNombre.setText("");
        txtEdad.setText("");
        txtTelefono.setText("");
        txtConsulta.setText("");
        rbtnMas.setSelected(false);
        rbtnFem.setSelected(false);
        txtDomicilio.setText("");
        txtTutor.setText("");
    }
    
    private void validarTodo()throws ToothException{
        String n=txtNombre.getText();
        String edad=txtEdad.getText();
        String tel=txtTelefono.getText();
        String dom=txtDomicilio.getText();
        if(n.equals("")){
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(edad.equals("")){
                txtEdad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tel.equals("")){
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(dom.equals("")){
                txtDomicilio.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(rbtnMas.isSelected()==false&&rbtnFem.isSelected()==false){
                lblSexo.setForeground(Color.red);
            }
            throw new ToothException("Introduce los datos");
        }
        if(edad.equals("")){
            txtEdad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(n.equals("")){
                txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tel.equals("")){
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(dom.equals("")){
                txtDomicilio.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(rbtnMas.isSelected()==false&&rbtnFem.isSelected()==false){
                rbtnMas.setBorder(BorderFactory.createLineBorder(Color.red, 1));
                lblSexo.setForeground(Color.red);
            }
            throw new ToothException("Introduce los datos");
        }
        if(tel.equals("")){
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(n.equals("")){
                txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(edad.equals("")){
                txtEdad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(dom.equals("")){
                txtDomicilio.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(rbtnMas.isSelected()==false&&rbtnFem.isSelected()==false){
                lblSexo.setForeground(Color.red);
            }
            throw new ToothException("Introduce los datos");
        }
        if(dom.equals("")){
            txtDomicilio.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            if(n.equals("")){
                txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(edad.equals("")){
                txtEdad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tel.equals("")){
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(rbtnMas.isSelected()==false&&rbtnFem.isSelected()==false){
                lblSexo.setForeground(Color.red);
            }
            throw new ToothException("Introduce los datos");
        }
        if(rbtnMas.isSelected()==false&&rbtnFem.isSelected()==false){
            lblSexo.setForeground(Color.red);
            if(n.equals("")){
                txtNombre.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(edad.equals("")){
                txtEdad.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(tel.equals("")){
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            if(dom.equals("")){
                txtDomicilio.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            }
            throw new ToothException("Introduce los datos");
        }
    }
    
    private void validarNombre()throws ToothException{
        String inv="1234567890,.-{}´+/*_:;][*¨=)(/&%$#!?¡";
        String cad=txtNombre.getText();
        String N[]=cad.split(" ");
        for(int i=0;i<cad.length();i++){
            if(inv.indexOf(cad.substring(i,i+1))!=-1){
                txtNombre.requestFocus();
                txtNombre.setBorder(BorderFactory.createLineBorder(Color.red, 1));
                throw new ToothException("¡Error!\nIntroduce solo letras");
            }
        }
        if(N.length<2){
            txtNombre.requestFocus();
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.red, 1));
            throw new ToothException("Nombre no valido.\nEjemplo: Pedro Ramirez Lopez");
        }
        txtNombre.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }
    
    private void validarEdad()throws ToothException{
        String edad=txtEdad.getText();
        if(Integer.parseInt(edad)<0||Integer.parseInt(edad)>100){
            txtEdad.requestFocus();
            txtEdad.setBorder(BorderFactory.createLineBorder(Color.red, 1));
            throw new ToothException("¡Error!\nEdad no valida");
        }
        txtEdad.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }
    
    private void validarTel()throws ToothException{
        String tel=txtTelefono.getText();
        if(tel.length()!=10){
            txtTelefono.requestFocus();
            txtTelefono.setBorder(BorderFactory.createLineBorder(Color.red, 1));
            throw new ToothException("¡Error!\nNumero de telefono no valido.");
        }
        txtTelefono.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }
    
    public void conectar(){
       String dbURL="jdbc:ucanaccess://C:\\ToothCenter\\ToothCenterBD.accdb";
        try {
            cn=DriverManager.getConnection(dbURL,"","");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(nPaciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngSexo = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        lblEdad = new javax.swing.JLabel();
        lblTelefono = new javax.swing.JLabel();
        lblConsulta = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtEdad = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtConsulta = new javax.swing.JTextField();
        lblNombre = new javax.swing.JLabel();
        aNombre = new javax.swing.JLabel();
        aEdad = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblMsgTel = new javax.swing.JLabel();
        lblMsgEdad = new javax.swing.JLabel();
        lblMsgNombre = new javax.swing.JLabel();
        lblSexo = new javax.swing.JLabel();
        rbtnMas = new javax.swing.JRadioButton();
        rbtnFem = new javax.swing.JRadioButton();
        aSexo = new javax.swing.JLabel();
        lblDomicilio = new javax.swing.JLabel();
        txtDomicilio = new javax.swing.JTextField();
        aDom = new javax.swing.JLabel();
        lblMsgDom = new javax.swing.JLabel();
        lblDomicilio1 = new javax.swing.JLabel();
        txtTutor = new javax.swing.JTextField();
        lblMsgTutor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblast = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmRegresar = new javax.swing.JMenu();
        jmGuardar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("ToothCenter - Registrar");
        setForeground(new java.awt.Color(204, 204, 204));
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), null));

        lblEdad.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblEdad.setText("Edad");

        lblTelefono.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblTelefono.setText("Telefono");

        lblConsulta.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblConsulta.setText("Diagnostico ");

        txtNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtEdad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtEdad.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtEdad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEdadKeyTyped(evt);
            }
        });

        txtTelefono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        txtConsulta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtConsulta.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConsultaActionPerformed(evt);
            }
        });

        lblNombre.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblNombre.setText("Nombre");

        aNombre.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        aNombre.setText("*");

        aEdad.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        aEdad.setText("*");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("*");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Los campos con un");

        lblMsgTel.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMsgTel.setForeground(new java.awt.Color(255, 0, 0));

        lblMsgEdad.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMsgEdad.setForeground(new java.awt.Color(255, 0, 0));

        lblMsgNombre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMsgNombre.setForeground(new java.awt.Color(255, 0, 0));

        lblSexo.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblSexo.setText("Sexo");

        rbtnMas.setBackground(new java.awt.Color(255, 255, 255));
        btngSexo.add(rbtnMas);
        rbtnMas.setText("Masculino");
        rbtnMas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMasActionPerformed(evt);
            }
        });

        rbtnFem.setBackground(new java.awt.Color(255, 255, 255));
        btngSexo.add(rbtnFem);
        rbtnFem.setText("Femenino");
        rbtnFem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFemActionPerformed(evt);
            }
        });

        aSexo.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        aSexo.setText("*");

        lblDomicilio.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblDomicilio.setText("Domicilio");

        txtDomicilio.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtDomicilio.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtDomicilio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDomicilioActionPerformed(evt);
            }
        });
        txtDomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDomicilioKeyTyped(evt);
            }
        });

        aDom.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        aDom.setText("*");

        lblMsgDom.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMsgDom.setForeground(new java.awt.Color(255, 0, 0));

        lblDomicilio1.setFont(new java.awt.Font("Calibri", 0, 18)); // NOI18N
        lblDomicilio1.setText("Padre o tutor");

        txtTutor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        txtTutor.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.gray));
        txtTutor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTutorKeyTyped(evt);
            }
        });

        lblMsgTutor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMsgTutor.setForeground(new java.awt.Color(255, 0, 0));

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("son obliigatorios");

        lblast.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        lblast.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNombre)
                            .addComponent(lblEdad))
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(aEdad)
                                .addGap(6, 6, 6)
                                .addComponent(lblMsgEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addComponent(aNombre)
                        .addGap(6, 6, 6)
                        .addComponent(lblMsgNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSexo)
                        .addGap(76, 76, 76)
                        .addComponent(rbtnMas)
                        .addGap(13, 13, 13)
                        .addComponent(rbtnFem)
                        .addGap(10, 10, 10)
                        .addComponent(aSexo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTelefono)
                        .addGap(45, 45, 45)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(jLabel4)
                        .addGap(6, 6, 6)
                        .addComponent(lblMsgTel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDomicilio)
                            .addComponent(lblDomicilio1))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(aDom)
                                .addGap(10, 10, 10)
                                .addComponent(lblMsgDom, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblMsgTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblConsulta)
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(6, 6, 6)
                                .addComponent(lblast)
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblNombre)
                        .addGap(6, 6, 6)
                        .addComponent(lblEdad))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(aEdad)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblMsgEdad, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(aNombre)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(lblMsgNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSexo)
                    .addComponent(aSexo)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnMas)
                            .addComponent(rbtnFem))))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTelefono)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel4))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblMsgTel, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDomicilio)
                        .addGap(11, 11, 11)
                        .addComponent(lblDomicilio1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(txtTutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(aDom)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblMsgDom, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(6, 6, 6)
                        .addComponent(lblMsgTutor, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblConsulta)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(93, 93, 93)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblast)
                    .addComponent(jLabel3)))
        );

        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), null));

        jmRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back.png"))); // NOI18N
        jmRegresar.setToolTipText("Regresar");
        jmRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRegresarMouseClicked(evt);
            }
        });
        jmRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmRegresarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmRegresar);

        jmGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/if_save_32_51415.png"))); // NOI18N
        jmGuardar.setToolTipText("Guardar");
        jmGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmGuardarMouseClicked(evt);
            }
        });
        jmGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmGuardarActionPerformed(evt);
            }
        });
        jMenuBar1.add(jmGuardar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void txtConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConsultaActionPerformed

    private void jmGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmGuardarActionPerformed
       
    }//GEN-LAST:event_jmGuardarActionPerformed

    private void jmRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmRegresarActionPerformed
        
    }//GEN-LAST:event_jmRegresarActionPerformed

    private String getSexo()throws ToothException{
        String sexo="";
        if(rbtnMas.isSelected()){
            sexo="Masculino";
        }else{
            if(rbtnFem.isSelected()){
                sexo="Femenino";
            }
        }
        return sexo;
    }
    
    private void jmGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmGuardarMouseClicked
        String cad="";
        try{
            validarTodo();
            //validarTodo();
            validarNombre();
            validarEdad();
            validarTel();
            getSexo();
            String sexo=getSexo();
            validarTel();
            Statement stmt=cn.createStatement();
            cad="insert into Paciente (Nombre,Edad,Sexo,Telefono,Domicilio,Tutor,Diagnostico) values ('"+txtNombre.getText()+"',"+txtEdad.getText()+",'"+sexo+"',"+txtTelefono.getText()+",'"+txtDomicilio.getText()+"','"+txtTutor.getText()+"','"+txtConsulta.getText()+"');";
            showMessageDialog(this,cad);
            stmt.executeUpdate(cad);
            stmt.close(); 
            guardarAnt();
        }catch(SQLException ex){
            showMessageDialog(this,"Error al insertar");
        }catch(ToothException e){
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jmGuardarMouseClicked

    private void guardarAnt(){
        int id_paciente=0;
        try{
            Statement stmt=cn.createStatement();
            stmt.execute("select*from Paciente where Nombre='"+txtNombre.getText()+"';");
            ResultSet rs=stmt.getResultSet();
            validarTodo();
            if(rs!=null){
                while(rs.next()){
                  id_paciente=rs.getInt("Id");
                   limpiarCampos();
                }
            }else{
                showMessageDialog(this,"Error");
            }
            stmt.close();
            historialClinico dialog = new historialClinico(new javax.swing.JFrame(), true);
            dialog.id_paciente=id_paciente;
            dialog.setVisible(true);
            this.setVisible(false);
        }catch(SQLException ex){showMessageDialog(
            this,ex.getMessage());
        }catch(ToothException e){
            showMessageDialog(this, e.getMessage());
        }
    }
    
    private void jmRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRegresarMouseClicked
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = showOptionDialog(rootPane,"Se perderan los datos no guardados","Confirmar",YES_NO_OPTION,QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == YES_OPTION){
            this.setVisible(false);
        }else{}
    }//GEN-LAST:event_jmRegresarMouseClicked

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = showOptionDialog(rootPane,"¿Descartar datos?","Confirmar",YES_NO_OPTION,QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == YES_OPTION){
            this.setVisible(false);
        }else{}
    }//GEN-LAST:event_formWindowClosing

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        char e=evt.getKeyChar();
        if((((e<'a')||(e>'z'))&&((e<'A')||(e>'Z')))&&(e!=' ')){
            evt.consume();
            lblMsgNombre.setText("!");
        }else{
            txtNombre.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            lblMsgNombre.setText("");
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtEdadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEdadKeyTyped
        char e=evt.getKeyChar();
        if((e<'0')||(e>'9')){
            evt.consume();
            lblMsgEdad.setText("!");
        }else{
            txtEdad.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
            lblMsgEdad.setText("");
        }
    }//GEN-LAST:event_txtEdadKeyTyped
    
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        char e=evt.getKeyChar();
        if((e<'0')||(e>'9')){
            evt.consume();
            lblMsgTel.setText("!");
        }else{
            if(txtTelefono.getText().length()>=10){
                evt.consume();
            }
            else{
                txtTelefono.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
                lblMsgTel.setText("");
            }
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped

    private void rbtnMasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMasActionPerformed
        lblSexo.setForeground(Color.black);
    }//GEN-LAST:event_rbtnMasActionPerformed

    private void rbtnFemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFemActionPerformed
        lblSexo.setForeground(Color.black);
    }//GEN-LAST:event_rbtnFemActionPerformed

    private void txtDomicilioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDomicilioKeyTyped
        txtDomicilio.setBorder(BorderFactory.createLineBorder(Color.gray, 1));
    }//GEN-LAST:event_txtDomicilioKeyTyped

    private void txtTutorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTutorKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTutorKeyTyped

    private void txtDomicilioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDomicilioActionPerformed
        
    }//GEN-LAST:event_txtDomicilioActionPerformed

    private java.sql.Connection cn;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aDom;
    private javax.swing.JLabel aEdad;
    private javax.swing.JLabel aNombre;
    private javax.swing.JLabel aSexo;
    private javax.swing.ButtonGroup btngSexo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu jmGuardar;
    private javax.swing.JMenu jmRegresar;
    private javax.swing.JLabel lblConsulta;
    private javax.swing.JLabel lblDomicilio;
    private javax.swing.JLabel lblDomicilio1;
    private javax.swing.JLabel lblEdad;
    private javax.swing.JLabel lblMsgDom;
    private javax.swing.JLabel lblMsgEdad;
    private javax.swing.JLabel lblMsgNombre;
    private javax.swing.JLabel lblMsgTel;
    private javax.swing.JLabel lblMsgTutor;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblSexo;
    private javax.swing.JLabel lblTelefono;
    private javax.swing.JLabel lblast;
    private javax.swing.JRadioButton rbtnFem;
    private javax.swing.JRadioButton rbtnMas;
    private javax.swing.JTextField txtConsulta;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtTutor;
    // End of variables declaration//GEN-END:variables
}
