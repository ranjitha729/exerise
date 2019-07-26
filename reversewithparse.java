package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		StringBuffer str=new StringBuffer(s1);
		String s2 = str.reverse().toString();
		for(int i=0;i<s2.length();i++){
			if(i==s2.length()-1){
				System.out.print(s2.charAt(i));
			}
			else{
				System.out.print(s2.charAt(i)+"-");
			}
		}
		
	
	
	}
}


		


