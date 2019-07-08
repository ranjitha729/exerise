package guvi;

import java.util.Scanner;

public class strcmp {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=0;
		while(n != 0){
			r = n % 10;
			if(r % 2 != 0){
				System.out.println(r);
			}
			n = n / 10;
		}
}
}	
