package ua.artcode;

import com.sun.org.apache.regexp.internal.recompile;

// input, output, name
// return statement 
public class ArrayUtils {
	

	public static int[] generateRandomMas(int size, int low, int hight){
		int[] mas = new int[size];
		for(int i = 0; i < mas.length; i++){
			int random = low + (int)(Math.random() * (hight - low));
			mas[i] = random;
		}
		return mas;
	} 
	
	public static void printMas(int[] mas){
		
		if(mas.length < 1){
			System.out.println("[]");
			return; // close method 
		}
		
		String result = "[";
		
		for(int i = 0; i < mas.length - 1; i++){
			result += mas[i] + ",";
		}
		
		result += mas[mas.length-1] + "]";
		
		System.out.println(result);
		
	}
	
}
