package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a [] = new int [n];
	int b [] = new int [n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		b[i]=sc.nextInt();
	}
	for(int i=0;i<n;i++){
		for(int j=0;j<n;j++){
		if(a[i]==b[j]){
			System.out.print(a[i]+" ");
		}
	}
}
}
}
