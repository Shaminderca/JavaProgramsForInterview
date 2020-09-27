package numberPrograms;

import java.util.Scanner;

public class FindTheNumberDigitsOfAnInteger {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The number is " + number);
		int count =0;
		int digit;
		while(number>0)
		{
			number=number/10;
			count++;
		}
		System.out.println("Number of digits are " + count);
	}

}
