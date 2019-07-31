package exampleprogram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class encoding {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     String s = sc.nextLine();
	     String t="";
	     String str[]=s.split(" ");
	     for(int i=0;i<str.length;i++){
	    	 StringBuffer s1 = new StringBuffer(str[i]);
	    	 t+= s1.reverse().toString();
	    	 t+=" ";
	    	 }
	    	System.out.println(t);
	    }
	}
