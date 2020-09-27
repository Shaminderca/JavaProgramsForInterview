package stringPrograms;

import java.util.Scanner;

public class ReadAndDisplayMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row = sc.nextInt();
		System.out.println("Enter the number of coloumns");
		int col = sc.nextInt();
		System.out.println("Number of rows and coloumns are " + row +" " + col + "respectively");
		int array[][]= new int[row][col];
		System.out.println("Enter the elements of a matrix");
		for(int i=0 ; i<row ; i++) {
			for(int j=0;j<col;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		System.out.println("Displaying the elements of an array");
		for(int i =0 ;i<row;i++)
		
			for(int j=0;j<col;j++) {
			
				System.out.print(array[i][j] + " ");
				System.out.println();
			
		}

	}

}
