package pack_testChatApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class test1 extends javax.swing.JFrame {
    
    JButton btn2;
    public test1() {
        this.setLayout(null);
        initComponents();
        initMyself();
    }
    
    public void initMyself()
    {
        pnl_chatframe.setBounds(5, 75, 440, 570);
        pnl_chatframe.setFont(new Font("SAN_SERIF", Font.PLAIN, 16));
        pnl_chatframe.setBackground(Color.red);
//        pnl_chatframe.setLayout(new BoxLayout(pnl_chatframe,BoxLayout.Y_AXIS));
        pnl_chatframe.setLayout(new BoxLayout(pnl_chatframe,BoxLayout.Y_AXIS));
        
        JButton btn = new JButton("Btn1");
        pnl_chatframe.add(btn);
        pnl_chatframe.add(Box.createVerticalStrut(10));
        btn.setSize(100,50);
        
        btn2 = new JButton("Btn2");
        pnl_chatframe.add(btn2);
        pnl_chatframe.add(Box.createVerticalStrut(10));
        btn2.setSize(100,50);
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_chatbox = new javax.swing.JTextField();
        btn_send = new javax.swing.JButton();
        pnl_chatframe = new javax.swing.JPanel();
        avt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_chatbox.setText("jTextField1");

        btn_send.setText("jButton1");
        btn_send.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                btn_sendFocusGained(evt);
            }
        });

        avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pack_testChatApp/woman_small.png"))); // NOI18N
        avt.setText("Hello my name\ndasjdkjsak\ndajdkasjdkldjsakldjsakljdklasjdlkas\ndsajdklasjdkls");

        javax.swing.GroupLayout pnl_chatframeLayout = new javax.swing.GroupLayout(pnl_chatframe);
        pnl_chatframe.setLayout(pnl_chatframeLayout);
        pnl_chatframeLayout.setHorizontalGroup(
            pnl_chatframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chatframeLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(avt, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnl_chatframeLayout.setVerticalGroup(
            pnl_chatframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_chatframeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(avt)
                .addContainerGap(192, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tf_chatbox, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_send, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(pnl_chatframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(pnl_chatframe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_chatbox)
                    .addComponent(btn_send, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_sendFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_btn_sendFocusGained
        String sms = tf_chatbox.getText();
        JButton btn3 = new JButton(sms);
        btn3.setSize(100,50);
        pnl_chatframe.add(btn3);
        System.out.println("hello");
        this.setVisible(true);
    }//GEN-LAST:event_btn_sendFocusGained

    private JPanel formatLabel(String sms)
    {
        JPanel mess = new JPanel();
        JLabel data = new JLabel(sms);
        data.setForeground(Color.white);
        data.setBackground(Color.black);
        
        mess.setBackground(Color.blue);
        mess.add(data);
        
        return mess;
    }
    public static void main(String args[]) {
        new test1().setVisible(true);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel avt;
    private javax.swing.JButton btn_send;
    private javax.swing.JPanel pnl_chatframe;
    private javax.swing.JTextField tf_chatbox;
    // End of variables declaration//GEN-END:variables
}
