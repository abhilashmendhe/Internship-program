/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seventh.pkg1;

import java.io.DataInputStream;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author abhilash
 */
public class AckReciever {
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
                System.out.println(data);
                
//                Scanner sc = new Scanner(System.in);
//        String msgg = sc.nextLine();
//        new DataSender().SendData("192.168.1.65"+"#"+msgg, "192.168.1.32");
            }
        } catch (Exception e) {
            System.out.println("Error in class AckReciever "+e);
        }
            
        }
}