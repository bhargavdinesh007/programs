package jj.kk.ll;

import java.util.Scanner;

public class ReverseWord {
public static void main(String[] args) {
	System.out.println("enter name to reverse:");
Scanner s=new Scanner(System.in);
String str=s.nextLine();
String reverse="";
for(int i=str.length()-1;i>=0;i--) {
	reverse=reverse+str.charAt(i);
	
}
System.out.println("reversed string is:");
System.out.println(reverse);
}
}
