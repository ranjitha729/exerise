package Guvi;
import java.util.*;
public class Set1Nine {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int a[]=new int[n];
int val=0;
for(int i=0;i<n;i++){
a[i]=scan.nextInt();

}
for(int i=0;i<n;i++){
for(int j=i+1;j<n;j++){
val=a[i]+a[j];
if(val==0){
System.out.println(a[i]+" "+a[j]);
}
}
}

}
}
