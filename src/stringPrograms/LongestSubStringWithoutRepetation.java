package stringPrograms;

import java.util.HashSet;
import java.util.Scanner;

public class LongestSubStringWithoutRepetation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of String");
		String str = sc.next();
		System.out.println("String Entered is " + str);
		System.out.println("let's find the longest substring from the " + str);
		HashSet<Character> setValue = new HashSet<Character>();
		String longestOverall = "";
		String longestTillNow = "";
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (setValue.contains(c)) {
				longestTillNow = "";
				setValue.clear();
			} else {
				setValue.add(c);
				longestTillNow = longestTillNow + c;
			}
			if (longestTillNow.length() > longestOverall.length()) {
				System.out.println("Entered into IF ######## statement and updating longestOverall i is " + i);
				longestOverall = longestTillNow;
				System.out.println("longestOverALL Now Is +  " + longestOverall);
			}

		}
	}
}
