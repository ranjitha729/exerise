package guvi;

import java.util.Scanner;

public class strcmp {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str1 = sc.next();
		int n = sc.nextInt();
		String p="";
		char [] c = str1.toCharArray();
		for(int i = c.length-1;i>=0;i--){
			p = p + c[i];
		}
		System.out.println(p.substring(0,n));

}
}
