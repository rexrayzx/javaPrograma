package pac;

public class CompateString {

	public static void main(String[] args) {
		String s="india";
		String s1="abd";
		String s2="i";
		String s3="ixy";
		String s4="india";
		String s5="ind";
		
		
		
		System.out.println(s.compareTo(s1));
		System.out.println(s.compareTo(s2));
		System.out.println(s.compareTo(s3));
		System.out.println(s.compareTo(s4));
		System.out.println(s2.compareTo(s));
		System.out.println(s.compareTo(s5));
		System.out.println(s5.compareTo(s));
	}

}
