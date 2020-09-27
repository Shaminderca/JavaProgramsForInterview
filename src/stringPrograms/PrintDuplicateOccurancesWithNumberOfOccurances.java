package stringPrograms;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicateOccurancesWithNumberOfOccurances {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of String");
		String str = sc.next();
		System.out.println("String Entered is " + str);
		HashMap<Character, Integer> map = new HashMap<>();
		char array[] = str.toCharArray();
		for(char c : array) {
			if(!(map.containsKey(c))) {
				map.put(c, 1);
			}
			else {
				map.put(c, map.get(c)+1);
			}
		}
		Set<Character> keys = map.keySet();
		for(Character i : keys) {
			if(map.get(i)>1) {
			System.out.println(i +":" + map.get(i));
		}
	}

}
}

//HashMap is a Map based collection class that is used for storing Key & value pairs,
//it is denoted as HashMap<Key, Value> or HashMap<K, V>.