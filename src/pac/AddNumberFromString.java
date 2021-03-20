package pac;

public class AddNumberFromString {
	public static void main(String[] hff) {
		String s="abc123@4$xyz";
		String num="";
		char[] ch=s.toCharArray();
		int sum=0;
		int sum1=0;
		
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]>='0'&& ch[i]<='9') {
			int n1 = ch[i]-48;
			sum1+=n1;
			}
		}
		
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0'&& s.charAt(i)<='9')
				num+=s.charAt(i);
			
		}
		int n=Integer.parseInt(num);
		while(n>0) {
			int rem=n%10;
			sum+=rem;
			n/=10;
		}
		System.out.println(sum);
		System.out.println(sum1);
	}
}
