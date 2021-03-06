package vista;

import estructuras.Arte;
import estructuras.ManipulacionDeImagen;
import estructuras.Persistencia;
import java.awt.Dimension;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import static vista.PanelPrincipal.jTelaPrincipal;

public class PaneldeMuestra extends javax.swing.JInternalFrame {

    public PaneldeMuestra(int tombo) {
        p.setupLer();
        if (p.getContinua() == true) {
            p.readRecords();
            p.cleanupLer();
            cad = p.getCad();
        }
        this.tombo = tombo;
        initComponents();
        MostraArte(tombo);
    }
     private void fecha_Janela() {
        this.dispose();
    }
    public void setPosicao() {
        Dimension d = jTelaPrincipal.getSize();
        this.setLocation((d.width - this.getSize().width) / 2, (d.height - this.getSize().height) / 2);
    }
     private void MostraArte(int tombo) {
        for (Arte a : cad) {
            if (a.getTombo() == tombo) {
                lblmostrartitulo.setText("Titulo de la obra :"+"   " +a.getTitulo());
                lblmostraraño.setText(String.valueOf(" Año :"+"      "+a.getAño()));
                lblmostrartiempoproduccion.setText("Tiempo de producción :"+"    "+a.getPeriodoProducido());
                lblmostrarcategoria.setText("Categoría :"+"     "+a.getCategoria());
                lblmostrarnombreartistat.setText("Nombre del artista :"+"      "+a.getNombre());
                lblmostrarregistroartista.setText("Resgistro del artista :"+"     "+String.valueOf(a.getRegistro()));
                lblmostrartipoprocedencia.setText("Tipo de procedencia :"+"   "+ a.getProcedencia());
                lblmostrarorigenprocedencia.setText("Orígen de procedencia :"+"    "+a.getOrigen());
                lblmostrartombo.setText(String.valueOf("Número del archivo :"+"  "+a.getTombo()));
                ManipulacionDeImagen.exibiImagemLabel(a.getImagen(), labelImagem);
            }
        }

    }
    private boolean existeNaLista(int tomb) {
        for (Arte a : cad) {
            if (a.getTombo() == tomb) {
                return true;
            }
        }
        return false;
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
        botaoEditar = new javax.swing.JButton();
        botaoFechar = new javax.swing.JButton();
        labelImagem = new javax.swing.JLabel();
        lblmostrartitulo = new javax.swing.JLabel();
        lblmostraraño = new javax.swing.JLabel();
        lblmostrartiempoproduccion = new javax.swing.JLabel();
        lblmostrarcategoria = new javax.swing.JLabel();
        lblmostrarnombreartistat = new javax.swing.JLabel();
        lblmostrarregistroartista = new javax.swing.JLabel();
        lblmostrartipoprocedencia = new javax.swing.JLabel();
        lblmostrarorigenprocedencia = new javax.swing.JLabel();
        lblmostrartombo = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Item Selecionado");

        botaoEditar.setText("Editar");
        botaoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEditarActionPerformed(evt);
            }
        });

        botaoFechar.setText("Cerrar");
        botaoFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoFecharActionPerformed(evt);
            }
        });

        labelImagem.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblmostrartitulo.setText("Titulo de la Obra");

        lblmostraraño.setText("Año de producció{n");

        lblmostrartiempoproduccion.setText("Tiempo de producción");

        lblmostrarcategoria.setText("Categoría");

        lblmostrarnombreartistat.setText("Nombre del Artista");

        lblmostrarregistroartista.setText("Registro del Artista");

        lblmostrartipoprocedencia.setText("Tipo de Procendencia");

        lblmostrarorigenprocedencia.setText("Origen de Procedencia");

        lblmostrartombo.setText("Número de Archivo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblmostrartitulo)
                            .addComponent(lblmostrartiempoproduccion)
                            .addComponent(lblmostraraño)
                            .addComponent(lblmostrarcategoria)
                            .addComponent(lblmostrarnombreartistat)
                            .addComponent(lblmostrarregistroartista)
                            .addComponent(lblmostrartipoprocedencia)
                            .addComponent(lblmostrarorigenprocedencia)
                            .addComponent(lblmostrartombo, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(botaoEditar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                                .addComponent(botaoFechar))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(136, 136, 136))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(labelImagem, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblmostrartitulo)
                .addGap(25, 25, 25)
                .addComponent(lblmostraraño)
                .addGap(23, 23, 23)
                .addComponent(lblmostrartiempoproduccion)
                .addGap(18, 18, 18)
                .addComponent(lblmostrarcategoria)
                .addGap(18, 18, 18)
                .addComponent(lblmostrarnombreartistat)
                .addGap(18, 18, 18)
                .addComponent(lblmostrarregistroartista)
                .addGap(26, 26, 26)
                .addComponent(lblmostrartipoprocedencia)
                .addGap(27, 27, 27)
                .addComponent(lblmostrarorigenprocedencia)
                .addGap(18, 18, 18)
                .addComponent(lblmostrartombo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoEditar)
                    .addComponent(botaoFechar))
                .addGap(67, 67, 67))
        );

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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEditarActionPerformed
        boolean errado = true;
        while (errado) {
            if (errado == true) {
                try {
                    int tomboEdit;
                    tomboEdit = tombo;
                    if (existeNaLista(tomboEdit)) {
                        PaneldeRegistro painelE = new PaneldeRegistro(tomboEdit);
                        painelE.setTitle("Editar Obra de Arte");
                        jTelaPrincipal.add(painelE);
                        painelE.setPosicao();
                        painelE.setVisible(true);
                        break;
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Archivo no Encontrado.", "Aviso", JOptionPane.ERROR_MESSAGE);
                        break;
                    }
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(rootPane, "Caracter digitado Inválido.", "Aviso", JOptionPane.ERROR_MESSAGE);
                }
                errado = false;
            }
        }
        this.dispose();
    }//GEN-LAST:event_botaoEditarActionPerformed

    private void botaoFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoFecharActionPerformed
        fecha_Janela();
    }//GEN-LAST:event_botaoFecharActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoEditar;
    private javax.swing.JButton botaoFechar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelImagem;
    private javax.swing.JLabel lblmostraraño;
    private javax.swing.JLabel lblmostrarcategoria;
    private javax.swing.JLabel lblmostrarnombreartistat;
    private javax.swing.JLabel lblmostrarorigenprocedencia;
    private javax.swing.JLabel lblmostrarregistroartista;
    private javax.swing.JLabel lblmostrartiempoproduccion;
    private javax.swing.JLabel lblmostrartipoprocedencia;
    private javax.swing.JLabel lblmostrartitulo;
    private javax.swing.JLabel lblmostrartombo;
    // End of variables declaration//GEN-END:variables

    private static Persistencia p = new Persistencia();
    private int tombo;
    private LinkedList<Arte> cad = new LinkedList<Arte>();

}
