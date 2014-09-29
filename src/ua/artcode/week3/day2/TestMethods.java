package ua.artcode.week3.day2;

public class TestMethods {

	public static void main(String[] args) {
		System.out.println(fibbLoop(9));
	}

	public static void a() {
		System.out.println("In a");
		b();
	}

	public static void b() {
		System.out.println("In b");
		c();
	}

	public static void c() {
		System.out.println("In c");
	}
	
	public static int fact(int num){
		if(num == 1){
			return 1;
		}
		 
		int returned = fact(num - 1);
		int result = num * returned;
		
		return result;
	}
	
	public static int fibb(int pos){
		if(pos <= 2){
			return 1;
		}
		
		return fibb(pos - 2) + fibb(pos - 1);
		
	}
	
	public static int fibbLoop(int pos){
		int[] mas = new int[pos];
		mas[0] = 1;
		mas[1] = 1;
		
		for(int i = 2; i < pos; i++){
			mas[i] = mas[i-2] + mas[i-1];
		}
		return mas[pos-1];
	}
	
	public static void recur(){
		recur();
	}

}
