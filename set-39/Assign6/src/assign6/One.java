/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assign6;

/**
 *
 * @author abhilash
 */
public class One extends Thread{

    public void run()
    {
        for(int i=1; i<=10; i++)
        {
//            this.setPriority(3);
            System.out.println("i: "+i);
            
        }
    }
}
