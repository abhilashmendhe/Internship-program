/**
 * @(#)Assign10.java
 *
 *
 * @author
 * @version 1.00 2018/9/6
 */

package set15;
import java.util.*;
public class Assign10 {

    public static void main(String args[])
    {
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Enter size of an First array ");int n = sc.nextInt();
    	int a[] = new int[n];

    	System.out.println("Insert elements in First Array");
    	int i;
    	for(i=0; i<a.length; i++)
    		a[i] = sc.nextInt();

		System.out.print("Enter size of an Second array ");int m = sc.nextInt();
		int b[] = new int[m];
    	System.out.println("Insert elements in Second Array");
    	int j;
    	for(j=0; j<b.length; j++)
    		b[j] = sc.nextInt();


		int c[] = new int[n+m];
    	int second_arr_pos = 0;
    	for(int k=0; k<c.length; k++)
    	{
    		if(k<a.length)
    			c[k] = a[k];
    		else
    			c[k] = b[second_arr_pos++];
   			System.out.print(" "+c[k]);

    	}
	}

}