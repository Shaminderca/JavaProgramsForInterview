package numberPrograms;

import java.util.Scanner;

public class NumberIsPerfectSquareOrNot {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		System.out.println("The number is " + number);
		for(int i = 1 ; i<number/2;i++) {
			if(i*i==number) {
				System.out.println("Number " + number + " is a perfect square of " + i);
				return;
			}
			else {
				break;
			}
			
	}
	
	}}
