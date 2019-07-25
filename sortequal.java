package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[] = new int [n];
		int c[]=new int [n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[i]=a[i];
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(b[i]==a[j]){
					c[i]=j+1;
				}
			}
		}
	for(int i=0;i<n;i++){
		System.out.print(c[i]+" ");
	}
		
}
}



