package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k=sc.nextInt();int i=0;
	int a [] = new int [n];
	for( i=0;i<n;i++){
		a[i]=sc.nextInt();
	}int r=0;
	for(i=0;i<n;i++){
		if(a[i]==k){
			r=i+1;
		}
	}
		System.out.print(r);
		
}
}

