package ua.artcode.week2.day1;

import java.util.Scanner;

import ua.artcode.ArrayUtils;

public class LotteryGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int range = sc.nextInt();
		
		int[] numbers = ArrayUtils.generateRandomMas(size, 0, range);
		
		int userNumber = sc.nextInt();
		
		for(int i = 0; i < numbers.length; i++){
			if(numbers[i] == userNumber){
				System.out.println("Congratulation!");
			}
		}
		
		ArrayUtils.printMas(numbers);
		
		System.out.println("Try again next time");
		
		
	}

}
