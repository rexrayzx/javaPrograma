package pac;

import java.util.ArrayList;
import java.util.HashSet;

public class AdditionNumber {
	/* if addition of number is 7*/
	public static void main(String[] yfd) {
		int[] ch= {1,3,4,5,2,6,9,7,3,5,1};
		HashSet<Integer> set=new HashSet<Integer>();
		ArrayList<Integer>al=new ArrayList<Integer>(set);
		for(int i=0;i<ch.length;i++) {
			al.add(ch[i]);
		}
		
		ch=new int[al.size()];
		
		//for()
		/*for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}*/
		
		//ch=new int[set.size()];
		
		/*int count=0;
		for(int x:set) {
			ch[count]=x;
			count++;
		}*/
		
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1;j<ch.length;j++) {
				if(ch[i]+ch[j]==7) {
					System.out.println(ch[i]+","+ch[j]);
				}
			}
		}
	}
}
