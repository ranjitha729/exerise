package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();int c=0;
		int s = sc.nextInt();
		int a[] = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextInt();
			if(a[i]==s){
				c++;
			}
			}
		
		System.out.println(c);	
			
			
}
}
