package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int a[] = new int[n];
	int i=0;
		for(  i=0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		i = n-k;
		System.out.println(a[i]);
		}
		}
