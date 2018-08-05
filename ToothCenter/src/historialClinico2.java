
import java.awt.Color;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import static javax.swing.JOptionPane.YES_OPTION;
import static javax.swing.JOptionPane.showMessageDialog;
import static javax.swing.JOptionPane.showOptionDialog;


/**
 *
 * @author gonzalo
 */
public class historialClinico2 extends javax.swing.JDialog {
    public historialClinico2(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Image/Icono1.png")).getImage());
        conectar();
    }

    private void conectar(){
        String dbURL="jdbc:ucanaccess://C:\\ToothCenter\\ToothCenterBD.accdb";
        try {
            cn=DriverManager.getConnection(dbURL,"","");
            System.out.println("Conectado");
        } catch (SQLException ex) {
            Logger.getLogger(Paciente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btngPenicilina = new javax.swing.ButtonGroup();
        btngAnestecia = new javax.swing.ButtonGroup();
        btngYodo = new javax.swing.ButtonGroup();
        btngAspirina = new javax.swing.ButtonGroup();
        btngPresion = new javax.swing.ButtonGroup();
        btngPSanguineos = new javax.swing.ButtonGroup();
        btngVIH = new javax.swing.ButtonGroup();
        btngHepatitis = new javax.swing.ButtonGroup();
        btngEmbarazo = new javax.swing.ButtonGroup();
        btngEVenereas = new javax.swing.ButtonGroup();
        btngUlceraG = new javax.swing.ButtonGroup();
        btngCPAntic = new javax.swing.ButtonGroup();
        btngCMRetroviales = new javax.swing.ButtonGroup();
        btngLimitaciones = new javax.swing.ButtonGroup();
        btngFiebre = new javax.swing.ButtonGroup();
        btngAsma = new javax.swing.ButtonGroup();
        btngDiabetes = new javax.swing.ButtonGroup();
        btngAftas = new javax.swing.ButtonGroup();
        btngTiroides = new javax.swing.ButtonGroup();
        btngRuidos = new javax.swing.ButtonGroup();
        btngSangreExcesiva = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblPen = new javax.swing.JLabel();
        lblAnest = new javax.swing.JLabel();
        lblYodo = new javax.swing.JLabel();
        lblAsp = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        rbtnPSi = new javax.swing.JRadioButton();
        rbtnPNo = new javax.swing.JRadioButton();
        rbtnAnSi = new javax.swing.JRadioButton();
        rbtnAnNo = new javax.swing.JRadioButton();
        rbtnYSi = new javax.swing.JRadioButton();
        rbtnYNo = new javax.swing.JRadioButton();
        rbtnASi = new javax.swing.JRadioButton();
        rbtnANo = new javax.swing.JRadioButton();
        txtOtro = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lblPresion = new javax.swing.JLabel();
        lblSangre = new javax.swing.JLabel();
        lblPSang = new javax.swing.JLabel();
        lblVih = new javax.swing.JLabel();
        lblMRetro = new javax.swing.JLabel();
        lblEmb = new javax.swing.JLabel();
        lblPAnti = new javax.swing.JLabel();
        lblEVen = new javax.swing.JLabel();
        lblHep = new javax.swing.JLabel();
        lblUlcera = new javax.swing.JLabel();
        lblAsma = new javax.swing.JLabel();
        lblFieb = new javax.swing.JLabel();
        lblTiro = new javax.swing.JLabel();
        lblDiab = new javax.swing.JLabel();
        lblLim = new javax.swing.JLabel();
        lblRuid = new javax.swing.JLabel();
        lblAft = new javax.swing.JLabel();
        rbtnPreSi = new javax.swing.JRadioButton();
        rbtnPreNo = new javax.swing.JRadioButton();
        rbtnSangSi = new javax.swing.JRadioButton();
        rbtnSangNo = new javax.swing.JRadioButton();
        rbtnProbSi = new javax.swing.JRadioButton();
        rbtnProbNo = new javax.swing.JRadioButton();
        rbtnVihSi = new javax.swing.JRadioButton();
        rbtnVihNo = new javax.swing.JRadioButton();
        rbtnHepSi = new javax.swing.JRadioButton();
        rbtnHepNo = new javax.swing.JRadioButton();
        rbtnEmbSi = new javax.swing.JRadioButton();
        rbtnEmbNo = new javax.swing.JRadioButton();
        rbtnEVenSi = new javax.swing.JRadioButton();
        rbtnEVenNo = new javax.swing.JRadioButton();
        rbtnUgSi = new javax.swing.JRadioButton();
        rbtnUgNo = new javax.swing.JRadioButton();
        rbtnPAntSi = new javax.swing.JRadioButton();
        rbtnPAntNo = new javax.swing.JRadioButton();
        rbtnMReSi = new javax.swing.JRadioButton();
        rbtnMReNo = new javax.swing.JRadioButton();
        rbtnFiebSi = new javax.swing.JRadioButton();
        rbtnFiebNo = new javax.swing.JRadioButton();
        rbtnAsmNo = new javax.swing.JRadioButton();
        rbtnAsmSi = new javax.swing.JRadioButton();
        rbtnDiabNo = new javax.swing.JRadioButton();
        rbtnDiabSi = new javax.swing.JRadioButton();
        rbtnAftNo = new javax.swing.JRadioButton();
        rbtnAftSi = new javax.swing.JRadioButton();
        rbtnTiroNo = new javax.swing.JRadioButton();
        rbtnTiroSi = new javax.swing.JRadioButton();
        rbtnRuiNo = new javax.swing.JRadioButton();
        rbtnRuiSi = new javax.swing.JRadioButton();
        rbtnLimNo = new javax.swing.JRadioButton();
        rbtnLimSi = new javax.swing.JRadioButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmGuardar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 102, 204), null));

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

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel1.setText("Alergias");

        lblPen.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPen.setText("Penicilina");

        lblAnest.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblAnest.setText("Anestecia");

        lblYodo.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblYodo.setText("Yodo");

        lblAsp.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblAsp.setText("Aspirina");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Otro");

        btngPenicilina.add(rbtnPSi);
        rbtnPSi.setText("Si");
        rbtnPSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPSiActionPerformed(evt);
            }
        });

        btngPenicilina.add(rbtnPNo);
        rbtnPNo.setText("No");
        rbtnPNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPNoActionPerformed(evt);
            }
        });

        btngAnestecia.add(rbtnAnSi);
        rbtnAnSi.setText("Si");
        rbtnAnSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAnSiActionPerformed(evt);
            }
        });

        btngAnestecia.add(rbtnAnNo);
        rbtnAnNo.setText("No");
        rbtnAnNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAnNoActionPerformed(evt);
            }
        });

        btngYodo.add(rbtnYSi);
        rbtnYSi.setText("Si");
        rbtnYSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnYSiActionPerformed(evt);
            }
        });

        btngYodo.add(rbtnYNo);
        rbtnYNo.setText("No");
        rbtnYNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnYNoActionPerformed(evt);
            }
        });

        btngAspirina.add(rbtnASi);
        rbtnASi.setText("Si");
        rbtnASi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnASiActionPerformed(evt);
            }
        });

        btngAspirina.add(rbtnANo);
        rbtnANo.setText("No");
        rbtnANo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnANoActionPerformed(evt);
            }
        });

        txtOtro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 20)); // NOI18N
        jLabel7.setText("Padecimientos");

        lblPresion.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPresion.setText("Alta o baja presión");

        lblSangre.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSangre.setText("Sangre excesiva al cortarse");

        lblPSang.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPSang.setText("Problemas sanguineos");

        lblVih.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblVih.setText("V.I.H. Positivo");

        lblMRetro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMRetro.setText("Consumo de medicamentos retroviales");

        lblEmb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEmb.setText("Embarazada");

        lblPAnti.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblPAnti.setText("Consumo de pastillas anticonceptivas");

        lblEVen.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblEVen.setText("Enfermedades venereas");

        lblHep.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblHep.setText("Hepatitis");

        lblUlcera.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblUlcera.setText("Ulcera gastrica");

        lblAsma.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblAsma.setText("Asma");

        lblFieb.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblFieb.setText("Fiebre reumatica");

        lblTiro.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTiro.setText("Tiroides");

        lblDiab.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblDiab.setText("Diabetes");

        lblLim.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblLim.setText("Limitaciones para abrir la boca");

        lblRuid.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblRuid.setText("Ruidos en la mandibula");

        lblAft.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblAft.setText("Aftas recurrentes");

        btngPresion.add(rbtnPreSi);
        rbtnPreSi.setText("Si");
        rbtnPreSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPreSiActionPerformed(evt);
            }
        });

        btngPresion.add(rbtnPreNo);
        rbtnPreNo.setText("No");
        rbtnPreNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPreNoActionPerformed(evt);
            }
        });

        btngSangreExcesiva.add(rbtnSangSi);
        rbtnSangSi.setText("Si");
        rbtnSangSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSangSiActionPerformed(evt);
            }
        });

        btngSangreExcesiva.add(rbtnSangNo);
        rbtnSangNo.setText("No");
        rbtnSangNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnSangNoActionPerformed(evt);
            }
        });

        btngPSanguineos.add(rbtnProbSi);
        rbtnProbSi.setText("Si");
        rbtnProbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProbSiActionPerformed(evt);
            }
        });

        btngPSanguineos.add(rbtnProbNo);
        rbtnProbNo.setText("No");
        rbtnProbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnProbNoActionPerformed(evt);
            }
        });

        btngVIH.add(rbtnVihSi);
        rbtnVihSi.setText("Si");
        rbtnVihSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVihSiActionPerformed(evt);
            }
        });

        btngVIH.add(rbtnVihNo);
        rbtnVihNo.setText("No");
        rbtnVihNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnVihNoActionPerformed(evt);
            }
        });

        btngHepatitis.add(rbtnHepSi);
        rbtnHepSi.setText("Si");
        rbtnHepSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHepSiActionPerformed(evt);
            }
        });

        btngHepatitis.add(rbtnHepNo);
        rbtnHepNo.setText("No");
        rbtnHepNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnHepNoActionPerformed(evt);
            }
        });

        btngEmbarazo.add(rbtnEmbSi);
        rbtnEmbSi.setText("Si");
        rbtnEmbSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEmbSiActionPerformed(evt);
            }
        });

        btngEmbarazo.add(rbtnEmbNo);
        rbtnEmbNo.setText("No");
        rbtnEmbNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEmbNoActionPerformed(evt);
            }
        });

        btngEVenereas.add(rbtnEVenSi);
        rbtnEVenSi.setText("Si");
        rbtnEVenSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEVenSiActionPerformed(evt);
            }
        });

        btngEVenereas.add(rbtnEVenNo);
        rbtnEVenNo.setText("No");
        rbtnEVenNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnEVenNoActionPerformed(evt);
            }
        });

        btngUlceraG.add(rbtnUgSi);
        rbtnUgSi.setText("Si");
        rbtnUgSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnUgSiActionPerformed(evt);
            }
        });

        btngUlceraG.add(rbtnUgNo);
        rbtnUgNo.setText("No");
        rbtnUgNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnUgNoActionPerformed(evt);
            }
        });

        btngCPAntic.add(rbtnPAntSi);
        rbtnPAntSi.setText("Si");
        rbtnPAntSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPAntSiActionPerformed(evt);
            }
        });

        btngCPAntic.add(rbtnPAntNo);
        rbtnPAntNo.setText("No");
        rbtnPAntNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnPAntNoActionPerformed(evt);
            }
        });

        btngCMRetroviales.add(rbtnMReSi);
        rbtnMReSi.setText("Si");
        rbtnMReSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMReSiActionPerformed(evt);
            }
        });

        btngCMRetroviales.add(rbtnMReNo);
        rbtnMReNo.setText("No");
        rbtnMReNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnMReNoActionPerformed(evt);
            }
        });

        btngFiebre.add(rbtnFiebSi);
        rbtnFiebSi.setText("Si");
        rbtnFiebSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFiebSiActionPerformed(evt);
            }
        });

        btngFiebre.add(rbtnFiebNo);
        rbtnFiebNo.setText("No");
        rbtnFiebNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnFiebNoActionPerformed(evt);
            }
        });

        btngAsma.add(rbtnAsmNo);
        rbtnAsmNo.setText("No");
        rbtnAsmNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAsmNoActionPerformed(evt);
            }
        });

        btngAsma.add(rbtnAsmSi);
        rbtnAsmSi.setText("Si");
        rbtnAsmSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAsmSiActionPerformed(evt);
            }
        });

        btngDiabetes.add(rbtnDiabNo);
        rbtnDiabNo.setText("No");
        rbtnDiabNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDiabNoActionPerformed(evt);
            }
        });

        btngDiabetes.add(rbtnDiabSi);
        rbtnDiabSi.setText("Si");
        rbtnDiabSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDiabSiActionPerformed(evt);
            }
        });

        btngAftas.add(rbtnAftNo);
        rbtnAftNo.setText("No");
        rbtnAftNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAftNoActionPerformed(evt);
            }
        });

        btngAftas.add(rbtnAftSi);
        rbtnAftSi.setText("Si");
        rbtnAftSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnAftSiActionPerformed(evt);
            }
        });

        btngTiroides.add(rbtnTiroNo);
        rbtnTiroNo.setText("No");
        rbtnTiroNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTiroNoActionPerformed(evt);
            }
        });

        btngTiroides.add(rbtnTiroSi);
        rbtnTiroSi.setText("Si");
        rbtnTiroSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTiroSiActionPerformed(evt);
            }
        });

        btngRuidos.add(rbtnRuiNo);
        rbtnRuiNo.setText("No");
        rbtnRuiNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRuiNoActionPerformed(evt);
            }
        });

        btngRuidos.add(rbtnRuiSi);
        rbtnRuiSi.setText("Si");
        rbtnRuiSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnRuiSiActionPerformed(evt);
            }
        });

        btngLimitaciones.add(rbtnLimNo);
        rbtnLimNo.setText("No");
        rbtnLimNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLimNoActionPerformed(evt);
            }
        });

        btngLimitaciones.add(rbtnLimSi);
        rbtnLimSi.setText("Si");
        rbtnLimSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnLimSiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPresion)
                        .addGap(56, 56, 56)
                        .addComponent(rbtnPreSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnPreNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblSangre)
                        .addGap(8, 8, 8)
                        .addComponent(rbtnSangSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnSangNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPSang)
                        .addGap(36, 36, 36)
                        .addComponent(rbtnProbSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnProbNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblVih)
                        .addGap(81, 81, 81)
                        .addComponent(rbtnVihSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnVihNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblHep)
                        .addGap(109, 109, 109)
                        .addComponent(rbtnHepSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnHepNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEmb)
                        .addGap(89, 89, 89)
                        .addComponent(rbtnEmbSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnEmbNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblEVen)
                        .addGap(25, 25, 25)
                        .addComponent(rbtnEVenSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnEVenNo)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblFieb)
                        .addGap(54, 54, 54)
                        .addComponent(rbtnFiebSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnFiebNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAsma)
                        .addGap(119, 119, 119)
                        .addComponent(rbtnAsmSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnAsmNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblDiab)
                        .addGap(100, 100, 100)
                        .addComponent(rbtnDiabSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnDiabNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblAft)
                        .addGap(52, 52, 52)
                        .addComponent(rbtnAftSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnAftNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblTiro)
                        .addGap(106, 106, 106)
                        .addComponent(rbtnTiroSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnTiroNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRuid)
                        .addGap(21, 21, 21)
                        .addComponent(rbtnRuiSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnRuiNo)))
                .addGap(64, 64, 64))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblPen)
                        .addGap(12, 12, 12)
                        .addComponent(rbtnPSi)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnPNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAnest)
                        .addGap(10, 10, 10)
                        .addComponent(rbtnAnSi)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnAnNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblYodo)
                        .addGap(37, 37, 37)
                        .addComponent(rbtnYSi)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnYNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lblAsp)
                        .addGap(20, 20, 20)
                        .addComponent(rbtnASi)
                        .addGap(18, 18, 18)
                        .addComponent(rbtnANo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel6)
                        .addGap(39, 39, 39)
                        .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(289, 289, 289)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblUlcera)
                        .addGap(75, 75, 75)
                        .addComponent(rbtnUgSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnUgNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblPAnti)
                        .addGap(13, 13, 13)
                        .addComponent(rbtnPAntSi)
                        .addGap(17, 17, 17)
                        .addComponent(rbtnPAntNo))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMRetro)
                            .addComponent(lblLim))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnLimSi)
                                .addGap(17, 17, 17)
                                .addComponent(rbtnLimNo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(rbtnMReSi)
                                .addGap(17, 17, 17)
                                .addComponent(rbtnMReNo)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblPen))
                    .addComponent(rbtnPSi)
                    .addComponent(rbtnPNo))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblAnest))
                    .addComponent(rbtnAnSi)
                    .addComponent(rbtnAnNo))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYodo)
                    .addComponent(rbtnYSi)
                    .addComponent(rbtnYNo))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblAsp)
                    .addComponent(rbtnASi)
                    .addComponent(rbtnANo))
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(txtOtro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPresion)
                            .addComponent(rbtnPreSi)
                            .addComponent(rbtnPreNo)
                            .addComponent(lblFieb)
                            .addComponent(rbtnFiebSi)
                            .addComponent(rbtnFiebNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSangre)
                            .addComponent(rbtnSangSi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnSangNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAsma)
                            .addComponent(rbtnAsmSi)
                            .addComponent(rbtnAsmNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPSang)
                            .addComponent(rbtnProbSi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnProbNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDiab)
                            .addComponent(rbtnDiabSi)
                            .addComponent(rbtnDiabNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblVih)
                            .addComponent(rbtnVihSi, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbtnVihNo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAft)
                            .addComponent(rbtnAftSi)
                            .addComponent(rbtnAftNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHep)
                            .addComponent(rbtnHepSi)
                            .addComponent(rbtnHepNo)
                            .addComponent(lblTiro)
                            .addComponent(rbtnTiroSi)
                            .addComponent(rbtnTiroNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEmb)
                            .addComponent(rbtnEmbSi)
                            .addComponent(rbtnEmbNo)
                            .addComponent(lblRuid)
                            .addComponent(rbtnRuiSi)
                            .addComponent(rbtnRuiNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEVen)
                            .addComponent(rbtnEVenSi)
                            .addComponent(rbtnEVenNo))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUlcera)
                            .addComponent(rbtnUgSi)
                            .addComponent(rbtnUgNo))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblPAnti))
                            .addComponent(rbtnPAntSi)
                            .addComponent(rbtnPAntNo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMRetro)
                            .addComponent(rbtnMReSi)
                            .addComponent(rbtnMReNo))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rbtnLimSi)
                            .addComponent(rbtnLimNo)))
                    .addComponent(lblLim))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        jmGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/if_save_32_51415.png"))); // NOI18N
        jmGuardar.setToolTipText("Guardar");
        jmGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmGuardarMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmGuardar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
String pen,anest,yodo,aspi,presion,sangreE,pSang,vih,hep,emb,eVen,ulcera,pAnticon,medRetro,lim,fiebre,asma,diab,aftas,tiroides,ruidos;
    private void getRbtn()throws ToothException{
        if(rbtnPSi.isSelected()){
            pen="Si";
        }else{
            if(rbtnPNo.isSelected()){
                pen="No";
            }else{
                lblPen.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnAnSi.isSelected()){
            anest="Si";
        }else{
            if(rbtnAnNo.isSelected()){
                anest="No";
            }else{
                lblAnest.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnYSi.isSelected()){
            yodo="Si";
        }else{
            if(rbtnYNo.isSelected()){
                yodo="No";
            }else{
                lblYodo.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnASi.isSelected()){
            aspi="Si";
        }else{
            if(rbtnANo.isSelected()){
                aspi="No";
            }else{
                lblAsp.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnPreSi.isSelected()){
            presion="Si";
        }else{
            if(rbtnPreNo.isSelected()){
                presion="No";
            }else{
                lblPresion.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnSangSi.isSelected()){
            sangreE="Si";
        }else{
            if(rbtnSangNo.isSelected()){
                sangreE="No";
            }else{
                lblSangre.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnProbSi.isSelected()){
            pSang="Si";
        }else{
            if(rbtnProbNo.isSelected()){
                pSang="No";
            }else{
                lblPSang.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnVihSi.isSelected()){
            vih="Si";
        }else{
            if(rbtnVihNo.isSelected()){
                vih="No";
            }else{
                lblVih.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnHepSi.isSelected()){
            hep="Si";
        }else{
            if(rbtnHepNo.isSelected()){
                hep="No";
            }else{
                lblHep.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnEmbSi.isSelected()){
            emb="Si";
        }else{
            if(rbtnEmbNo.isSelected()){
                emb="No";
            }else{
                lblEmb.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnEVenSi.isSelected()){
            eVen="Si";
        }else{
            if(rbtnEVenNo.isSelected()){
                 eVen="No";
            }else{
                lblEVen.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnUgSi.isSelected()){
            ulcera="Si";
        }else{
            if(rbtnUgNo.isSelected()){
                ulcera="No";
            }else{
                lblUlcera.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnPAntSi.isSelected()){
            pAnticon="Si";
        }else{
            if(rbtnPAntNo.isSelected()){
                pAnticon="No";
            }else{
                lblPAnti.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnMReSi.isSelected()){
            medRetro="Si";
        }else{
            if(rbtnMReNo.isSelected()){
                medRetro="No";
            }else{
                lblMRetro.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnLimSi.isSelected()){
            lim="Si";
        }else{
            if(rbtnLimNo.isSelected()){
                lim="No";
            }else{
                lblLim.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnFiebSi.isSelected()){
            fiebre="Si";
        }else{
            if(rbtnFiebNo.isSelected()){
                fiebre="No";
            }else{
                lblFieb.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnAsmSi.isSelected()){
            asma="Si";
        }else{
            if(rbtnAsmNo.isSelected()){
                asma="No";
            }else{
                lblAsma.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnDiabSi.isSelected()){
            diab="Si";
        }else{
            if(rbtnDiabNo.isSelected()){
                diab="No";
            }else{
                lblDiab.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnAftSi.isSelected()){
            aftas="Si";
        }else{
            if(rbtnAftNo.isSelected()){
                aftas="No";
            }else{
                lblAft.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnTiroSi.isSelected()){
            tiroides="Si";
        }else{
            if(rbtnTiroNo.isSelected()){
                tiroides="No";
            }else{
                lblTiro.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
        if(rbtnRuiSi.isSelected()){
            ruidos="Si";
        }else{
            if(rbtnRuiNo.isSelected()){
                ruidos="No";
            }else{
                lblRuid.setForeground(Color.red);
                throw new ToothException("Selecciona una opcion");
            }
        }
    }
    
    private void jmGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmGuardarMouseClicked
        //pen,anest,yodo,aspi,presion,sangreE,pSang,vih,hep,emb,eVen,ulcera,pAnticon,medRetro,lim,fiebre,asma,diab,aftas,tiroides,ruidos
        otro=txtOtro.getText();
        String cad="";
        try{
            validarRbtn();
            getRbtn();
            Statement stmt=cn.createStatement();
            cad="insert into HistorialClinico (idPaciente,Fecha,Tutor,FechaNacimiento,"
                    + "Odontologo,Antecedentes,Tension,Cirugias,Transfuciones,Motivo,"
                    + "Penicilina,Anestecia,Yodo,Aspirina,Otro,"
                    + "Altapresion,SangreExcesiva,ProblemasSanguineos,"
                    + "VIH,Hepatitis,Embarazo,EnfermedadesVenereas,UlceraGastrica,"
                    + "PastillasAnticonceptivas,MedicamentosRetroviales,LimitacionesBoca,"
                    + "FiebreReumatica,Asma,Diabetes,AftasRecurrentes,Tiroides,RuidosMandibula) "
                    + "values ("+id_paciente+",DateValue('"+fecha+"'),"+"'"+tutor+"',DateValue('"+fecha_nacimiento+"'),'"
                    +odontologo_tratante+"','"+antecedentes_familiares
                    +"','"+tension_arterial+"','"+cirugias+"','"+transfuciones_sangre+"','"+motivo_consulta+"','"+pen+"','"+anest+"','"+yodo+"','"+aspi+"','"
                    +otro+"','"+presion+"','"+sangreE+"','"+pSang+"','"+vih+"','"+hep+"','"+emb+"','"+eVen+"','"+ulcera+"','"
                    +pAnticon+"','"+medRetro+"','"+lim+"','"+fiebre+"','"+asma+"','"+diab+"','"+aftas+"','"+tiroides+"','"
                    +ruidos+"');";
            //showMessageDialog(this,cad);
            stmt.executeUpdate(cad);
            showMessageDialog(this,"Historial registrado");
            stmt.close(); 
            this.setVisible(false);
        }catch(SQLException ex){
            showMessageDialog(this,"Error al insertar");
        }catch(ToothException e){
            showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jmGuardarMouseClicked

    
    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void rbtnPSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPSiActionPerformed
        lblPen.setForeground(Color.black);
    }//GEN-LAST:event_rbtnPSiActionPerformed

    private void rbtnPNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPNoActionPerformed
        lblPen.setForeground(Color.black);
    }//GEN-LAST:event_rbtnPNoActionPerformed

    private void rbtnAnSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAnSiActionPerformed
        lblAnest.setForeground(Color.black);
    }//GEN-LAST:event_rbtnAnSiActionPerformed

    private void rbtnAnNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAnNoActionPerformed
        lblAnest.setForeground(Color.black);
    }//GEN-LAST:event_rbtnAnNoActionPerformed

    private void rbtnYSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnYSiActionPerformed
        lblYodo.setForeground(Color.black);
    }//GEN-LAST:event_rbtnYSiActionPerformed

    private void rbtnYNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnYNoActionPerformed
        lblYodo.setForeground(Color.black);
    }//GEN-LAST:event_rbtnYNoActionPerformed

    private void rbtnASiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnASiActionPerformed
        lblAsp.setForeground(Color.black);
    }//GEN-LAST:event_rbtnASiActionPerformed

    private void rbtnANoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnANoActionPerformed
        lblAsp.setForeground(Color.black);
    }//GEN-LAST:event_rbtnANoActionPerformed

    private void rbtnPreSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPreSiActionPerformed
        lblPresion.setForeground(Color.black);
    }//GEN-LAST:event_rbtnPreSiActionPerformed

    private void rbtnPreNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPreNoActionPerformed
        lblPresion.setForeground(Color.black);
    }//GEN-LAST:event_rbtnPreNoActionPerformed

    private void rbtnSangSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSangSiActionPerformed
        lblSangre.setForeground(Color.black);
    }//GEN-LAST:event_rbtnSangSiActionPerformed

    private void rbtnSangNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnSangNoActionPerformed
        lblSangre.setForeground(Color.black);
    }//GEN-LAST:event_rbtnSangNoActionPerformed

    private void rbtnProbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProbSiActionPerformed
        lblPSang.setForeground(Color.black);
    }//GEN-LAST:event_rbtnProbSiActionPerformed

    private void rbtnProbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnProbNoActionPerformed
        lblPSang.setForeground(Color.black);
    }//GEN-LAST:event_rbtnProbNoActionPerformed

    private void rbtnVihSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVihSiActionPerformed
        lblVih.setForeground(Color.black);
    }//GEN-LAST:event_rbtnVihSiActionPerformed

    private void rbtnVihNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnVihNoActionPerformed
        lblVih.setForeground(Color.black);
    }//GEN-LAST:event_rbtnVihNoActionPerformed

    private void rbtnHepSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHepSiActionPerformed
        lblHep.setForeground(Color.black);
    }//GEN-LAST:event_rbtnHepSiActionPerformed

    private void rbtnHepNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnHepNoActionPerformed
        lblHep.setForeground(Color.black);
    }//GEN-LAST:event_rbtnHepNoActionPerformed

    private void rbtnEmbSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEmbSiActionPerformed
        lblEmb.setForeground(Color.black);
    }//GEN-LAST:event_rbtnEmbSiActionPerformed

    private void rbtnEmbNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEmbNoActionPerformed
        lblEmb.setForeground(Color.black);
    }//GEN-LAST:event_rbtnEmbNoActionPerformed

    private void rbtnEVenSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEVenSiActionPerformed
        lblEVen.setForeground(Color.black);
    }//GEN-LAST:event_rbtnEVenSiActionPerformed

    private void rbtnEVenNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnEVenNoActionPerformed
        lblEVen.setForeground(Color.black);
    }//GEN-LAST:event_rbtnEVenNoActionPerformed

    private void rbtnUgSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnUgSiActionPerformed
        lblUlcera.setForeground(Color.black);
    }//GEN-LAST:event_rbtnUgSiActionPerformed

    private void rbtnUgNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnUgNoActionPerformed
        lblUlcera.setForeground(Color.black);
    }//GEN-LAST:event_rbtnUgNoActionPerformed

    private void rbtnPAntSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPAntSiActionPerformed
        lblPAnti.setForeground(Color.black);
    }//GEN-LAST:event_rbtnPAntSiActionPerformed

    private void rbtnPAntNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnPAntNoActionPerformed
        lblPAnti.setForeground(Color.black);
    }//GEN-LAST:event_rbtnPAntNoActionPerformed

    private void rbtnMReSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMReSiActionPerformed
        lblMRetro.setForeground(Color.black);
    }//GEN-LAST:event_rbtnMReSiActionPerformed

    private void rbtnMReNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnMReNoActionPerformed
        lblMRetro.setForeground(Color.black);
    }//GEN-LAST:event_rbtnMReNoActionPerformed

    private void rbtnLimSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLimSiActionPerformed
        lblLim.setForeground(Color.black);
    }//GEN-LAST:event_rbtnLimSiActionPerformed

    private void rbtnLimNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnLimNoActionPerformed
        lblLim.setForeground(Color.black);
    }//GEN-LAST:event_rbtnLimNoActionPerformed

    private void rbtnFiebSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFiebSiActionPerformed
        lblFieb.setForeground(Color.black);
    }//GEN-LAST:event_rbtnFiebSiActionPerformed

    private void rbtnFiebNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnFiebNoActionPerformed
        lblFieb.setForeground(Color.black);
    }//GEN-LAST:event_rbtnFiebNoActionPerformed

    private void rbtnAsmSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAsmSiActionPerformed
        lblAsma.setForeground(Color.black);
    }//GEN-LAST:event_rbtnAsmSiActionPerformed

    private void rbtnAsmNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAsmNoActionPerformed
        lblAsma.setForeground(Color.black);
    }//GEN-LAST:event_rbtnAsmNoActionPerformed

    private void rbtnDiabSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDiabSiActionPerformed
        lblDiab.setForeground(Color.black);
    }//GEN-LAST:event_rbtnDiabSiActionPerformed

    private void rbtnDiabNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDiabNoActionPerformed
        lblDiab.setForeground(Color.black);
    }//GEN-LAST:event_rbtnDiabNoActionPerformed

    private void rbtnAftSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAftSiActionPerformed
        lblAft.setForeground(Color.black);
    }//GEN-LAST:event_rbtnAftSiActionPerformed

    private void rbtnAftNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnAftNoActionPerformed
        lblAft.setForeground(Color.black);
    }//GEN-LAST:event_rbtnAftNoActionPerformed

    private void rbtnTiroSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTiroSiActionPerformed
        lblTiro.setForeground(Color.black);
    }//GEN-LAST:event_rbtnTiroSiActionPerformed

    private void rbtnTiroNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTiroNoActionPerformed
        lblTiro.setForeground(Color.black);
    }//GEN-LAST:event_rbtnTiroNoActionPerformed

    private void rbtnRuiSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRuiSiActionPerformed
        lblRuid.setForeground(Color.black);
    }//GEN-LAST:event_rbtnRuiSiActionPerformed

    private void rbtnRuiNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnRuiNoActionPerformed
        lblRuid.setForeground(Color.black);
    }//GEN-LAST:event_rbtnRuiNoActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        Object [] opciones ={"Aceptar","Cancelar"};
        int eleccion = showOptionDialog(rootPane,"¿Seguro que quieres salir?\nNo podras agregar el historial clinico despues.","Salir",YES_NO_OPTION,QUESTION_MESSAGE,null,opciones,"Aceptar");
        if (eleccion == YES_OPTION){
            this.dispose();
        }else{}
    }//GEN-LAST:event_formWindowClosing

    private void validarRbtn(){
        if(rbtnPSi.isSelected()==false&&rbtnPNo.isSelected()==false){
            lblPen.setForeground(Color.red);
        }
        if(rbtnAnSi.isSelected()==false&&rbtnAnNo.isSelected()==false){
            lblAnest.setForeground(Color.red);
        }
        if(rbtnYSi.isSelected()==false&&rbtnYNo.isSelected()==false){
            lblYodo.setForeground(Color.red);
        }
        if(rbtnASi.isSelected()==false&&rbtnANo.isSelected()==false){
            lblAsp.setForeground(Color.red);
        }
        if(rbtnPreSi.isSelected()==false&&rbtnPreNo.isSelected()==false){
            lblPresion.setForeground(Color.red);
        }
        if(rbtnSangSi.isSelected()==false&&rbtnSangNo.isSelected()==false){
            lblSangre.setForeground(Color.red);
        }
        if(rbtnProbSi.isSelected()==false&&rbtnProbNo.isSelected()==false){
            lblPSang.setForeground(Color.red);
        }
        if(rbtnVihSi.isSelected()==false&&rbtnVihNo.isSelected()==false){
            lblVih.setForeground(Color.red);
        }
        if(rbtnHepSi.isSelected()==false&&rbtnHepNo.isSelected()==false){
            lblHep.setForeground(Color.red);
        }
        if(rbtnEmbSi.isSelected()==false&&rbtnEmbNo.isSelected()==false){
            lblEmb.setForeground(Color.red);
        }
        if(rbtnEVenSi.isSelected()==false&&rbtnEVenNo.isSelected()==false){
            lblEVen.setForeground(Color.red);
        }
        if(rbtnUgSi.isSelected()==false&&rbtnUgNo.isSelected()==false){
            lblUlcera.setForeground(Color.red);
        }
        if(rbtnPAntSi.isSelected()==false&&rbtnPAntNo.isSelected()==false){
            lblPAnti.setForeground(Color.red);
        }
        if(rbtnMReSi.isSelected()==false&&rbtnMReNo.isSelected()==false){
            lblMRetro.setForeground(Color.red);
        }
        if(rbtnLimSi.isSelected()==false&&rbtnLimNo.isSelected()==false){
            lblLim.setForeground(Color.red);
        }
        if(rbtnFiebSi.isSelected()==false&&rbtnFiebNo.isSelected()==false){
            lblFieb.setForeground(Color.red);
        }
        if(rbtnAsmSi.isSelected()==false&&rbtnAsmNo.isSelected()==false){
            lblAsma.setForeground(Color.red);
        }
        if(rbtnDiabSi.isSelected()==false&&rbtnDiabNo.isSelected()==false){
            lblDiab.setForeground(Color.red);
        }
        if(rbtnAftSi.isSelected()==false&&rbtnAftNo.isSelected()==false){
            lblAft.setForeground(Color.red);
        }
        if(rbtnTiroSi.isSelected()==false&&rbtnTiroNo.isSelected()==false){
            lblTiro.setForeground(Color.red);
        }
        if(rbtnRuiSi.isSelected()==false&&rbtnRuiNo.isSelected()==false){
            lblRuid.setForeground(Color.red);
        }
    }
    
    private java.sql.Connection cn;
    int id_paciente;
    String fecha,tutor,otro;
    String fecha_nacimiento,odontologo_tratante,antecedentes_familiares,tension_arterial,cirugias,transfuciones_sangre,motivo_consulta;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btngAftas;
    private javax.swing.ButtonGroup btngAnestecia;
    private javax.swing.ButtonGroup btngAsma;
    private javax.swing.ButtonGroup btngAspirina;
    private javax.swing.ButtonGroup btngCMRetroviales;
    private javax.swing.ButtonGroup btngCPAntic;
    private javax.swing.ButtonGroup btngDiabetes;
    private javax.swing.ButtonGroup btngEVenereas;
    private javax.swing.ButtonGroup btngEmbarazo;
    private javax.swing.ButtonGroup btngFiebre;
    private javax.swing.ButtonGroup btngHepatitis;
    private javax.swing.ButtonGroup btngLimitaciones;
    private javax.swing.ButtonGroup btngPSanguineos;
    private javax.swing.ButtonGroup btngPenicilina;
    private javax.swing.ButtonGroup btngPresion;
    private javax.swing.ButtonGroup btngRuidos;
    private javax.swing.ButtonGroup btngSangreExcesiva;
    private javax.swing.ButtonGroup btngTiroides;
    private javax.swing.ButtonGroup btngUlceraG;
    private javax.swing.ButtonGroup btngVIH;
    private javax.swing.ButtonGroup btngYodo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenu jmGuardar;
    private javax.swing.JLabel lblAft;
    private javax.swing.JLabel lblAnest;
    private javax.swing.JLabel lblAsma;
    private javax.swing.JLabel lblAsp;
    private javax.swing.JLabel lblDiab;
    private javax.swing.JLabel lblEVen;
    private javax.swing.JLabel lblEmb;
    private javax.swing.JLabel lblFieb;
    private javax.swing.JLabel lblHep;
    private javax.swing.JLabel lblLim;
    private javax.swing.JLabel lblMRetro;
    private javax.swing.JLabel lblPAnti;
    private javax.swing.JLabel lblPSang;
    private javax.swing.JLabel lblPen;
    private javax.swing.JLabel lblPresion;
    private javax.swing.JLabel lblRuid;
    private javax.swing.JLabel lblSangre;
    private javax.swing.JLabel lblTiro;
    private javax.swing.JLabel lblUlcera;
    private javax.swing.JLabel lblVih;
    private javax.swing.JLabel lblYodo;
    private javax.swing.JRadioButton rbtnANo;
    private javax.swing.JRadioButton rbtnASi;
    private javax.swing.JRadioButton rbtnAftNo;
    private javax.swing.JRadioButton rbtnAftSi;
    private javax.swing.JRadioButton rbtnAnNo;
    private javax.swing.JRadioButton rbtnAnSi;
    private javax.swing.JRadioButton rbtnAsmNo;
    private javax.swing.JRadioButton rbtnAsmSi;
    private javax.swing.JRadioButton rbtnDiabNo;
    private javax.swing.JRadioButton rbtnDiabSi;
    private javax.swing.JRadioButton rbtnEVenNo;
    private javax.swing.JRadioButton rbtnEVenSi;
    private javax.swing.JRadioButton rbtnEmbNo;
    private javax.swing.JRadioButton rbtnEmbSi;
    private javax.swing.JRadioButton rbtnFiebNo;
    private javax.swing.JRadioButton rbtnFiebSi;
    private javax.swing.JRadioButton rbtnHepNo;
    private javax.swing.JRadioButton rbtnHepSi;
    private javax.swing.JRadioButton rbtnLimNo;
    private javax.swing.JRadioButton rbtnLimSi;
    private javax.swing.JRadioButton rbtnMReNo;
    private javax.swing.JRadioButton rbtnMReSi;
    private javax.swing.JRadioButton rbtnPAntNo;
    private javax.swing.JRadioButton rbtnPAntSi;
    private javax.swing.JRadioButton rbtnPNo;
    private javax.swing.JRadioButton rbtnPSi;
    private javax.swing.JRadioButton rbtnPreNo;
    private javax.swing.JRadioButton rbtnPreSi;
    private javax.swing.JRadioButton rbtnProbNo;
    private javax.swing.JRadioButton rbtnProbSi;
    private javax.swing.JRadioButton rbtnRuiNo;
    private javax.swing.JRadioButton rbtnRuiSi;
    private javax.swing.JRadioButton rbtnSangNo;
    private javax.swing.JRadioButton rbtnSangSi;
    private javax.swing.JRadioButton rbtnTiroNo;
    private javax.swing.JRadioButton rbtnTiroSi;
    private javax.swing.JRadioButton rbtnUgNo;
    private javax.swing.JRadioButton rbtnUgSi;
    private javax.swing.JRadioButton rbtnVihNo;
    private javax.swing.JRadioButton rbtnVihSi;
    private javax.swing.JRadioButton rbtnYNo;
    private javax.swing.JRadioButton rbtnYSi;
    private javax.swing.JTextField txtOtro;
    // End of variables declaration//GEN-END:variables
}
