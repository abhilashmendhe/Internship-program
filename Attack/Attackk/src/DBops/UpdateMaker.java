/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBops;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import sun.awt.OSInfo;

/**
 *
 * @author abhilash
 */
public class UpdateMaker {
    
    public boolean update(String name, String email, String mobile, String uname, String pass)
    {
        boolean f = false;
        
        try {
            
             // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            // Connection
           Connection conn = null;
            
            if(OSInfo.getOSType().toString().equals("WINDOWS"))
                conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/networknode", "root", "root");
            else
                conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/networknode", "myadm", "Myadm@123");
           
            // Statement
            Statement st = conn.createStatement();
            
            String q = "update nodeinfo set name='"+name+"',email='"+email+"',mobile='"+mobile+"',pass='"+pass+"' where uname='"+uname+"'";
            
            int x = st.executeUpdate(q);
            if(x>0)
                f = true;
        } catch (Exception e) {
            System.out.println("Error in class UpdateMaker: "+e);
        }
        
        return f;
    }
}
