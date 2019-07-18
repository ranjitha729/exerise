package exampleprogram;

import java.util.Arrays;
import java.util.Scanner;

public class encoding {
public static void main(String [] args){
	Scanner sc =new Scanner(System.in);
	String s = sc.next();
	String s1="";
	String s2="";
	for(int i=0;i<s.length();i++){
		if(i%2==0){
			s1+=s.charAt(i);
		}
		else{
			s2+=s.charAt(i);
		}
	}
	System.out.println(s1+" "+s2);
}       
}
