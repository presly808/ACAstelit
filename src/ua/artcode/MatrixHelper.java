package ua.artcode;

public class MatrixHelper {

	public static void printMatrix(int[][] matrix){
	
		for(int i = 0; i < matrix.length; i++){
			ArrayUtils.printMas(matrix[i]);
		}
	
	}
	
	public static int[][] generateMatrixWithCondit(int rowsSize, int columnSize, int range){
		int[][] mat = new int[rowsSize][columnSize];
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				int random = ArrayUtils.genRandomNumber(0, range);
				boolean isOdd = random % 2 == 0;
				mat[i][j] = (i % 2 == 0) ? (isOdd ? random : random+1) : (isOdd ? random + 1 : random); 
			}
		}
		return mat;
	}
	
	
	public static int[][] generateMatrix(int rowsSize, int columnSize, 
												int lowRange, int hightRange){
		int[][] mat = new int[rowsSize][columnSize];
		for(int i = 0; i < mat.length; i++){
			for(int j = 0; j < mat[i].length; j++){
				mat[i][j] = ArrayUtils.genRandomNumber(lowRange, hightRange);; 
			}
		}
		return mat;
	}
	
}
