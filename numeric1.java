package guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();String p ="";
		char [] c= s.toCharArray();
		for(int i=0;i<s.length();i++){
			if(Character.isAlphabetic(c[i])){
				p = p + c[i];
					}
			}
			if(p==""){
				System.out.println("yes");
			}
			else{
				System.out.println("no");
			}
		}
		
}
