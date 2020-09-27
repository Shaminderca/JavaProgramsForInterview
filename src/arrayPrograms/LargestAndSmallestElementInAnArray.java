package arrayPrograms;

import java.util.Scanner;

public class LargestAndSmallestElementInAnArray {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array you want");
		int arraySize = sc.nextInt();
		int array[] = new int[arraySize];
		System.out.println("Enter the values in array");
		for(int i=0;i<arraySize;i++) {
			array[i] = sc.nextInt();
		}
		System.out.println("The arry Is");
		for(int j : array) {
			System.out.println(j);
		}
		
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		
		for(int i : array) {
			if(i>max)
			{
				max=i;
			}
		}
		System.out.println("The largest number is " + max);
		
		
		for(int i : array) {
			if(i<min)
			{
				min=i;
			}
		}
		System.out.println("The smallest number is " + min);
	}

}
