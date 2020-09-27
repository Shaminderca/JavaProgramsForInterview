package stringPrograms;

import java.util.Scanner;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		     Scanner sc = new Scanner(System.in);
		     System.out.println("Enter the String U Want To Reverse");
		     String str = sc.nextLine();
		     String newString="";
		     System.out.println("String entered " + str);
		     String strArray[] = str.split(" ");
		     int lengthofArray = strArray.length;
		     for(int i = lengthofArray-1 ; i>=0;i--)
		     {
		    	newString = newString +  strArray[i];
		     }
		     System.out.println(newString);

	}

}
