/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tenth_2;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class TypeAckRecieve2 extends Thread{
    public void run()
    {
        try {
            ServerSocket ss = new ServerSocket(3111);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF().trim();
                if(data.isEmpty())
                    RecieverFrame.jTextArea1.setText("");
                else
                    RecieverFrame.jTextArea1.setText(data.trim());
//                String get = SenderFrame.jTextArea1.getText();
//                SenderFrame.jTextArea1.setText(get+data+"\n");
            }
        } catch (Exception e) {
            System.out.println("Error in class TypeAckRecieve2 "+e);
        }
    }
}