package vista;

import estructuras.Arte;
import estructuras.Persistencia;
import java.awt.Image;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import java.awt.Graphics;
public class PanelPrincipal extends javax.swing.JFrame {
    
    
    
    
    public PanelPrincipal() {
        p.setupLer();
        if (p.getContinua() == true) {
            p.readRecords();
            p.cleanupLer();
            cad = p.getCad();
        }
        initComponents();
        this.setIconImage(new ImageIcon("src/imagens/museu.png").getImage());
        this.setLocationRelativeTo(null);
    }
    
    private boolean existe_na_lista(int tomb) {
        for (Arte a : cad) {
            if (a.getTombo() == tomb) {
                return true;
            }
        }
        return false;
    }
     private void bem_vindo_vazio(){
         // Criando um objeto do tipo ImageIcon e pegando o caminho no projeto
         // aonde está a imagem que será mudada.
        ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/imagem_vazia.png"));
         // Criando um objeto do tipo Image que recebe a imagem do icone com a largura e altura do Label do Bem Vindo
         // com o objetivo de dimensioná-la e deixar preparada para ser jogada no Label.
        Image imagem = icone.getImage().getScaledInstance(jLabel1.getWidth(), jLabel1.getHeight(), Image.SCALE_DEFAULT);
         // Mudando o icone do Label do Bem Vindo para a imagem recém dimensionada.
        jLabel1.setIcon(new ImageIcon(imagem));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelPrincipal = new javax.swing.JDesktopPane();
        // Instanciação de um objeto do tipo ImageIcon aonde no construtor está
        // sendo pego como parâmetro o local nos packages onde está a Tela de
        // Fundo.
        ImageIcon icone = new ImageIcon(getClass().getResource("/imagens/museo de la nacion.png"));

        //Objeto do tipo Image que recebe a imagem do icone.
        Image imagem = icone.getImage();
        jTelaPrincipal = new javax.swing.JDesktopPane(){
            /** Método Paint Component
            *    Descrição:
            *      Tal método sobreescreve a tela de fundo padrão do Painel da Área
            *      de Trabalho do NetBeans.
            */
            public void paintComponent(Graphics g){
                g.drawImage(imagem,0,0,getWidth(),getHeight(),this);
            }

        };
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Editar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Registrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenidos al sistema de registros del museo");

        jTelaPrincipal.setLayer(jButton1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTelaPrincipal.setLayer(jButton2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTelaPrincipal.setLayer(jButton3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jTelaPrincipal.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jTelaPrincipalLayout = new javax.swing.GroupLayout(jTelaPrincipal);
        jTelaPrincipal.setLayout(jTelaPrincipalLayout);
        jTelaPrincipalLayout.setHorizontalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addContainerGap(105, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(130, 130, 130)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(279, 279, 279))
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jTelaPrincipalLayout.setVerticalGroup(
            jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jTelaPrincipalLayout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addGroup(jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jTelaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        jPanelPrincipal.setLayer(jTelaPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaPrincipal)
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTelaPrincipal)
        );

        jTelaPrincipal.getAccessibleContext().setAccessibleDescription("");

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/application_form_add.png"))); // NOI18N
        jMenuItem1.setText("Registrar Nuevas Obras");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/application_form_magnify.png"))); // NOI18N
        jMenuItem2.setText("Buscar registros");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_M, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/application_form_edit.png"))); // NOI18N
        jMenuItem3.setText("Modificar Datos");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/cancel.png"))); // NOI18N
        jMenuItem4.setText("Salir");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
      PaneldeRegistro painelC = new PaneldeRegistro();
        painelC.setTitle("Cadastrar Obra de Arte");
        jTelaPrincipal.add(painelC);
        painelC.setPosicao();
        painelC.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
         PaneldeBusqueda painelP = new PaneldeBusqueda();
        jTelaPrincipal.add(painelP);
        painelP.setPosicao();
        painelP.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        PaneldeBusquedaTombo painelT = new PaneldeBusquedaTombo();
        jTelaPrincipal.add(painelT);
        painelT.setPosicao();
        painelT.setVisible(true);
        
        bem_vindo_vazio();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        PaneldeBusqueda painelP = new PaneldeBusqueda();
        jTelaPrincipal.add(painelP);
        painelP.setPosicao();
        painelP.setVisible(true);

        bem_vindo_vazio();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        PaneldeRegistro painelC = new PaneldeRegistro();
        painelC.setTitle("Registrar Obra de Arte");
        jTelaPrincipal.add(painelC);
        painelC.setPosicao();
        painelC.setVisible(true);

        bem_vindo_vazio();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        PaneldeBusquedaTombo painelT = new PaneldeBusquedaTombo();
        jTelaPrincipal.add(painelT);
        painelT.setPosicao();
        painelT.setVisible(true);

        bem_vindo_vazio();
    }//GEN-LAST:event_jButton1ActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PanelPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PanelPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JDesktopPane jPanelPrincipal;
    protected static javax.swing.JDesktopPane jTelaPrincipal;
    // End of variables declaration//GEN-END:variables
    // Outros Atributos:
    private static LinkedList<Arte> cad = new LinkedList<Arte>();
    private static Persistencia p = new Persistencia();
    // Fim dos outros Atributos;
}
