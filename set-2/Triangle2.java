/**
 * @(#)Triangle2.java
 *
 *
 * @author
 * @version 1.00 2018/8/6
 */
package set2;

public class Triangle2 {

	public static void main(String args[])
	{
		int a = 2;
		int b = 2;
		int c = 2;

		double p = (double)(a+b+c)/2;
		double p1 = p - a;
		double p2 = p - b;
		double p3 = p - c;
		double Area = Math.sqrt(p * p1 * p2 * p3);

		System.out.println("Area of three sided triangle is "+Area);
	}
}