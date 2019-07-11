package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class largeno {
public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String r = sc.next();int c=0;
	for(int i=0;i<s.length();i++){
		for(int j=0;j<r.length();j++){
			if(s.charAt(i)==r.charAt(j)){
				c++;
			}else{
				break;
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
