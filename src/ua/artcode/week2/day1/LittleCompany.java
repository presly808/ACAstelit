package ua.artcode.week2.day1;

import java.util.Scanner;

public class LittleCompany {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input department size");
		int size = sc.nextInt();
		
		
		String[] names = new String[size];
		int[] ages = new int[size];
		double[] salaries = new double[size];
		
		//Fill in arrays
		for(int i = 0; i < size; i++){
			int order = i + 1;
			System.out.println("Name of " + order + " employee");
			names[i] = sc.next();
			System.out.println("Age of " + order + " employee");
			ages[i] = sc.nextInt();
			System.out.println("Salary of " + order + " employee");
			salaries[i] = sc.nextDouble();
		}
		
		//out 
		for(int i = 0; i < size; i++){
			System.out.println((i+1) + ". " + names[i] + ", age = " + ages[i] + ", salary = " + salaries[i]);
		}
		
	}

}
