/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package crypto;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.ArrayList;

/**
 *
 * @author abhil
 */
public class Crypto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        MainFrame mf = new MainFrame();
        Dimension d = Toolkit.getDefaultToolkit().getScreenSize();
        mf.setVisible(true);
        mf.setSize(d);
        
      
    }

    
}
