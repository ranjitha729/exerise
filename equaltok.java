package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int k=sc.nextInt();int c=0;
	int a [] = new int [n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	Arrays.sort(a);
	for(int i=0;i<n;i++){
		if(a[i]==k){
			c++;
		}
	}
	System.out.println(c);
}
}
