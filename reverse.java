package guvi;

import java.util.Scanner;

public class str {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=0;
		while(n!=0){
			r = n % 10;
			System.out.print(r);

			n = n / 10;
		}
}
}
