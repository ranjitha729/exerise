package guvi;

import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String n = sc.next();
	String m = sc.next();
	if(n.contains(m)){
		System.out.println("yes");
	}else{
	System.out.println("no");
	}
}
}
