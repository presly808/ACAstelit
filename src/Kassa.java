import java.util.Scanner;


public class Kassa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input amount");
		double amount = sc.nextInt();
		double sale = 0.0;
		
		if(amount >= 1000 && amount < 2000){
			sale = 0.20;
		} else if(amount >= 2000 && amount < 5000){
			sale = 0.25;
		} else if(amount >= 5000){
			sale = 0.30;
		}
		
		if(amount >= 0){
			double amountAfterSale = amount - amount * sale;
			System.out.println("Before sale a = " + amount);
			System.out.println("Sale is " + (int)(sale * 100) + "%");
			System.out.println("Amount after sale " + amountAfterSale);
		} else {
			System.out.println("invalid amount, buy again");
		}
		
	}

}
