package numberPrograms;

import java.util.Scanner;

public class SumOfDigitsOfANumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The number is " + number);
		int num = number;
		int sum = 0;
		int digit =0;
		while(num>0) {
			digit=num%10;
			sum=sum+digit;
			num=num/10;
			
		}
		System.out.println("The sum is " + sum);
	}

}
