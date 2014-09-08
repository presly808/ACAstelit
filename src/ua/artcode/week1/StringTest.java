package ua.artcode.week1;

public class StringTest {

	public static void main(String[] args) {
		String s = "Vasia " + (25 + 13 * 2.0);
		System.out.println(s);
		
		String test = "line1 line2 hello";
		int len = test.length();
		System.out.println("Length of test is " + len);

		char returned = test.charAt(12);
		System.out.println(returned);
		char find = 'e';
		
		
		System.out.println(test.indexOf(find));
		
		String empt = "";
		System.out.println(empt.isEmpty());
		
		
		
	}

}
