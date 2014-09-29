package ua.artcode.week3.day2;

import java.util.Scanner;

import ua.artcode.ArrayUtils;

public class SeaBattle {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("input size");
		int size = sc.nextInt();
		char[][] mat = genField(size);
		
		int pointI = ArrayUtils.genRandomNumber(0, size);
		int pointJ = ArrayUtils.genRandomNumber(0, size);
		
		setPoint(mat, pointI, pointJ);
		
		
		while(true){
			System.out.println(genViewOfField(mat));
			System.out.println("Input row 0-" + size);
			int shootI = sc.nextInt();
			System.out.println("Input column 0-" + size);
			int shootJ = sc.nextInt();
			
			if(shoot(mat, shootI, shootJ)){
				System.out.println("You won!");
				break;
			} else {
				String hint = generateHint(pointI, pointJ, shootI, shootJ);
				System.out.println("Try again " + hint);
			}
			
		}
	}
	
	public static String generateHint(int targetI, int targetJ, int shootI, int shootJ){
		String hint = "";
		
		if(targetI > shootI){
			hint += " down";
		} else if(targetI < shootI){
			hint += " up";
		} 
		
		if(targetJ < shootJ){
			hint += " left";
		} else if(targetJ > shootJ){
			hint += " right";
		}
		
		return hint;
	}
	
	public static void setPoint(char[][] field, int i, int j){
		field[i][j] = '+';
	}
	
	public static boolean shoot(char[][] field, int i, int j){
		if(field[i][j] == '+'){
			return true;
		} else {
			field[i][j] = 'X';
			return false;
		}
	}
	
	public static char[][] genField(int size){
		char[][] field = new char[size][size]; 
		for(int i = 0; i < field.length; i++){
			for(int j = 0; j < field[i].length; j++){
				field[i][j] = '0';
			}
		}
		return field;
	}
	
	public static String genViewOfField(char[][] field){
		String title = genTitleOfFiled(field.length) + "\n";
		for(int i = 0; i < field.length; i++){
			title += i + " ";
			for(int j = 0; j < field[i].length; j++){
				 title += (field[i][j] == '+' ? '0' : field[i][j])+ " ";
			}
			title += "\n";
		}
		
		return title;
		
	} 
	
	public static String genTitleOfFiled(int size){
		String title = "  ";
		for(int i = 0; i < size; i++){
			title += i + " ";
		}
		return title;
	}

}
