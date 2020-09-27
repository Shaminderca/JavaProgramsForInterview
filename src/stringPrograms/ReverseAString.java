package stringPrograms;

import java.util.Scanner;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the String U Want To Reverse");
     String str = sc.nextLine();
     System.out.println("String entered " + str);
     String newStr ="";
     int lengthofStr = str.length();
     for(int i= lengthofStr-1 ; i>=0;i--)
     {
    	 newStr = newStr+str.charAt(i);
     }
     System.out.println("Reveresd String Is " + newStr);
     
	}

}
