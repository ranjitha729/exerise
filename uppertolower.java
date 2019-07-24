package guvi;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String r="";
		for(int i=0;i<str.length();i++){
			if(Character.isUpperCase(str.charAt(i))){
				r+=Character.toLowerCase(str.charAt(i));
			}
			else{
				r+=Character.toUpperCase(str.charAt(i));
			}
		}
		System.out.println(r);
		
}
}
