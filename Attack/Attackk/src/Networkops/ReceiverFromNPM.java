/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Networkops;

import attackk.NPMFrame;
import attackk.SendDataFrame;
import com.sun.xml.internal.ws.message.saaj.SAAJHeader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author abhilash
 */
public class ReceiverFromNPM extends Thread{
    
    public void run()
    {
        try {
            ServerSocket ss = new ServerSocket(3000);
            while(true)
            {
                Socket s = ss.accept();
                InputStream is = s.getInputStream();
                DataInputStream dis = new DataInputStream(is);
                String data = dis.readUTF();
                if(data.contains("Received!!!"))
                {
                    NPMFrame.recmsg = data;
                    
                }
               
                if(data.contains("recallip"))
                {
                    
                    SendDataFrame.getallip = data;
                }
                if(data.contains("hashack"))
                {
                    SendDataFrame.hashack = data;
                    //System.out.print(data);
                }
            }
        } catch (Exception e) {
            System.out.println("Error in class ReceiverFromNPM: "+e);
        }
    }
}
