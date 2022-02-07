package executeChat;

import Message.View.Message_Frame;
import java.awt.BorderLayout;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class Server extends Thread
{
    private int port;
    private ServerSocket serv;
    private JPanel pnl_chat_frame;
    private Message_Frame frame;
    public static ArrayList<Socket>listSK = new ArrayList<>();
    
    public Server(int port,JPanel pnl_chat_frame,Message_Frame frame)
    {
        this.port = port;
        this.pnl_chat_frame = pnl_chat_frame;
        this.frame = frame;
    }
    public void createServer() throws IOException
    {
        serv = new ServerSocket(port);
        System.out.println("Ready to connect!");
    }
    public void writeServer(String sms) throws IOException
    {
        for (Socket item: Server.listSK)
        {
            DataOutputStream dos = null;
            dos = new DataOutputStream(item.getOutputStream());
            dos.writeUTF(sms); 
            
//                  Send name of avatar image
//            dos.flush();
            dos.writeUTF(frame.avatar_frame.img_chosen);
//            dos.flush();
        }
    }
    @Override
    public void run()
    {
        //  Used to accept clients.
        while(true){
            try {
                Socket socket = serv.accept();
                System.out.println("Connected to client" + socket);
                Server.listSK.add(socket);
                RdServer read = new RdServer(socket,pnl_chat_frame,frame);
                read.start();
            } catch (IOException ex) {
                Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}


class RdServer extends Thread
{
    private Socket serv;
    private JPanel pnl_chat_frame;
    private Message_Frame frame;
    public RdServer(Socket socket,JPanel pnl_chat_frame,Message_Frame frame) 
    {
        serv = socket;
        this.pnl_chat_frame = pnl_chat_frame;
        this.frame = frame;
    }
    
    @Override
    public void run()
    {
        try {
            DataInputStream dis = new DataInputStream(serv.getInputStream());
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
                for(Socket item : Server.listSK)
                {
                    if(item.getPort() != serv.getPort())
                    {
                        DataOutputStream dos = new DataOutputStream(item.getOutputStream());
                        dos.writeUTF(sms);
//                        dos.flush();

//                      Send name of avatar image                        
                        dos.writeUTF(img_chosen);
//                        dos.flush();
                    }
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(RdServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
