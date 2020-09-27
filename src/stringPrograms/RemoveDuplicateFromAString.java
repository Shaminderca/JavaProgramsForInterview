package stringPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicateFromAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of String");
		String str = sc.next();
		System.out.println("String Entered is " + str);
		HashSet<Character> set = new HashSet<>();
		StringBuffer sb = new StringBuffer();
		for(int i =0;i<str.length();i++)
		{
			Character c = str.charAt(i);
			if(!(set.contains(c)))
			{
				set.add(c);
				sb.append(c);
			}
		}
		String newStr =sb.toString();
		
        System.out.println(newStr);
	}

}
//Java StringBuffer class is used to create mutable (modifiable) string.
//Java StringBuffer class is thread-safe i.e. multiple threads cannot access it simultaneously.
//HashSet class implements the Set interface
//HashSet does not allow duplicate elements that means you can not store duplicate values in HashSet.
//Both HashSet and HahMaps are non-Synchronised
