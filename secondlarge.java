package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();int i=0;
	
	int a[] = new int[n];
	for( i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
Arrays.sort(a);
System.out.println(a[1]);
}
}
