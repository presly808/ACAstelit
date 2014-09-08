package ua.artcode.week1;
import java.util.Scanner;

public class LuckyWordGame {
	public static void main(String[] args) {
		/*
		 * 1. Input string from console
		 * 2. check length of word
		 * 3. check lucky condition 0 == 3, 1 == 4 
		 * 4. show result
		*/
		// int a = 5;
		// a *= 6; a = a * 6; -= += 
		Scanner sc = new Scanner(System.in);
		System.out.println("Input word of length 6");
		String input = sc.next();
		
		String resultMessage = "";
		
		if(input.length() == 6){
			resultMessage = input;
			if(input.charAt(0) == input.charAt(3) && input.charAt(1) == input.charAt(4) &&
					input.charAt(2) == input.charAt(5)){
				resultMessage += " is lucky";// resultMessage = resultMessage +  
			} else {
				resultMessage += " is unlucky";
			}
		} else {
			resultMessage = "length is not 6";
		}
		
		System.out.println(resultMessage);
		
		
	}
}
