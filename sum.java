package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String[] args) {
		int n;
		Scanner	sc = new Scanner(System.in);		
	    n = sc.nextInt();
	    int sum =0;
	    int a[] = new int[n];
	    for(int i=0;i<n;i++){
		    a[i] = sc.nextInt();
		    sum = sum +a[i];
	}
	    
	  System.out.println(sum);
	
		
		
		}
}
