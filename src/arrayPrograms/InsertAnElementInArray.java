package arrayPrograms;

import java.util.Scanner;

public class InsertAnElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = new int[5];
		int length =  a.length;   
		System.out.println(a.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the elements of an array");
		for(int i=0;i<length-1;i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("Printing the elements of an array");
		for(int j : a)
		{
			System.out.println(j);
		}
		System.out.println("Enter the index where you want to enter the value");
	//	Scanner sc2 = new Scanner(System.in);
	    int place = sc.nextInt();
	    if(place>=5) {
	    	System.out.println("Invalid index Try Again Please");
	    	System.exit(0);
	    }
	    else {
	    System.out.println("Enter the value at u want to enter");
	    }
	    int value = sc.nextInt();
	    for(int i = a.length-1; i > place;i--)
	    {
	    	a[i]=a[i-1];
	    	
	    	System.out.println("i value is" + i);
	    	System.out.println(a[i]);
	    }
	    a[place]=value;
	    for(int i:a) {
	    	System.out.println(i);
	    }
	
	    

	}

}
