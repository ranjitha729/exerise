package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	int a[] = new int[n];
	int b[] = new int[n];
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
		b[i]=a[i];
	}
Arrays.sort(a);

int c=0;
for(int i=0;i<n;i++){
	for(int j=0;j<n;j++){
		if(a[i]==b[j]){
			c++;
		}
		else{
			break;
		}
		
	}
}
if(c==n){
	System.out.println("yes");
}
else{
	System.out.println("no");
}
}
}
