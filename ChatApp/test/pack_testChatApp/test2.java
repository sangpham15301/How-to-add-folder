package pack_testChatApp;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class test2{
    private JFrame frame;
    private JButton btn;
    private JTextField tf_chatbox;
    private JPanel pnl_chatframe;
    public test2()
    {
       frame = new JFrame();
       frame.setLayout(null);
       frame.setSize(500,400);
       
       btn = new JButton("Send");
       btn.setBounds(0,200,100,30);
       btn.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMouseClicked(evt);
            }
        });
       
       tf_chatbox = new JTextField();
       tf_chatbox.setBounds(0,250,200,30);
       
        pnl_chatframe = new JPanel();        
        pnl_chatframe.setBounds(0,0,450,180);
        pnl_chatframe.setBackground(Color.red);
        pnl_chatframe.setLayout(null);
       
       frame.add(btn);
       frame.add(tf_chatbox);
       frame.add(pnl_chatframe);
       
       frame.setVisible(true);
       frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE );
    }  
    public static void main(String args[])
    {
        new test2();
    }
    private void btnMouseClicked(java.awt.event.MouseEvent evt)
    {
        String sms = tf_chatbox.getText();
        
        JPanel mess = new JPanel();
        pnl_chatframe.add(mess);
        formatLabel(mess,sms);
        
        JButton btn2 = new JButton("OK");
        pnl_chatframe.add(btn2);
        btn2.setBounds(100,100,100,50);
    }
    private void formatLabel(JPanel mess,String sms)
    {
        mess.setBounds(0,0,200,50);
        mess.setLayout(null);
        mess.setBackground(Color.yellow);
        
        JLabel data = new JLabel(sms);
        mess.add(data);
        
        data.setBounds(0,0,30,20);
        data.setForeground(Color.black);
        data.setBackground(Color.blue);
        data.setOpaque(true);
        data.setFont(new Font("Tahoma", Font.PLAIN, 16));
    }
}
