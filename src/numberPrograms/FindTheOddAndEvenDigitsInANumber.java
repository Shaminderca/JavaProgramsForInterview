package numberPrograms;

import java.util.Scanner;

public class FindTheOddAndEvenDigitsInANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The number is " + number);
		int count =0;
		int countEven =0;
		int countOdd=0;
		int digit;
		while(number>0)
		{
			digit = number%10;
			if(digit%2 == 0)
			{
				countEven++;
			}
			else {
				countOdd++;
			}
			number=number/10;
			count++;
		}
		System.out.println("Number of digits are " + count);
		System.out.println("Number of Even digits are " + countEven);
		System.out.println("Number of Odd digits are " + countOdd);

	}

}
