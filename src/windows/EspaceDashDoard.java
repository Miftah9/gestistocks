/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package windows;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Miftah
 */
public class EspaceDashDoard extends javax.swing.JFrame {

    /**
     * Creates new form InterForm
     */
    public EspaceDashDoard() {

         try{
        initComponents();
        // Centre la fenêtre au démarrage
             setLocationRelativeTo(null);

             // Affiche la fenêtre
             setVisible(true);

            } catch (Exception ex) {
            Logger.getLogger(EspaceLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        dashbord_btn = new javax.swing.JLabel();
        article_btn = new javax.swing.JLabel();
        fournisseur_btn = new javax.swing.JLabel();
        user_btn = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        stock_btn = new javax.swing.JLabel();
        reduire_btn = new javax.swing.JLabel();
        close_btn = new javax.swing.JLabel();
        vente_btn = new javax.swing.JLabel();
        clientFourn_btn = new javax.swing.JLabel();
        rapports_btn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        achat_btn = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        logout_btn = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();

        jCheckBox1.setText("jCheckBox1");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/warehouse(1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/Gestion stock blog.png"))); // NOI18N
        jLabel2.setMaximumSize(new java.awt.Dimension(430, 220));
        jLabel2.setMinimumSize(new java.awt.Dimension(430, 220));
        jLabel2.setPreferredSize(new java.awt.Dimension(430, 220));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 204));
        jLabel11.setText("Gestion des Stocks");

        dashbord_btn.setBackground(new java.awt.Color(255, 255, 255));
        dashbord_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        dashbord_btn.setForeground(new java.awt.Color(255, 51, 51));
        dashbord_btn.setText("    Dashbord");
        dashbord_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        dashbord_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        article_btn.setBackground(new java.awt.Color(255, 255, 255));
        article_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        article_btn.setForeground(new java.awt.Color(51, 0, 204));
        article_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/simulateur-argent-icone-5481-48.png"))); // NOI18N
        article_btn.setText("Article");
        article_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        article_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        article_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                article_btnMouseClicked(evt);
            }
        });

        fournisseur_btn.setBackground(new java.awt.Color(255, 255, 255));
        fournisseur_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        fournisseur_btn.setForeground(new java.awt.Color(51, 0, 204));
        fournisseur_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/verification-of-delivery-list-clipboard-symbol(1).png"))); // NOI18N
        fournisseur_btn.setText("Categorie");
        fournisseur_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        fournisseur_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        fournisseur_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fournisseur_btnMouseClicked(evt);
            }
        });

        user_btn.setBackground(new java.awt.Color(255, 255, 255));
        user_btn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        user_btn.setForeground(new java.awt.Color(51, 0, 204));
        user_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/nouveau.png"))); // NOI18N
        user_btn.setText("Membre");
        user_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        user_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dashbord_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(article_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fournisseur_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(user_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(dashbord_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(article_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fournisseur_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(user_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));

        stock_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/Stock.png"))); // NOI18N
        stock_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        stock_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stock_btnMouseClicked(evt);
            }
        });

        reduire_btn.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        reduire_btn.setForeground(new java.awt.Color(255, 255, 255));
        reduire_btn.setText("-");
        reduire_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reduire_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                reduire_btnMouseClicked(evt);
            }
        });

        close_btn.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        close_btn.setForeground(new java.awt.Color(255, 255, 255));
        close_btn.setText("X");
        close_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                close_btnMouseClicked(evt);
            }
        });

        vente_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/PC.png"))); // NOI18N
        vente_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        vente_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vente_btnMouseClicked(evt);
            }
        });

        clientFourn_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/forum-des-personnes-utilisateurs-icone-3717-128.png"))); // NOI18N
        clientFourn_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clientFourn_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientFourn_btnMouseClicked(evt);
            }
        });

        rapports_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/Stati.png"))); // NOI18N
        rapports_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rapports_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rapports_btnMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" Le Stock");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Fournisseur/Client");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Les Rapports");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Les Ventes");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Ajout");

        achat_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/shopping-cart-icon.png"))); // NOI18N
        achat_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        achat_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                achat_btnMouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Les Achats");

        logout_btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gestiondestockicon/deconnectez-vous-mon-profil-icone-5679-48.png"))); // NOI18N
        logout_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout_btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logout_btnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(vente_btn)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(logout_btn)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(reduire_btn)
                                .addGap(18, 18, 18)
                                .addComponent(close_btn)))))
                .addGap(23, 23, 23))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(9, Short.MAX_VALUE)
                        .addComponent(stock_btn)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(achat_btn)
                .addGap(59, 59, 59)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rapports_btn, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(clientFourn_btn, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(78, 78, 78))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(242, 242, 242)
                .addComponent(jLabel8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(reduire_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(close_btn))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(logout_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(clientFourn_btn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(vente_btn)
                            .addComponent(rapports_btn, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addGap(35, 35, 35))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(achat_btn))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(115, 115, 115)
                                .addComponent(stock_btn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 50, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel8)
                        .addGap(184, 184, 184))))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 367, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(68, 68, 68)))
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void close_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_close_btnMouseClicked
        // TODO add your handling code here:
              System.exit(0);
    }//GEN-LAST:event_close_btnMouseClicked

    private void reduire_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_reduire_btnMouseClicked
        // TODO add your handling code here:
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_reduire_btnMouseClicked

    private void stock_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stock_btnMouseClicked
         try {
            // TODO add your handling code here:
            this.dispose();
            AddStock AP = new AddStock();
            AP.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stock_btnMouseClicked

    private void clientFourn_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientFourn_btnMouseClicked
         try {
            // TODO add your handling code here:
            this.dispose();
            AddClientFournisseur AF = new AddClientFournisseur();
            AF.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_clientFourn_btnMouseClicked

    private void vente_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vente_btnMouseClicked
         try {
            // TODO add your handling code here:
            this.dispose();
            AddVente AV = new AddVente();
            AV.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_vente_btnMouseClicked

    private void rapports_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rapports_btnMouseClicked
         try {
            // TODO add your handling code here:
            this.dispose();
            EspaceRapports ER = new EspaceRapports();
            ER.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceRapports.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_rapports_btnMouseClicked

    private void user_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user_btnMouseClicked
        try {
            // TODO add your handling code here:
            this.dispose();
            EspaceMembre EM = new EspaceMembre();
            EM.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_user_btnMouseClicked

    private void fournisseur_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fournisseur_btnMouseClicked
        try {
            // TODO add your handling code here:
            this.dispose();
            AddCategorie AC = new AddCategorie();
            AC.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_fournisseur_btnMouseClicked

    private void article_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_article_btnMouseClicked
         try {
            // TODO add your handling code here:
            this.dispose();
            AddArticle AA = new AddArticle();
            AA.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_article_btnMouseClicked

    private void achat_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_achat_btnMouseClicked
        try {
            // TODO add your handling code here:
            this.dispose();
            AddAchat AA = new AddAchat();
            AA.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_achat_btnMouseClicked

    private void logout_btnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout_btnMouseClicked
        try {
            // TODO add your handling code here:
            this.dispose();
            EspaceLogin ES = new EspaceLogin();
            ES.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(EspaceDashDoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_logout_btnMouseClicked

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
            java.util.logging.Logger.getLogger(EspaceDashDoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspaceDashDoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspaceDashDoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspaceDashDoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
               java.awt.EventQueue.invokeLater(() -> {
                   new EspaceDashDoard().setVisible(true);
        });
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel achat_btn;
    private javax.swing.JLabel article_btn;
    private javax.swing.JLabel clientFourn_btn;
    private javax.swing.JLabel close_btn;
    private javax.swing.JLabel dashbord_btn;
    private javax.swing.JLabel fournisseur_btn;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel logout_btn;
    private javax.swing.JLabel rapports_btn;
    private javax.swing.JLabel reduire_btn;
    private javax.swing.JLabel stock_btn;
    private javax.swing.JLabel user_btn;
    private javax.swing.JLabel vente_btn;
    // End of variables declaration//GEN-END:variables
}
