package ua.artcode.week3.day1;

import java.util.Arrays;

public class ArraysTest {

	public static void main(String[] args) {
		int[] mas = {56,12,1,9,3,78};
		
		System.out.println(Arrays.toString(mas));
		
		Arrays.sort(mas);
		
		System.out.println(Arrays.toString(mas));
		
		int[] mas2 = mas;
		mas2[0] = 0;
		
		System.out.println(Arrays.toString(mas));
		
		String s = new String("Alex");
		String s1 = "Alex";
		System.out.println(s1.equals(s));
		s1.concat(s); // s1 + s 
		String withSpaces = "      678        ";
		String noSpaces = withSpaces.trim();
		System.out.println(noSpaces);
		

		
		
		
		
		//For compare reference types use equals
		
		
	}

}
