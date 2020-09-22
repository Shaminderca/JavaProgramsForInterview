package stackPrograms;

import java.util.Scanner;
import java.util.Stack;

public class BalancedStringProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the String");
      String str = sc.next();
      System.out.println("String Entered Is " + str);
      Stack<Character> st = new Stack<>();
      for(int i =0;i<str.length();i++) {
    	  char c = str.charAt(i);
    	  if(st.empty())
    	  {
    		  st.push(c);
    	  }
    	  else if
    	  (c=='{' || c=='(' || c=='[')
    	  {
    		  st.push(c);
    	  }
    	  else if
    	  (c=='}'  && st.peek() == '{')
    	  {
    		  st.pop();
    	  }
    	  
    	  else if
    	  (c==')'  && st.peek() == '(')
    	  {
    		  st.pop();
    	  }
    	  
    	  else if
    	  (c==']'  && st.peek() == '[')
    	  {
    		  st.pop();
    	  }
      }
      if(st.isEmpty()) {
    	  System.out.println("String is well formed");
      }
      else {
    	  System.out.println("String is now well formed");
    	  
      }
      
	}

}
