package numberPrograms;

import java.util.Scanner;

public class SumofFirstAndLastDigitOfTheNumber {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The number is " + number);
		//to getlast digit number%10;
		int lastDigit = number%10;
		int firstDigit = number;
		while(number>=10) 
		{
		 firstDigit=number/10;
		}
		System.out.println("First digit is " + firstDigit);
		System.out.println("Last digit is " + lastDigit);
	}

}
