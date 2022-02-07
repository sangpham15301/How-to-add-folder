package Message.View;

import executeChat.Client;
import executeChat.Server;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.ScrollPane;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Message_Frame extends javax.swing.JFrame {

//      Variables declaration myself!
    Server serv;
    Client cli;
    public Box vertical = Box.createVerticalBox();
    public Image_Frame avatar_frame  = new Image_Frame(this.lb_avatar);
//      End of variables declaration myself!
    
    public Message_Frame() {
        initComponents();
        initMyself();
    }
    public void initMyself()
    {
        lb_room.setVisible(false);
        tf_room.setVisible(false);
        lb_name.setVisible(false);
        tf_name.setVisible(false);
        btn_accept.setVisible(false);
        
        //              Set the jScrollPane
        sp.setVerticalScrollBar(new JScrollBar());
        sp.getVerticalScrollBar().setBackground(Color.RED);
        
        pnl_chat_frame.setLayout(new BoxLayout(pnl_chat_frame,BoxLayout.Y_AXIS));
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_all = new javax.swing.JPanel();
        pnl_avatar = new javax.swing.JPanel();
        lb_avatar = new javax.swing.JLabel();
        pnl_user = new javax.swing.JPanel();
        choose_position = new javax.swing.JComboBox<>();
        lb_room = new javax.swing.JLabel();
        tf_room = new javax.swing.JTextField();
        btn_accept = new javax.swing.JButton();
        lb_name = new javax.swing.JLabel();
        tf_name = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        pnl_send = new javax.swing.JPanel();
        lb_send = new javax.swing.JLabel();
        pnl_chat = new javax.swing.JPanel();
        tf_chat = new javax.swing.JTextField();
        sp = new javax.swing.JScrollPane();
        pnl_chat_frame = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_all.setAlignmentX(0.0F);
        pnl_all.setAlignmentY(0.0F);
        pnl_all.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnl_avatar.setAlignmentX(0.0F);
        pnl_avatar.setAlignmentY(0.0F);

        lb_avatar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/user (1).png"))); // NOI18N
        lb_avatar.setAlignmentX(0.5F);
        lb_avatar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_avatarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_avatarLayout = new javax.swing.GroupLayout(pnl_avatar);
        pnl_avatar.setLayout(pnl_avatarLayout);
        pnl_avatarLayout.setHorizontalGroup(
            pnl_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_avatarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_avatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnl_avatarLayout.setVerticalGroup(
            pnl_avatarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_avatarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lb_avatar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnl_all.add(pnl_avatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 150));

        pnl_user.setAlignmentX(0.0F);
        pnl_user.setAlignmentY(0.0F);

        choose_position.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Position ", "Host", "Guest" }));
        choose_position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choose_positionActionPerformed(evt);
            }
        });

        lb_room.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_room.setText("Room:");

        btn_accept.setText("Create the  Room");
        btn_accept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_acceptMouseClicked(evt);
            }
        });

        lb_name.setText(" Name:");

        tf_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        javax.swing.GroupLayout pnl_userLayout = new javax.swing.GroupLayout(pnl_user);
        pnl_user.setLayout(pnl_userLayout);
        pnl_userLayout.setHorizontalGroup(
            pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addGroup(pnl_userLayout.createSequentialGroup()
                    .addComponent(lb_room, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tf_room, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnl_userLayout.createSequentialGroup()
                    .addGap(6, 6, 6)
                    .addComponent(lb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(tf_name)))
            .addGroup(pnl_userLayout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(choose_position, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnl_userLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btn_accept))
        );
        pnl_userLayout.setVerticalGroup(
            pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_userLayout.createSequentialGroup()
                .addComponent(choose_position, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lb_name, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                    .addGroup(pnl_userLayout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(tf_name, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(pnl_userLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lb_room, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(tf_room, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(btn_accept, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );

        pnl_all.add(pnl_user, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 155, 160, 170));
        pnl_all.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 320, 10));

        lb_send.setBackground(new java.awt.Color(255, 255, 255));
        lb_send.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lb_send.setForeground(new java.awt.Color(255, 255, 255));
        lb_send.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_send.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/paper-plane.png"))); // NOI18N
        lb_send.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lb_sendMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnl_sendLayout = new javax.swing.GroupLayout(pnl_send);
        pnl_send.setLayout(pnl_sendLayout);
        pnl_sendLayout.setHorizontalGroup(
            pnl_sendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_send, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        pnl_sendLayout.setVerticalGroup(
            pnl_sendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lb_send, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnl_all.add(pnl_send, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 50, 40));

        tf_chat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout pnl_chatLayout = new javax.swing.GroupLayout(pnl_chat);
        pnl_chat.setLayout(pnl_chatLayout);
        pnl_chatLayout.setHorizontalGroup(
            pnl_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tf_chat, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
        );
        pnl_chatLayout.setVerticalGroup(
            pnl_chatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tf_chat, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnl_all.add(pnl_chat, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 270, 40));

        sp.setHorizontalScrollBar(null);

        javax.swing.GroupLayout pnl_chat_frameLayout = new javax.swing.GroupLayout(pnl_chat_frame);
        pnl_chat_frame.setLayout(pnl_chat_frameLayout);
        pnl_chat_frameLayout.setHorizontalGroup(
            pnl_chat_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 318, Short.MAX_VALUE)
        );
        pnl_chat_frameLayout.setVerticalGroup(
            pnl_chat_frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 238, Short.MAX_VALUE)
        );

        sp.setViewportView(pnl_chat_frame);

        pnl_all.add(sp, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 320, 240));

        getContentPane().add(pnl_all, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lb_avatarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_avatarMouseClicked
        avatar_frame  = new Image_Frame(this.lb_avatar);
        avatar_frame.setVisible(true);
    }//GEN-LAST:event_lb_avatarMouseClicked

    private void choose_positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_choose_positionActionPerformed
        String pos = String.valueOf(choose_position.getSelectedItem());
        if(pos.equals("Host"))
        {
            lb_room.setVisible(true);
            tf_room.setVisible(true);
            lb_name.setVisible(true);
            tf_name.setVisible(true);
            btn_accept.setVisible(true);
            btn_accept.setText("Create the room");
        }
        else if (pos.equals("Guest"))
        {
            lb_room.setVisible(true);
            tf_room.setVisible(true);
            lb_name.setVisible(true);
            tf_name.setVisible(true);
            btn_accept.setVisible(true);
            btn_accept.setText("Enter the room");
        }
        else
        {
            lb_room.setVisible(false);
            tf_room.setVisible(false);
            lb_name.setVisible(false);
            tf_name.setVisible(false);
            btn_accept.setVisible(false);
        }
    }//GEN-LAST:event_choose_positionActionPerformed

    private void lb_sendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lb_sendMouseClicked
//                      Send data from client to server
        String sms = tf_chat.getText();
        JPanel pnl_mess;
        if(serv !=null && !sms.equals(""))
        {
            try {
                pnl_mess = pnlMessage(sms,51,153,255,avatar_frame.img_chosen);
                pnl_chat_frame.setLayout(new BorderLayout());
                
                JPanel right = new JPanel(new BorderLayout());
                right.add(pnl_mess,BorderLayout.LINE_END);
                
                vertical.add(right);
                pnl_chat_frame.add(vertical,BorderLayout.PAGE_START);
                
//                      send message from server to clients                
                serv.writeServer(tf_name.getText() + ": " + sms);
                tf_chat.setText("");
            } catch (IOException ex) {
                Logger.getLogger(Message_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }   
        else if (cli !=null && !sms.equals(""))
        {
            try {
               
                pnl_mess = pnlMessage(sms,51,153,255,avatar_frame.img_chosen);
                pnl_chat_frame.setLayout(new BorderLayout());
                
                JPanel right = new JPanel(new BorderLayout());
                right.add(pnl_mess,BorderLayout.LINE_END);
                
                vertical.add(right);
                pnl_chat_frame.add(vertical,BorderLayout.PAGE_START);

//                      send message from one particular client to server                
                cli.writeClient(tf_name.getText()+": " + sms);
                tf_chat.setText("");
            } catch (IOException ex) {
                Logger.getLogger(Message_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.setVisible(true);
    }//GEN-LAST:event_lb_sendMouseClicked

    private void btn_acceptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_acceptMouseClicked
        String port = tf_room.getText();
        String accept = btn_accept.getText();
        System.out.println("Port = " + port + " ,button = " + accept);

        if (accept.equals("Enter the room"))
        {
            try {
                cli = new Client(InetAddress.getLocalHost(),Integer.valueOf(port),pnl_chat_frame,this);
                cli.createAndRead();       
            } catch (UnknownHostException ex) {
                Logger.getLogger(Message_Frame.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Message_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if (accept.equals("Create the room"))
        {
            try {               
                serv = new Server(Integer.valueOf(port),pnl_chat_frame,this);
                serv.createServer();
                serv.start();            
            } catch (IOException ex) {
                Logger.getLogger(Message_Frame.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btn_acceptMouseClicked
    
    public JPanel pnlMessage(String text, int r, int g, int b,String img_chosen)
    {
        JPanel pnl = new JPanel();
        pnl.setLayout(new BoxLayout(pnl,BoxLayout.Y_AXIS));
        
                //  add icon
        JLabel avt = new JLabel();        
        avt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Message/View/"+
                img_chosen+ "_small" + ".png")));
        
                //  add text
        JLabel lb_text = new JLabel("<html><p style = \"width : 100px\">"+ text +"</p></html>");
        lb_text.setFont(new Font("Tahoma",Font.PLAIN,16));
        lb_text.setBackground(new Color(r,g,b));
        lb_text.setOpaque(true);
        lb_text.setBorder(new EmptyBorder(5,5,5,10));
        
                //  add time
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        JLabel lb_time = new JLabel();
        lb_time.setText(sdf.format(cal.getTime()));
        
        pnl.add(avt);
        pnl.add(lb_text);
        pnl.add(lb_time);
        
        return pnl;
    }
    public static void main(String args[]) {
        new Message_Frame().setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_accept;
    private javax.swing.JComboBox<String> choose_position;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lb_avatar;
    private javax.swing.JLabel lb_name;
    private javax.swing.JLabel lb_room;
    private javax.swing.JLabel lb_send;
    private javax.swing.JPanel pnl_all;
    private javax.swing.JPanel pnl_avatar;
    private javax.swing.JPanel pnl_chat;
    private javax.swing.JPanel pnl_chat_frame;
    private javax.swing.JPanel pnl_send;
    private javax.swing.JPanel pnl_user;
    private javax.swing.JScrollPane sp;
    private javax.swing.JTextField tf_chat;
    private javax.swing.JTextField tf_name;
    private javax.swing.JTextField tf_room;
    // End of variables declaration//GEN-END:variables
}
