package pac;

public class StringFunction {
	public static void main(String[] args) {
	String s3="Abc";
	String s1=new String("abs");
	String s2=new String();
	s2="abs";
	s3="xyz";
	System.out.println(s3);
	System.out.println(s1);
	System.out.println(s2);
	
	/* to reverse the string*/
	String name="India";
	String s="";
	
	System.out.println(name.compareTo(s));
	System.out.println(s.compareTo(name));
	for(int i=name.length()-1;i>=0;i--) {
		s+=name.charAt(i);
		System.out.print(name.charAt(i));
	}
	System.out.println();
	System.out.println(s);
	
	char[] newn=name.toCharArray();
	char[] empty=new char[newn.length];
	String rev="";
	for(int i=0;i<=newn.length-1;i++) {
		empty[i]+=newn[newn.length-1-i];
		System.out.print(newn[newn.length-1-i]);
		rev=newn[i]+rev;
	}
	
	System.out.println();
	System.out.println(rev);
	
	for(char x:empty) {
		System.out.print(x);
	}
}
	}
	
