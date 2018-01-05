/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prog;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
public class Principal extends javax.swing.JFrame {

    DefaultListModel lista = new DefaultListModel();
    
    public Principal() {
        initComponents();
        menu1.setVisible(true);
        pesq.setVisible(false);
        pcad.setVisible(false);
        dcad.setVisible(false);
        palt.setVisible(false);
        pnovo.setVisible(false);
        //paltd5.setVisible(false);
    }


    @SuppressWarnings("unchecked")
    
         ArrayList <Cadastrar> cad = new ArrayList();
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        menu1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        pcad = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cdia = new javax.swing.JSpinner();
        cmes = new javax.swing.JSpinner();
        cano = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ctelefone = new javax.swing.JTextField();
        ccpf = new javax.swing.JTextField();
        cnome = new javax.swing.JTextField();
        pesq = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        pnome = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        pnovo = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        pn = new javax.swing.JTextField();
        pt = new javax.swing.JTextField();
        pna = new javax.swing.JTextField();
        pc = new javax.swing.JTextField();
        dcad = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mostraLista = new javax.swing.JList<>();
        jButton6 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        qt = new javax.swing.JLabel();
        palt = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        altnome = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        paltd5 = new javax.swing.JPanel();
        salv5 = new javax.swing.JLabel();
        ptel5 = new javax.swing.JTextField();
        pnom5 = new javax.swing.JTextField();
        pcp5 = new javax.swing.JTextField();
        ptel6 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();

        jLabel13.setText("jLabel13");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        menu1.setBackground(new java.awt.Color(0, 104, 104));
        menu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        menu1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setText("Sair");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        menu1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ter.gif"))); // NOI18N
        menu1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 150, 130));

        jLabel4.setFont(new java.awt.Font("Vijaya", 0, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Banco de Dados");
        menu1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(78, 23, 340, 50));

        jButton12.setText("Cadastrar");
        jButton12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton12ActionPerformed(evt);
            }
        });
        menu1.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 150, 60));

        jButton13.setText("Procurar");
        jButton13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton13ActionPerformed(evt);
            }
        });
        menu1.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 150, 60));

        jButton14.setText("Alterar");
        jButton14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton14ActionPerformed(evt);
            }
        });
        menu1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 150, 60));

        jButton15.setText("Dados Cadastrados");
        jButton15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton15ActionPerformed(evt);
            }
        });
        menu1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 150, 60));

        getContentPane().add(menu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        pcad.setBackground(new java.awt.Color(0, 104, 104));

        jLabel1.setFont(new java.awt.Font("Vijaya", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastro");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/ezgif.com-resize.png"))); // NOI18N

        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Enviar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nome");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Tel");

        cdia.setModel(new javax.swing.SpinnerNumberModel(1, 1, 31, 1));

        cmes.setModel(new javax.swing.SpinnerNumberModel(1, 1, 12, 1));

        cano.setModel(new javax.swing.SpinnerNumberModel(2016, 1900, 2100, 1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nascimento");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Cpf");

        ctelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctelefoneActionPerformed(evt);
            }
        });

        ccpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ccpfActionPerformed(evt);
            }
        });

        cnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cnomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pcadLayout = new javax.swing.GroupLayout(pcad);
        pcad.setLayout(pcadLayout);
        pcadLayout.setHorizontalGroup(
            pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcadLayout.createSequentialGroup()
                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcadLayout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pcadLayout.createSequentialGroup()
                                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ctelefone, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE)
                                    .addComponent(cnome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pcadLayout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pcadLayout.createSequentialGroup()
                                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pcadLayout.createSequentialGroup()
                                        .addComponent(cdia, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cmes, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(cano, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(ccpf, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 142, Short.MAX_VALUE))))
                    .addGroup(pcadLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pcadLayout.setVerticalGroup(
            pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pcadLayout.createSequentialGroup()
                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pcadLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel1)
                        .addGap(29, 29, 29)
                        .addComponent(cnome, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pcadLayout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(jLabel5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pcadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)))
                .addGap(18, 18, 18)
                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(ctelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdia, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmes, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cano, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(37, 37, 37)
                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ccpf, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(36, 36, 36)
                .addGroup(pcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        getContentPane().add(pcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 450));

        pesq.setBackground(new java.awt.Color(0, 104, 104));
        pesq.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Vijaya", 0, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Pesquisar");
        pesq.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 180, 40));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/busca.png"))); // NOI18N
        pesq.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 0, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nome");
        pesq.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, -1, 30));
        pesq.add(pnome, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 220, 30));

        jButton4.setText("Voltar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        pesq.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 210, 130, 50));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/p.png"))); // NOI18N
        jButton5.setText("Procurar");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        pesq.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 130, 50));

        pnovo.setBackground(new java.awt.Color(204, 204, 204));
        pnovo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setForeground(new java.awt.Color(255, 51, 255));
        jLabel14.setText("Telefone");

        jLabel15.setForeground(new java.awt.Color(255, 51, 255));
        jLabel15.setText("Nome");

        jLabel16.setForeground(new java.awt.Color(255, 51, 255));
        jLabel16.setText("Nascimento");

        jLabel17.setForeground(new java.awt.Color(255, 51, 255));
        jLabel17.setText("Cpf");

        pt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnovoLayout = new javax.swing.GroupLayout(pnovo);
        pnovo.setLayout(pnovoLayout);
        pnovoLayout.setHorizontalGroup(
            pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnovoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(27, 27, 27)
                .addGroup(pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pna, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        pnovoLayout.setVerticalGroup(
            pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnovoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(pn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(pt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(pna, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnovoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(pc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pesq.add(pnovo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 300, 340, 150));

        getContentPane().add(pesq, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        dcad.setBackground(new java.awt.Color(0, 104, 104));

        jLabel12.setFont(new java.awt.Font("Vijaya", 0, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Dados Cadastrados");

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/cad.png"))); // NOI18N

        mostraLista.setModel(lista);
        jScrollPane1.setViewportView(mostraLista);

        jButton6.setText("Voltar");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Total");

        qt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        qt.setForeground(new java.awt.Color(255, 0, 51));
        qt.setText("0");

        javax.swing.GroupLayout dcadLayout = new javax.swing.GroupLayout(dcad);
        dcad.setLayout(dcadLayout);
        dcadLayout.setHorizontalGroup(
            dcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dcadLayout.createSequentialGroup()
                .addGroup(dcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dcadLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, dcadLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)
                        .addGap(14, 14, 14)))
                .addGroup(dcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dcadLayout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(qt)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(dcadLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))))
            .addGroup(dcadLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        dcadLayout.setVerticalGroup(
            dcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dcadLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(dcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dcadLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addGroup(dcadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(qt)))
                    .addGroup(dcadLayout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(dcad, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        palt.setBackground(new java.awt.Color(0, 104, 104));

        jLabel21.setFont(new java.awt.Font("Vijaya", 0, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Alterar");

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/alt.png"))); // NOI18N

        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Nome");

        altnome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altnomeActionPerformed(evt);
            }
        });

        jButton7.setText("Voltar");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Buscar ");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        paltd5.setBackground(new java.awt.Color(135, 200, 200));

        salv5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bs.png"))); // NOI18N
        salv5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel28MouseClicked(evt);
            }
        });

        pcp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pcp5ActionPerformed(evt);
            }
        });

        ptel6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ptel6ActionPerformed(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Nome");

        jLabel48.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("Telefone");

        jLabel49.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("Nascimento");

        jLabel50.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("Cpf");

        javax.swing.GroupLayout paltd5Layout = new javax.swing.GroupLayout(paltd5);
        paltd5.setLayout(paltd5Layout);
        paltd5Layout.setHorizontalGroup(
            paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paltd5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pcp5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnom5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ptel6, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(69, 69, 69)
                .addComponent(salv5)
                .addGap(35, 35, 35))
        );
        paltd5Layout.setVerticalGroup(
            paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paltd5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pnom5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel48))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ptel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel49))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(paltd5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(paltd5Layout.createSequentialGroup()
                        .addComponent(pcp5)
                        .addGap(3, 3, 3)))
                .addGap(31, 31, 31))
            .addGroup(paltd5Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(salv5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout paltLayout = new javax.swing.GroupLayout(palt);
        palt.setLayout(paltLayout);
        paltLayout.setHorizontalGroup(
            paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paltLayout.createSequentialGroup()
                .addGroup(paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paltLayout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addComponent(jLabel23)
                        .addGap(18, 18, 18)
                        .addComponent(altnome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(paltLayout.createSequentialGroup()
                        .addGroup(paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paltLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paltLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(paltLayout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(paltLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel22))))
                    .addGroup(paltLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(paltd5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        paltLayout.setVerticalGroup(
            paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paltLayout.createSequentialGroup()
                .addGroup(paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(paltLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel22))
                .addGap(18, 18, 18)
                .addGroup(paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altnome, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(paltLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(paltd5, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        getContentPane().add(palt, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
   
    
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton12ActionPerformed
        menu1.setVisible(false);
        pcad.setVisible(true);
     
    }//GEN-LAST:event_jButton12ActionPerformed

    private void ctelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ctelefoneActionPerformed
int qtd=0;
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Cadastro efetuado com sucesso!","Cadastro",JOptionPane.INFORMATION_MESSAGE);
        Cadastrar pessoa = new Cadastrar();
        String dado,d,m,a;
      
        dado = cnome.getText();
        lista.addElement("Nome: "+dado);
        pessoa.setNom(dado);
        
        
        
        dado = ctelefone.getText();
        lista.addElement("Telefone: "+dado);
        pessoa.setT(dado);
        
        d =Integer.toString((int) cdia.getValue()); 
        m =Integer.toString((int) cmes.getValue());
        a =Integer.toString((int) cano.getValue());
        lista.addElement("Nascimento: "+d+"/"+m+"/"+a);
        pessoa.setNasc(d+m+a);
        
        dado = ccpf.getText();
        lista.addElement("Cpf: "+dado);
        pessoa.setCp(dado);
        cad.add(pessoa);
        lista.addElement("___________________");
        qtd++;
        qt.setText(Integer.toString(qtd));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ccpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ccpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ccpfActionPerformed

    private void cnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cnomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           pcad.setVisible(false);
           menu1.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptActionPerformed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String n;
       int achou=0;
        int a=qtd+1;
         n = pnome.getText();
       if(qtd != 0){
           while(a != 0){
                for(Cadastrar d : cad){
                    if(d.getNom().equalsIgnoreCase(n)){
                    pnovo.setVisible(true);
                    pn.setText(d.getNom());
                    pt.setText(d.getT());
                    pna.setText(d.getNasc());
                    pc.setText(d.getCp());
                    pnome.setText(null);
                    achou++;
                }
            }
                if(achou==1){
                    break;
                }else{
                     a--;
                }
        }
        if(a==0){
            JOptionPane.showMessageDialog(null,"Nome não encontrado!","Buscar",JOptionPane.ERROR_MESSAGE);
        }
      }else{
           JOptionPane.showMessageDialog(null,"Lista vazia!","Alerta",JOptionPane.ERROR_MESSAGE);
       }
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton13ActionPerformed
        menu1.setVisible(false);
        pesq.setVisible(true);

    }//GEN-LAST:event_jButton13ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        pesq.setVisible(false);
        menu1.setVisible(true);

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         menu1.setVisible(true);
        dcad.setVisible(false);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton15ActionPerformed
        menu1.setVisible(false);
        dcad.setVisible(true);


    }//GEN-LAST:event_jButton15ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
            System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void altnomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altnomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altnomeActionPerformed

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton14ActionPerformed
           menu1.setVisible(false);
           palt.setVisible(true);
    }//GEN-LAST:event_jButton14ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        
        menu1.setVisible(true);
        palt.setVisible(false);
        //paltd5.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed
int a;
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        String n;
        int achou=0;
        n = altnome.getText();
        for(Cadastrar d : cad){
            if(d.getNom().equalsIgnoreCase(n)){
                JOptionPane.showMessageDialog(null,"Nome encontrado,digite no quadro a baixo os novos dados!","Alteração de cadastro",JOptionPane.INFORMATION_MESSAGE);
                achou++;
                paltd5.setVisible(true);
            }
        }
        if(achou==0){
            JOptionPane.showMessageDialog(null,"Nome não encontrado!","Alteração de cadastro",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jLabel28MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel28MouseClicked
       String n;
       
       n = pnom5.getText();
          
        
        JOptionPane.showMessageDialog(null,"Cadastro alterado com sucesso!","Alteração de cadastro",JOptionPane.INFORMATION_MESSAGE);


    }//GEN-LAST:event_jLabel28MouseClicked

    private void pcp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pcp5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pcp5ActionPerformed

    private void ptel6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ptel6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ptel6ActionPerformed

    /**
     * @param args the command line arguments
     */

    /**
     *
     * @param arg
     * @param args the command line arguments
     */
      public static void main(String args[]){
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField altnome;
    private javax.swing.JSpinner cano;
    private javax.swing.JTextField ccpf;
    private javax.swing.JSpinner cdia;
    private javax.swing.JSpinner cmes;
    private javax.swing.JTextField cnome;
    private javax.swing.JTextField ctelefone;
    private javax.swing.JPanel dcad;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menu1;
    private javax.swing.JList<String> mostraLista;
    private javax.swing.JPanel palt;
    private javax.swing.JPanel paltd5;
    private javax.swing.JTextField pc;
    private javax.swing.JPanel pcad;
    private javax.swing.JTextField pcp5;
    private javax.swing.JPanel pesq;
    private javax.swing.JTextField pn;
    private javax.swing.JTextField pna;
    private javax.swing.JTextField pnom5;
    private javax.swing.JTextField pnome;
    private javax.swing.JPanel pnovo;
    private javax.swing.JTextField pt;
    private javax.swing.JTextField ptel5;
    private javax.swing.JTextField ptel6;
    private javax.swing.JLabel qt;
    private javax.swing.JLabel salv5;
    // End of variables declaration//GEN-END:variables
}
