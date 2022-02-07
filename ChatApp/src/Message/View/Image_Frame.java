package Message.View;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Image_Frame extends javax.swing.JFrame {
    
    public String img_chosen = "user (1)";
    JLabel lb_avatar;
    
    public Image_Frame(JLabel temp) {
        lb_avatar = temp;
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);     
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_image = new javax.swing.JPanel();
        img_business_man = new javax.swing.JLabel();
        img_woman = new javax.swing.JLabel();
        img_person = new javax.swing.JLabel();
        img_man = new javax.swing.JLabel();
        img_boy = new javax.swing.JLabel();
        img_girl = new javax.swing.JLabel();
        img_old_man = new javax.swing.JLabel();
        img_old_woman = new javax.swing.JLabel();
        img_santa = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        img_business_man.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/business_man.png"))); // NOI18N
        img_business_man.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_business_manMouseClicked(evt);
            }
        });

        img_woman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/woman.png"))); // NOI18N
        img_woman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_womanMouseClicked(evt);
            }
        });

        img_person.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/user (1).png"))); // NOI18N
        img_person.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_personMouseClicked(evt);
            }
        });

        img_man.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/man.png"))); // NOI18N
        img_man.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_manMouseClicked(evt);
            }
        });

        img_boy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/boy.png"))); // NOI18N
        img_boy.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_boyMouseClicked(evt);
            }
        });

        img_girl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/girl.png"))); // NOI18N
        img_girl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_girlMouseClicked(evt);
            }
        });

        img_old_man.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/old_man.png"))); // NOI18N
        img_old_man.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_old_manMouseClicked(evt);
            }
        });

        img_old_woman.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/old_woman.png"))); // NOI18N
        img_old_woman.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_old_womanMouseClicked(evt);
            }
        });

        img_santa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/santa.png"))); // NOI18N
        img_santa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                img_santaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_imageLayout = new javax.swing.GroupLayout(pnl_image);
        pnl_image.setLayout(pnl_imageLayout);
        pnl_imageLayout.setHorizontalGroup(
            pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_imageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(img_old_man, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addGroup(pnl_imageLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(img_man)
                            .addComponent(img_person))))
                .addGap(35, 35, 35)
                .addGroup(pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_business_man, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_boy, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_old_woman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_woman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_girl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_santa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnl_imageLayout.setVerticalGroup(
            pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_imageLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_business_man, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_person, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_woman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(31, 31, 31)
                .addGroup(pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(img_man)
                    .addComponent(img_boy)
                    .addComponent(img_girl))
                .addGap(30, 30, 30)
                .addGroup(pnl_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(img_old_man, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_old_woman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(img_santa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_image, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void img_business_manMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_business_manMouseClicked
        img_business_man.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
                "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "business_man";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_business_manMouseClicked

    private void img_personMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_personMouseClicked
        img_person.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
                "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "user (1)";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_personMouseClicked

    private void img_womanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_womanMouseClicked
        img_woman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
                "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "woman";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_womanMouseClicked

    private void img_manMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_manMouseClicked
        img_man.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
                        "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "man";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_manMouseClicked

    private void img_girlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_girlMouseClicked
        img_girl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
            "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "girl";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_girlMouseClicked

    private void img_boyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_boyMouseClicked
        img_boy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
            "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "boy";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_boyMouseClicked

    private void img_old_manMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_old_manMouseClicked
        img_old_man.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
            "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "old_man";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_old_manMouseClicked

    private void img_old_womanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_old_womanMouseClicked
        img_old_woman.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
            "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "old_woman";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_old_womanMouseClicked

    private void img_santaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_img_santaMouseClicked
        img_santa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        int check = JOptionPane.showConfirmDialog(this,"Do you want to change your avatar?",
            "Select an option",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(check == 0)
        {
            img_chosen = "santa";
            lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+img_chosen+".png")));
        }
        this.dispose();
    }//GEN-LAST:event_img_santaMouseClicked
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel img_boy;
    private javax.swing.JLabel img_business_man;
    private javax.swing.JLabel img_girl;
    private javax.swing.JLabel img_man;
    private javax.swing.JLabel img_old_man;
    private javax.swing.JLabel img_old_woman;
    private javax.swing.JLabel img_person;
    private javax.swing.JLabel img_santa;
    private javax.swing.JLabel img_woman;
    private javax.swing.JPanel pnl_image;
    // End of variables declaration//GEN-END:variables
}
