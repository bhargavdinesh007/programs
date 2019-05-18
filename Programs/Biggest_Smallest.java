package jj.kk.ll;

public class Biggest_Smallest {
	 public static void main(String[] args) {
			
			
			int arr[]= {11,56,98,90};
			int l=arr[0];
			int sl=arr[0];
			
			for(int i=0; i<arr.length;i++)
			{
				System.out.println("given arrays are: "+arr[i]+"");
			}
			
			for(int i=0; i<arr.length;i++)
			{
				if(arr[i]>l) {
					sl=l;
					l=arr[i];
					
				}
				else if(arr[i]>sl)
				{
					sl=arr[i];
				}
			}
			{
				System.out.println("first largest  array is: "+l);
		System.out.println("second largest array is: "+sl);	
		}
	    
	 }
}


