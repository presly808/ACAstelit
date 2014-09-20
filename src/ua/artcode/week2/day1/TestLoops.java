package ua.artcode.week2.day1;

public class TestLoops {

	public static void main(String[] args) {
		// for, while, do-while
		// start condition, end condition, way condition 
		
		//for()
		
		for(int i = 0; i < 10; i++){
			System.out.println(i);
		}
		
		int num = 200;
		
		for(int start = 1, end = num; start < end; start++, end--){
			System.out.print(start + ", " + end + ", ");
		}
		
		int end = 100;
		while(end > 0){
			System.out.println(end);
			end--;
		}
		
		do {
			end++;
			System.out.println(end);
		} while (end < 100);
		
	}

}
