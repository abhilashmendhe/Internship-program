/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;

import java.sql.DriverManager;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
import java.sql.*;
public class UpdateAccMaker {
    
    public boolean updateacc(String accno, String custname, String dob, String address, String email, String mobile)
    {
        boolean f = false;
        
        try {
            // Driver
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            
            // Connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdb", "root", "root");
        
            // Statement
            Statement st = conn.createStatement();
            
            String query = "update accinfo set custname='"+custname+"', dob='"+dob+"', address='"+address+"', email='"+email+"', mobile='"+mobile+"' where accno='"+accno+"'";
            
            int x = st.executeUpdate(query);
            if(x>0)
                f = true;
            
        } catch (Exception e) {
            System.out.println("Error in class UpdateAccMaker: "+e);
        }
        
        return f;
    }
}