package ua.artcode.week3.day2;

import java.util.Arrays;

import ua.artcode.ArrayUtils;

public class TestSort {

	public static void main(String[] args) {
		int[] mas = ArrayUtils.generateRandomMas(10, 0, 100);
		System.out.println(Arrays.toString(mas));
		
		ArrayUtils.bubbleSort(mas);
		
		System.out.println(Arrays.toString(mas));
		
		
	}

}
