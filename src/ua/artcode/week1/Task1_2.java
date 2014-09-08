package ua.artcode.week1;
import java.util.Scanner;

public class Task1_2 {

	// Ctrl + Shift + /
	public static void main(String[] args) {
		System.out.println("BEGIN");
		Scanner sc = new Scanner(System.in);// 
		System.out.println("Input a = ");
		int a = sc.nextInt();
		System.out.println("Input b = ");
		int b = sc.nextInt();
		System.out.println("Input c = ");
		int c = sc.nextInt();
		
		String s = a + "x^2 + " + b + "x + " + c + " = 0;";
		
		System.out.println(s);
		
		double desc = b*b - 4*a*c;
		double sqrtDesc = Math.sqrt(desc);
		
		if(desc < 0) {
			System.out.println("No answer desc = " + desc + " < 0");
		} else {
			double x1 = (-b + sqrtDesc) / (2 * a);
			double x2 = (-b - sqrtDesc) / (2 * a);
			System.out.println("x1 = " + x1);
			System.out.println("x2 = " + x2);
		}
		
		System.out.println("END");
		
	}

}
