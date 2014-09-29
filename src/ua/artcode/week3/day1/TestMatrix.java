package ua.artcode.week3.day1;

import ua.artcode.MatrixHelper;

public class TestMatrix {

	public static void main(String[] args) {
		int[][] mat1 = new int[3][3]; //default values 0
		int[][] mat2 = {{1,2,3},
						{4,5,6,7},
						{65,98,12,346,34}};
		
		int ceil = mat2[1][2];
		mat2[2][1] = ++ceil;
		
		int[] mas = {4,3,1,54,12,34,56};
		mat2[2] = mas;
		
		MatrixHelper.printMatrix(mat1);
		
		int[][] mat = MatrixHelper.generateMatrixWithCondit(5, 5, 100);
		MatrixHelper.printMatrix(mat);
	}

}
