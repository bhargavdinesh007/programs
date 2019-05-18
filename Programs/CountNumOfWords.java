package jj.kk.ll;

import java.util.Scanner;

public class CountNumOfWords {
	public static int countWords(String str) {
	int count=1;
	for(int i=0;i<=str.length()-1;i++) {
		if(str.charAt(i)==' '&& str.charAt(i+1)!=' ') {
			count++;
		}
	}
return count;
	
	}
	
public static void main(String[] args) {
Scanner s=new Scanner(System.in);
System.out.println("Enter a sentence:");
String sentence=s.next();
System.out.print("Your sentence has"+countWords(sentence)+"words.");
}
}