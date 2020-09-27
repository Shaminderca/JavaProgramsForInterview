package stringPrograms;

public class AdditionOfString {
	public static void main(String args[])
	{
		String s1 = "111";
		String s2 = "222";
		
		int s1New = Integer.parseInt(s1);
		int s2New = Integer.parseInt(s2);
		int sum = s1New + s2New;
		
		System.out.println("The sum is " + sum);
	}

}
//If S1 is like 111ab or any alphabat then it will throw an error;