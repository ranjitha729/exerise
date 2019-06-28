package guvi;

import java.util.Scanner;

public class str {
	public static void main(String[] args) {
		int n;
		Scanner	sc = new Scanner(System.in);		
	    n = sc.nextInt();
	    int s = sc.nextInt();
	    int a[] = new int[n];
	    for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
	}
	    
	  System.out.println(a[s-1]);
	
		
		
		}
}
