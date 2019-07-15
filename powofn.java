package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();int s=1;
	//System.out.print((int)Math.pow(a, b));
	for(int i=1;i<=b;i++){
		s=s*a;
	}
	System.out.println(s);
}
}

