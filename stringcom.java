package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s1 = sc.next();
	String s2 = sc.next();
	s1=s1.toLowerCase();
	s2=s2.toLowerCase();
	if(s1.equals(s2)){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
	
}
}
