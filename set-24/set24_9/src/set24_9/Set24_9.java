/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package set24_9;

/**
 *
 * @author abhil
 */
import java.util.*;
public class Set24_9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner sc = new Scanner(System.in);
        int mat[][] = new int[3][3];
        
        System.out.println("Enter elements in matrix");
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[0].length; j++)
                mat[i][j] = sc.nextInt();
        }
        
        Matrix matrix = new Matrix(mat);
        
        Transform t = new Transform();
                
        Datakeeper dd = t.getNormTransnorm(matrix);
        
        System.out.println("Trace is "+dd.trace);
        System.out.println("Noraml is "+dd.normal);
    }
    
}
