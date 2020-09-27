package arrayPrograms;

import java.util.Scanner;

public class PrintingEvenElementsOfAnArray {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size = sc.nextInt();
		System.out.println("Size of the array is " + size);
		int array[] = new int[size];
		System.out.println("Enter the values of the array");
		for(int i = 0; i<size; i++) {
			
			array[i] =sc.nextInt();
		}
		System.out.println("The array is");
		for(int j : array) {
			System.out.println(j);
		}
		System.out.println("To print the even number of an array");
		for(int i=2;i<size;i=i+2) {
			System.out.println(array[i]);
		}
	}
}
