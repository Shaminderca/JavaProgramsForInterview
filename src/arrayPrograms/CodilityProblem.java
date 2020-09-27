package arrayPrograms;

import java.util.Scanner;

public class CodilityProblem {
	
	public static void main(String args[]) {
		 
		CodilityProblem obj = new CodilityProblem();
		System.out.println("Smallest Positive Interger That Does Not Occur In Array IS  " + obj.Solution());
	}

	public int Solution() {
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
		System.out.println("Rearranged Array Is");
		for(int i=0;i<arraySize;i++) {
			for(int j=i+1;j<arraySize;j++) {
	            if(array[i]>array[j])
	            {
	              int temp;
	              temp=array[j];
	              array[j]=array[i];
	              array[i]=temp;
	            }
			}
		}
		for(int k : array) {
			System.out.println(k);
		} 
		int smallestPositiveInt = 1;
		if(arraySize==0) {
			return smallestPositiveInt;
		}
		if(arraySize-1<=0) {
			return smallestPositiveInt;
		}
		for(int i =0 ; i< arraySize; i++) {
			if(array[i]==smallestPositiveInt) {
				smallestPositiveInt++;
			}
		}
		return smallestPositiveInt;
	}
	
}
