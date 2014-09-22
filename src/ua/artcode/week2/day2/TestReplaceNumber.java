package ua.artcode.week2.day2;

import java.util.Scanner;

import ua.artcode.ArrayUtils;

public class TestReplaceNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("For generating random mas input size");
		int size = sc.nextInt();
		int[] mas = ArrayUtils.generateRandomMas(size, 0, 100);
		ArrayUtils.printMas(mas);
		
		System.out.println("Input target number");
		int aim = sc.nextInt();
		System.out.println("input number for replace");
		int replaceNumber = sc.nextInt();
		
		mas = ArrayUtils.replaceNumber(mas, aim, replaceNumber);
		
		ArrayUtils.printMas(mas);
		
		
	}

}
