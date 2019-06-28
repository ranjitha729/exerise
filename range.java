package guvi;

import java.util.Scanner;

public class str {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l =sc.nextInt();
		int r = sc.nextInt();
		int s =0;
		for(int i=l;i<=r;i++){
			if(i==n && i!=l){
				s = s+n;
			}
		}
		if(s!=0){
			System.out.println("yes");
}
		else{
		System.out.println("no");
		}
}
}
