package arrayPrograms;

import java.util.Scanner;

public class FirstDuplicateAccuranceOfAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		for(int i =0 ; i<arraySize; i++) {
			for(int j=i+1;j<arraySize;j++) {
				if(array[i]== array[j]) {
					System.out.println("The first accurance is " +array[i]);
					return;
				}
			}
		}
	}

}
