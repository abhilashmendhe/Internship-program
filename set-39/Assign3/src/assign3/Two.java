/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign3;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author abhilash
 */
public class Two extends Thread{
    public void run()
    {
        for(int j=1; j<=10; j++)
            System.out.println("j: "+j);
            
            
        
    }
}
