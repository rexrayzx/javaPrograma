package pac;

public class ReversewordsString {
	public static void main(String[] fgf) {
		String s="welcome to tyss";
		String cha="";
		String[] arr = s.split(" ");
		
	
		
		
		String cha1="";
		String[] arr1=s.split("");
		for (int i = arr1.length-1; i >=0 ; i--) {
			cha1+=s.charAt(i);
		}
		
		System.out.println(cha1);
		
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			String s1="";
			for(int j=arr[i].length()-1;j>=0;j--) {
				s1+=arr[i].charAt(j);
			}
			cha=cha+s1+" ";
		}
		
		System.out.println(cha);
	}
}
