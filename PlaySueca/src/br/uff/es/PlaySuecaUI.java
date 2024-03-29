/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PlaySuecaUI.java
 *
 * Created on 26/03/2011, 10:02:29
 */

package br.uff.es;

import br.uff.es.pkg.sueca.factory.Game;
import java.awt.Toolkit;
import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author Goop
 */
public class PlaySuecaUI extends javax.swing.JFrame {

    /** Creates new form PlaySuecaUI */
    public PlaySuecaUI() {
        try {
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {}
        initComponents();
        setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        setExtendedState(MAXIMIZED_BOTH);
        panelCardsUI = new PanelCardsUI();
        //panelCardsUI.setBounds(panelCards.getBounds());
        panelCards.add(panelCardsUI);
        panelCardsUI.addPropertyChangeListener(new PropertyChangeListener() {

            public void propertyChange(PropertyChangeEvent evt) {
                lblGeralDp1.setText("Dupla 1 : "+panelCardsUI.getGame().getGeralDupla1());
                lblGeralDp2.setText("Dupla 2 : "+panelCardsUI.getGame().getGeralDupla2());
                System.out.println("Dupla 1 " + panelCardsUI.getGame().getGeralDupla1());
                System.out.println("Dupla 2 " + panelCardsUI.getGame().getGeralDupla2());
            }
        });
        setCanvasConf();
    }

    private void setCanvasConf() {
        panelCards.addComponentListener(new ComponentListener() {

            @Override
            public void componentResized(ComponentEvent e) {
                if (e.getComponent() instanceof javax.swing.JPanel) {
                    javax.swing.JPanel panel = (javax.swing.JPanel)e.getComponent();
                    panelCardsUI.setSize(panelCards.getSize());                    
                }
            }

            @Override
            public void componentMoved(ComponentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void componentShown(ComponentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void componentHidden(ComponentEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        panelCards = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        lblGeralDp1 = new javax.swing.JLabel();
        lblGeralDp2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Play Sueca !");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/deck.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelCardsLayout = new javax.swing.GroupLayout(panelCards);
        panelCards.setLayout(panelCardsLayout);
        panelCardsLayout.setHorizontalGroup(
            panelCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 713, Short.MAX_VALUE)
        );
        panelCardsLayout.setVerticalGroup(
            panelCardsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 562, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Dar Cartas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Geral");

        lblGeralDp1.setText("Dupla 1 : 0");

        lblGeralDp2.setText("Dupla 2 : 0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblGeralDp1)
                    .addComponent(lblGeralDp2))
                .addGap(32, 32, 32)
                .addComponent(panelCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addGap(62, 62, 62)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGeralDp1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblGeralDp2))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(panelCards, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        panelCardsUI.giveCards();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PlaySuecaUI().setVisible(true);
            }
        });
    }

    private PanelCardsUI panelCardsUI;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblGeralDp1;
    private javax.swing.JLabel lblGeralDp2;
    private javax.swing.JPanel panelCards;
    // End of variables declaration//GEN-END:variables

}
