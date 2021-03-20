package pac;

import java.util.Arrays;

public class SwitchWords {
	public static void main(String[] jhg) {
		String s="welcome to test yantra";
		String[] arr=s.split(" ");
		 String temp=arr[0];
		 arr[0]=arr[arr.length-1];
		 arr[arr.length-1]=temp;
		 
		 for(int i=0;i<arr.length;i++) {
			 System.out.print(arr[i]+" ");
		 }
	}
}
