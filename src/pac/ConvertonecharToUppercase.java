package pac;

class Conver{
	public void upprc(String s,char c) {
		String str="";
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)==c) {
				str+=(s.charAt(i)+"").toUpperCase();
			}else {
				str+=s.charAt(i);
			}
			}
		System.out.println(str);
	}
}




public class ConvertonecharToUppercase {
	public static void main(String[] args) {
		
		Conver con=new Conver();
		con.upprc("India",'i');
	
	}
	
	
	
	
}
