package ass05;

import java.util.Scanner;

public class ass1 {
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String s1 = s;
	String p = "";
	StringBuffer s2 = new StringBuffer(s);
	p = p + s2.reverse();
	if(s.equals(p)){
		System.out.println("yes");
	}
	else{
		System.out.println("no");
	}
}
}
