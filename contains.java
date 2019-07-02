package guvi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class str {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 int a[] = new int[n];int c=0;
		 int m = sc.nextInt();
		 ArrayList<Integer> al2=new ArrayList<Integer>();
		 int b[] = new int[m];
		 for(int i=0;i<n;i++){
			 a[i] = sc.nextInt();
			 al.add(a[i]);
		 }
		 for(int i=0;i<m;i++){
			 b[i] = sc.nextInt();
			 al2.add(b[i]);
		 }
		 al.retainAll(al2);
		 Iterator itr=al.iterator();  
         while(itr.hasNext()){
          itr.next();
          c++;
         }
		if(c>0){
			System.out.println("yes");
		}
		else{
		System.out.println("no");
}
}
}	
	
