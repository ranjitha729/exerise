package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
	int i=0,val=0,c=0;
		for(  i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		for(i=0;i<n;i++){
			for(int j = i+1;j<n;j++){
				val = a[i]+a[j];
				if(val==k){
					c++;
				}
			}
		}
		if(c>0){
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}
		}
		}

	
	
