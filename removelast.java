package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(s1.substring(s1.length()-1).concat(s2));
	
	
	}
}
