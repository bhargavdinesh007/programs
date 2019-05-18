package jj.kk.ll;

import java.lang.reflect.Array;
import java.util.Arrays;

public class RemoveDuplicateElements {
	public static int removeDuplicateElements(int arr[],int n) {
	if(n==0||n==1) {
		return n;
	}
	int[] temp=new int[n];
	int j=0;
	for(int i=0;i<-1;i++) {
	if(arr[i]!=arr[i+1]) {
		temp[j++]=arr[i];
	}
}
	temp[j++]=arr[n-1];
	//changing original array
	for(int i=0;i<j;i++) {
		arr[i]=temp[i];
	}
	return j;
	}
public static void main(String[] args) {
	int arr[]= {10,70,30,90,90,20,90,40,50};
	Arrays.sort(arr);
	int length=arr.length;
	length=removeDuplicateElements(arr, length);
	//printing array elements
	for(int i=0;i<length;i++)
		System.out.println(arr[i]+" ");
}
}