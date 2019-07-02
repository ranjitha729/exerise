package guvi;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String r = "";
		Stack st = new Stack();
		for(int i=0;i<s.length();i++){
			st.push(s.charAt(i));
		}
		while(!st.empty()){
			r = r + st.pop();
		}
		if(s.equals(r)){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
	}
}
	
