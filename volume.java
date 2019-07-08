package guvi;

import java.util.Scanner;

public class strcmp {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int b = sc.nextInt();
		int h = sc.nextInt();
		int tsa = 0;
		tsa = 2 * ((l*b) + (b*h) + (h*l));
		System.out.println(tsa);
		int vc = 0;
		vc = l * b * h;
		System.out.println(vc);
}
}
	
