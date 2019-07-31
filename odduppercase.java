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
	    	 for(int j=0;j<str[i].length();j++){
	    	 if(j%2==0){
	    		 t+=(str[i].charAt(j)+"").toUpperCase();
	    		}else{
	    			 t+=str[i].charAt(j)+"";
	    		 }
	    	 }
	    	 t+=" ";
	     }
	     System.out.println(t);
	    }
	}
