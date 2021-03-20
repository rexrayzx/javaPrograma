package pac;

import java.util.HashSet;

public class StringManupulation {
	public static void main(String[] rfg) {
		String s="ram raste se gaya gaya aur raste me hi reh gaya";
		String[] ch = s.split(" ");
		int num=0;
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		for(String c:set) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(c.equals(ch[i]))
					count++;
			}
			if(count>1) {
				System.out.println(c+": "+count);
				num++;
			}
			//System.out.println(c+": "+count);
		}
		System.out.println(num);
	}
}
