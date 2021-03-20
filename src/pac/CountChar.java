package pac;

import java.util.HashMap;
import java.util.HashSet;

public class CountChar {
	public static void main(String[] ergs) {
		String s="india";
		char[] ch = s.toCharArray();
		int num=1;
		int con=0;
		HashSet<Character> set=new HashSet<Character>();
		/*HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i], num);
			}else {
				num++;
			}
		}*/
		for(int i=0;i<ch.length;i++) {
			set.add(ch[i]);
		}
		for(Character c:set) {
			int count=0;
			for(int i=0;i<ch.length;i++) {
				if(c==ch[i])
					count++;
			}
			System.out.println("count of character "+c+ ": "+count);
			if(count>1) {
				System.out.println(c+": "+count);
				con++;
			}	
		}
		
		System.out.println(con);
	}
}
