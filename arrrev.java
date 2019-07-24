package guvi;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		int b[]=new int[n];
		int c=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			b[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			for(int j=n-1;j>=0;j--){
				if(a[i]==b[j]){
					c++;
					break;
				}
			}
			
		}
		if(c==n){
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
		
}
}
