/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOViews;

import DAOConection.Conexao;
import DAOControl.Utilitarios;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.Timer;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
/**
 *
 * @author Nolasco Dos Anjos
 */
public class TelaMenu extends javax.swing.JFrame {

    Conexao con = new Conexao();
    
    int width = (Toolkit.getDefaultToolkit().getScreenSize().width /2) - 289;
    int xMouse, yMouse;
     
    public TelaMenu() {
        initComponents();
        Utilitarios u = new Utilitarios();
        u.InsererIcone(this);
        con.conexao();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlblPanelControl = new javax.swing.JLabel();
        jPanelBackground = new javax.swing.JPanel();
        jPanelTime = new javax.swing.JPanel();
        jLabelData = new javax.swing.JLabel();
        jLabelHora = new javax.swing.JLabel();
        jlUsuario1 = new javax.swing.JLabel();
        jlNomeUsuario = new javax.swing.JLabel();
        jPanelPesquisa = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabelMinimizar = new javax.swing.JLabel();
        DeskInicial = new javax.swing.JDesktopPane();
        jLabelImgFundoAT = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuFunc = new javax.swing.JMenuItem();
        menUser = new javax.swing.JMenuItem();
        menuLivro = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuPerfil = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        menuEmprestimo = new javax.swing.JMenuItem();
        menuDevolucao = new javax.swing.JMenuItem();
        menuReserva = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuLeitura = new javax.swing.JMenuItem();
        menuPc = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuRelatorio = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        menuSobre = new javax.swing.JMenuItem();
        jMenu9 = new javax.swing.JMenu();
        jmTerminar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelBackground.setBackground(new java.awt.Color(255, 153, 0));
        jPanelBackground.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanelBackground.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelBackground.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanelBackgroundMouseDragged(evt);
            }
        });
        jPanelBackground.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelTime.setBackground(new java.awt.Color(0, 153, 255));
        jPanelTime.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelData.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelData.setForeground(new java.awt.Color(255, 255, 255));
        jLabelData.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Calendar_48px.png"))); // NOI18N
        jLabelData.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelTime.add(jLabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 10, 160, 40));

        jLabelHora.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelHora.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Watch_48px.png"))); // NOI18N
        jLabelHora.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanelTime.add(jLabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 10, 160, 40));

        jlUsuario1.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jlUsuario1.setForeground(new java.awt.Color(255, 255, 255));
        jlUsuario1.setText("Bem-Vindo!");
        jPanelTime.add(jlUsuario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, 30));

        jlNomeUsuario.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jlNomeUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jPanelTime.add(jlNomeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 240, 30));

        jPanelBackground.add(jPanelTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 570, 1220, 60));

        jPanelPesquisa.setBackground(new java.awt.Color(0, 153, 255));
        jPanelPesquisa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Search_48px.png"))); // NOI18N
        jLabel2.setToolTipText("Procurar");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanelPesquisa.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 0, 60, 50));

        jTextField1.setBackground(new java.awt.Color(0, 153, 255));
        jTextField1.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setBorder(null);
        jPanelPesquisa.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 340, 30));
        jPanelPesquisa.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 40, 390, 10));

        jLabelMinimizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Expand Arrow_24px.png"))); // NOI18N
        jLabelMinimizar.setToolTipText("Minimizar");
        jLabelMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMinimizarMouseClicked(evt);
            }
        });
        jPanelPesquisa.add(jLabelMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 10, 30, 30));

        jPanelBackground.add(jPanelPesquisa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1230, 50));

        DeskInicial.setBackground(new java.awt.Color(255, 153, 0));
        DeskInicial.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelImgFundoAT.setForeground(new java.awt.Color(255, 255, 255));
        jLabelImgFundoAT.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImgFundoAT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imag/Maravilha.jpeg"))); // NOI18N
        DeskInicial.add(jLabelImgFundoAT, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 520));

        jPanelBackground.add(DeskInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 1220, 520));

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 255));

        jMenu1.setBackground(new java.awt.Color(255, 255, 255));
        jMenu1.setBorder(null);
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Add User Group Woman Man_40px.png"))); // NOI18N
        jMenu1.setText("Cadastro");

        menuFunc.setBackground(new java.awt.Color(255, 255, 255));
        menuFunc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-user-avatar-18.png"))); // NOI18N
        menuFunc.setText("Funcionário");
        menuFunc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuFuncActionPerformed(evt);
            }
        });
        jMenu1.add(menuFunc);

        menUser.setBackground(new java.awt.Color(255, 255, 255));
        menUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/User Group Man Woman_48px.png"))); // NOI18N
        menUser.setText("Usuários");
        menUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menUserActionPerformed(evt);
            }
        });
        jMenu1.add(menUser);

        menuLivro.setBackground(new java.awt.Color(255, 255, 255));
        menuLivro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Books_48px_1.png"))); // NOI18N
        menuLivro.setText("Livros");
        menuLivro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLivroActionPerformed(evt);
            }
        });
        jMenu1.add(menuLivro);

        jMenuBar1.add(jMenu1);

        jMenu6.setBackground(new java.awt.Color(255, 255, 255));
        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-user-avatar-18.png"))); // NOI18N
        jMenu6.setText("Perfil");

        menuPerfil.setBackground(new java.awt.Color(255, 255, 255));
        menuPerfil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/icons8-user-avatar-18.png"))); // NOI18N
        menuPerfil.setText("Meu Perfil");
        menuPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPerfilActionPerformed(evt);
            }
        });
        jMenu6.add(menuPerfil);

        jMenuBar1.add(jMenu6);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Shopping Cart_48px.png"))); // NOI18N
        jMenu2.setText("Movimentos");

        menuEmprestimo.setBackground(new java.awt.Color(255, 255, 255));
        menuEmprestimo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Return Book_48px.png"))); // NOI18N
        menuEmprestimo.setText("Emprestimos");
        menuEmprestimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEmprestimoActionPerformed(evt);
            }
        });
        jMenu2.add(menuEmprestimo);

        menuDevolucao.setBackground(new java.awt.Color(255, 255, 255));
        menuDevolucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Borrow Book_48px.png"))); // NOI18N
        menuDevolucao.setText("Devolvidos");
        menuDevolucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuDevolucaoActionPerformed(evt);
            }
        });
        jMenu2.add(menuDevolucao);

        menuReserva.setBackground(new java.awt.Color(255, 255, 255));
        menuReserva.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/School_40px.png"))); // NOI18N
        menuReserva.setText("Reservas");
        menuReserva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuReservaActionPerformed(evt);
            }
        });
        jMenu2.add(menuReserva);

        jMenuItem11.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Health Book_48px.png"))); // NOI18N
        jMenuItem11.setText("Aquisição");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem11);

        jMenuItem12.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Edit File_40px.png"))); // NOI18N
        jMenuItem12.setText("Assinaturas");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem12);

        jMenuItem13.setBackground(new java.awt.Color(255, 255, 255));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Advertising_48px.png"))); // NOI18N
        jMenuItem13.setText("Sugestões");
        jMenu2.add(jMenuItem13);

        jMenuBar1.add(jMenu2);

        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Assistant_40px.png"))); // NOI18N
        jMenu3.setText("Serviços");

        menuLeitura.setBackground(new java.awt.Color(255, 255, 255));
        menuLeitura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Reading Ebook_48px.png"))); // NOI18N
        menuLeitura.setText("Leituras");
        menuLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLeituraActionPerformed(evt);
            }
        });
        jMenu3.add(menuLeitura);

        menuPc.setBackground(new java.awt.Color(255, 255, 255));
        menuPc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Under Computer_48px.png"))); // NOI18N
        menuPc.setText("PC");
        menuPc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPcActionPerformed(evt);
            }
        });
        jMenu3.add(menuPc);

        jMenuBar1.add(jMenu3);

        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Open Folder_40px.png"))); // NOI18N
        jMenu4.setText("Relatórios");

        menuRelatorio.setBackground(new java.awt.Color(255, 255, 255));
        menuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/File_48px.png"))); // NOI18N
        menuRelatorio.setText("Relatórios");
        menuRelatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuRelatorioActionPerformed(evt);
            }
        });
        jMenu4.add(menuRelatorio);

        jMenuBar1.add(jMenu4);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Services_48px.png"))); // NOI18N
        jMenu5.setText("Configuração");
        jMenuBar1.add(jMenu5);

        jMenu7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Help_48px.png"))); // NOI18N
        jMenu7.setText("Ajuda");
        jMenuBar1.add(jMenu7);

        jMenu8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Info_48px.png"))); // NOI18N
        jMenu8.setText("Sobre");

        menuSobre.setBackground(new java.awt.Color(255, 255, 255));
        menuSobre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Info_48px.png"))); // NOI18N
        menuSobre.setText("Sobre");
        menuSobre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuSobreActionPerformed(evt);
            }
        });
        jMenu8.add(menuSobre);

        jMenuBar1.add(jMenu8);

        jMenu9.setBackground(new java.awt.Color(255, 255, 255));
        jMenu9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Close Window_48px_2.png"))); // NOI18N
        jMenu9.setText("Sair");

        jmTerminar.setBackground(new java.awt.Color(255, 255, 255));
        jmTerminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/Circled Left 2_48px.png"))); // NOI18N
        jmTerminar.setText("Terminar Sessão");
        jmTerminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmTerminarActionPerformed(evt);
            }
        });
        jMenu9.add(jmTerminar);

        jMenuBar1.add(jMenu9);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanelBackground, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1215, 659));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        //this.setExtendedState(MAXIMIZED_BOTH);
        //Pegando a data no sistema:
        Date date = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        jLabelData.setText(formato.format(date));
        
       //Código para mostrar hora no sistema:
        Timer time = new Timer(1000, new hora());
        time.start();
    }//GEN-LAST:event_formWindowOpened

    private void jLabelMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMinimizarMouseClicked
        // Aqui está o código para minimizar a tela do ambiente de trabalho:
        setState(TelaMenu.ICONIFIED);
    }//GEN-LAST:event_jLabelMinimizarMouseClicked
 int position;
    private void jPanelBackgroundMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBackgroundMouseDragged
        //Método para fazer movimentar o menu em qualquer parte da tela:
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_jPanelBackgroundMouseDragged

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem11ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jmTerminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmTerminarActionPerformed
        // TODO add your handling code here:
        TelaLogin tl = new TelaLogin();
        tl.setVisible(true);
        this.dispose();
        con.desconectar();
    }//GEN-LAST:event_jmTerminarActionPerformed

    private void menuFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuFuncActionPerformed
        // Adicionando a tela cadastro funcionário na tela;
      TelaFunc tf = new TelaFunc();
      tf.setVisible(true);
    }//GEN-LAST:event_menuFuncActionPerformed

    private void menUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menUserActionPerformed
        // Codificando a tela usuario
        TelaUser ts = new TelaUser();
        ts.setVisible(true);
    }//GEN-LAST:event_menUserActionPerformed

    private void menuLivroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLivroActionPerformed
        // Código do livro:
        TelaLivro tl = new TelaLivro();
        tl.setVisible(true);
    }//GEN-LAST:event_menuLivroActionPerformed

    private void menuLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLeituraActionPerformed
        // Código da tela leitura
        TelaLeitura tl = new TelaLeitura();
        tl.setVisible(true);
    }//GEN-LAST:event_menuLeituraActionPerformed

    private void menuPcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPcActionPerformed
        // Menu Pc:
        TelaPc tpc = new TelaPc();
        tpc.setVisible(true);
    }//GEN-LAST:event_menuPcActionPerformed

    private void menuRelatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuRelatorioActionPerformed
        // TODO add your handling code here:
        TelaRelatorio tr = new TelaRelatorio();
        tr.setVisible(true);
    }//GEN-LAST:event_menuRelatorioActionPerformed

    private void menuEmprestimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEmprestimoActionPerformed
        // TODO add your handling code here:
        TelaEmprestimo te = new TelaEmprestimo();
        te.setVisible(true);
    }//GEN-LAST:event_menuEmprestimoActionPerformed

    private void menuDevolucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuDevolucaoActionPerformed
        // TODO add your handling code here:
        TelaDevolucao td = new TelaDevolucao();
        td.setVisible(true);
    }//GEN-LAST:event_menuDevolucaoActionPerformed

    private void menuReservaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuReservaActionPerformed
        // TODO add your handling code here:
        TelaReserva tr = new TelaReserva();
        tr.setVisible(true);
    }//GEN-LAST:event_menuReservaActionPerformed

    private void menuSobreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuSobreActionPerformed
        // TODO add your handling code here:
        TelaSobre ts = new TelaSobre();
        ts.setVisible(true);
    }//GEN-LAST:event_menuSobreActionPerformed

    private void menuPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPerfilActionPerformed
        // TODO add your handling code here:
        TelaPerfil tp = new TelaPerfil();
        tp.setVisible(true);
    }//GEN-LAST:event_menuPerfilActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DeskInicial;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelData;
    private javax.swing.JLabel jLabelHora;
    private javax.swing.JLabel jLabelImgFundoAT;
    private javax.swing.JLabel jLabelMinimizar;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JPanel jPanelBackground;
    private javax.swing.JPanel jPanelPesquisa;
    private javax.swing.JPanel jPanelTime;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    public javax.swing.JLabel jlNomeUsuario;
    private javax.swing.JLabel jlUsuario1;
    private javax.swing.JLabel jlblPanelControl;
    private javax.swing.JMenuItem jmTerminar;
    private javax.swing.JMenuItem menUser;
    private javax.swing.JMenuItem menuDevolucao;
    private javax.swing.JMenuItem menuEmprestimo;
    private javax.swing.JMenuItem menuFunc;
    private javax.swing.JMenuItem menuLeitura;
    private javax.swing.JMenuItem menuLivro;
    private javax.swing.JMenuItem menuPc;
    private javax.swing.JMenuItem menuPerfil;
    private javax.swing.JMenuItem menuRelatorio;
    private javax.swing.JMenuItem menuReserva;
    private javax.swing.JMenuItem menuSobre;
    // End of variables declaration//GEN-END:variables
//Método responsável para mostrar a hora na tela.
class hora implements ActionListener{
    @Override
    public void actionPerformed (ActionEvent e){
        Calendar now = Calendar.getInstance();
        jLabelHora.setText(String.format("%1$tH:%1$tM:%1$tS", now));
    }
}
}