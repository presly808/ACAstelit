package ua.artcode.week2.day1;

import ua.artcode.ArrayUtils;

public class TestArrays {

	public static void main(String[] args) {
		//creation
		int[] mas1 = new int[5];
		//mas1.length;
		int[] mas2 = {56,23,234,56};
		ArrayUtils.printMas(mas2);
		// mas2[8] = 23;
		
		char[] chars = {'a','b','c'};

		int lengthOfChars = chars.length;
		
		String[] days = new String[7]; // null null null ... 
		days[0] = "Monday";
		days[1] = "Tuesday";
		days[2] = "Wednesday";
		days[3] = "Thusday";
		days[4] = "Friday";
		days[5] = "Saturday";
		days[6] = "Sunday";
		
		System.out.println(days[0]);
		System.out.println(days[1]);
		System.out.println(days[2]);
		System.out.println(days[3]);
		System.out.println(days[4]);
		System.out.println(days[5]);
		System.out.println(days[6]);
		
		
		
		
		
		
		
	}

}
