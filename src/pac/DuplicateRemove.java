package pac;

import java.util.HashSet;

public class DuplicateRemove {
	public static void main(String[] args) {
		String s="india";
		char[] arr=s.toCharArray();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j])
					arr[j]=0;
			}
		}
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=0)
				System.out.print(arr[i]);
		}
	}
}
