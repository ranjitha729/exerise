package guvi;

import java.util.Scanner;

public class reverse {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String str=sc.nextLine();
	    String a[]=str.split(" ");
	    String t="";
	    for(int i=0;i<a.length;i++){
	    	StringBuffer s = new StringBuffer(a[i]);
	    	t+=s.reverse().toString()+" ";
	    }
	    System.out.println(t);
	    
}
}
