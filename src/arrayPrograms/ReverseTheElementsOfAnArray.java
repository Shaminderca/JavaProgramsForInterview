package arrayPrograms;

import java.util.Scanner;

public class ReverseTheElementsOfAnArray {

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
		System.out.println("Now let's reverse this array");
		int low = 0;
		int high =arraySize-1;
		while(low<high) {
			int temp;
			temp = array[high];
			array[high]=array[low];
			array[low]=temp;
			low++;
			high--;
			
		}
		System.out.println("Reversed Array Is");
		for(int j : array) {
			System.out.println(j);
		}

	}

}
