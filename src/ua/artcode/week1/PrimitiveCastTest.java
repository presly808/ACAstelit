package ua.artcode.week1;

public class PrimitiveCastTest {

	public static void main(String[] args) {
		//                char  
		// byte -> short -> int   -> long
		//                  float -> double
		
		double value = 23.98;
		int i1 = (int) value;//  (<type>) value - cast
	
		int a = 100;
		System.out.println(Integer.toBinaryString(a) + "\n" + a);
//		a = a << 1; // a = a * 2;
		a = a << 29; // a = a / 2;
		a = a >>> 21;
		System.out.println(Integer.toBinaryString(a) + "\n" + a);
		
	}
}
