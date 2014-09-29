package ua.artcode;

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
	
	public static String genaratePass(int length){
		String pass = "";
		
		// start, end , way
		while(length > 0){
			
			int range = (int)(Math.random() * 3);
		
			
			if(range == 0){
				pass += (char)genRandomNumber(48, 57);
			} else if(range == 1){
				pass += (char)genRandomNumber(65, 90);
			} else {
				pass += (char)genRandomNumber(97, 122);
			}
			length--;
		}
		
		return pass; // exit from method with result
		
	}
	
	public static int genRandomNumber(int low, int hight){
		return low + (int)(Math.random() * (hight - low));
	}
	
	public static int[] replaceNumber(int[] mas, int target, int replace){
		for(int i = 0; i < mas.length; i++){
			if(mas[i] == target){
				mas[i] = replace;
			}
		}
		return mas;
	}
	
	public static int find(int lucky, int range){
		int start = 0;
		int end = range;
		int choise = -1;
		int count = 0;
		
		
		while(choise != lucky){
			choise = start + ((end - start) / 2);
			if(choise > lucky){
				end = choise - 1;
			} else if(choise < lucky){
				start = choise + 1;
			} else {
				break;
			}
			count++;
		}
		
		return count;
		
	}
	
	public static void bubbleSort(int[] mas){
		for(int j = 0; j < mas.length; j++){
			for(int i = 0; i < mas.length - 1 - j; i++){
				if(mas[i] > mas[i+1]){
					swap(mas, i, i+1);
				}
			}			
		}
	}
	
	public static void swap(int[] mas, int first, int second){
		int temp = mas[first];
		mas[first] = mas[second];
		mas[second] = temp;
	}
	
}
