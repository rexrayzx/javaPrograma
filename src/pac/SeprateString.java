package pac;

public class SeprateString {
	public static void main(String[] gyu) {
		String s="123@abc456$xyz";
		char[] ch=s.toCharArray();
		String specail="";
		String upper="";
		String number="";
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='A' && ch[i]<='z') {
				upper+=ch[i];
			}else if(ch[i]>='0' && ch[i]<='9') {
				number+=ch[i];
			}else {
				specail+=ch[i];
			}
		}
		System.out.println(upper);
		System.out.println(specail);
		System.out.println(number);
	}
}
