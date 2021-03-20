package pac;

public class FindLeastLeanthString {
	public static void main(String[] vgf) {
		String s="welcome to india";
		String[] arr = s.split(" ");
		String s1=arr[0];
		String s2=arr[0];
		int l=0;
		l=arr[0].length();
		for(int i=0;i<arr.length;i++) {
			if(s1.length()>arr[i].length()) {
				s1=arr[i];
			}
			if(l>arr[i].length())
				l=arr[i].length();
		}
		
		for(int i=0;i<arr.length;i++) {
			if(s2.length()<arr[i].length()) {
				s2=arr[i];
			}
		}
		
		System.out.println(s2);
		
		System.out.println(s1);
		
		System.out.println(l);
		for(int i=0;i<arr.length;i++) {
			if(arr[i].length()==l) {
				System.out.println(arr[i]);
			}
		}
	}
}
