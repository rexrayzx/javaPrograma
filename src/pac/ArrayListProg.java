package pac;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProg {
	public static void main(String[] args) {
		ArrayList<Integer> num=new ArrayList<Integer>();
		for(int i=11;i<=20;i++) {num.add(i);}
		for (int i = 0; i < num.size(); i+=2) {
			if(num.get(i)==17) {
				System.out.println("sevnteen");
			}else {
				System.out.println(num.get(i));
			}
		}
	}
}
