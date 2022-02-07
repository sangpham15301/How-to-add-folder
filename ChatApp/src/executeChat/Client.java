package executeChat;

import Message.View.Message_Frame;
import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Client {
    private InetAddress host;
    private int port;
    private Socket socket;
    private JPanel pnl_chat_frame;
    private Message_Frame frame;
    
    public Client(InetAddress host, int port,JPanel pnl_chat_frame,Message_Frame frame) {
        this.host = host;
        this.port = port;
        this.pnl_chat_frame = pnl_chat_frame;
        this.frame = frame;
    }
    public void createAndRead() throws IOException
    {
        socket = new Socket(host,port);
        System.out.println("Connected to server");
        RdClient read = new RdClient(socket,pnl_chat_frame,frame);
        read.start();
    }
    public void writeClient(String sms) throws IOException
    {
        DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
        dos.writeUTF(sms);
//        dos.flush();
//              Send name of avatar image
        dos.writeUTF(frame.avatar_frame.img_chosen);
//        dos.flush();
    }
}

class RdClient extends Thread
{
    private Socket client;
    private JPanel pnl_chat_frame;
    private Message_Frame frame;
    public RdClient(Socket socket,JPanel pnl_chat_frame,Message_Frame frame)
    {
        client = socket;
        this.pnl_chat_frame = pnl_chat_frame;
        this.frame = frame;
    }
    
    @Override
    public void run()
    {
        DataInputStream dis;
        try {
            dis = new DataInputStream(client.getInputStream());
            while(true)
            {
                String sms = dis.readUTF();
                
//                      Receive name of avatar image
                String img_chosen = dis.readUTF();
                
                JPanel pnl_mess = frame.pnlMessage(sms,255,255,255,img_chosen);
                pnl_chat_frame.setLayout(new BorderLayout());
                
                JPanel left = new JPanel(new BorderLayout());
                left.add(pnl_mess,BorderLayout.LINE_START);
                
                frame.vertical.add(left);
                pnl_chat_frame.add(frame.vertical,BorderLayout.PAGE_START);
                
                frame.setVisible(true);
                
            }
        } catch (IOException ex) {
            Logger.getLogger(RdClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}