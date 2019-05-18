package jj.kk.ll;

public class ReverseSentance {
public static void main(String[] args) {
	String sent="today is wednesday";
	char ch[]=sent.toCharArray();
	int n=ch.length;
	for(int i=0;i<n;i++) {
		ch[i]=ch[n-i-1];
	}
	System.out.println("\n after reverse:");
	for(int i=0;i<n;i++) {
		System.out.print(ch[i]+" ");
	}
}
}
