package pac;

public class AdditionOfGroup {
	public static void main(String[] gft) {
		String s="123hugt$#hd14jy76";
		String str="";
		char[] ch = s.toCharArray();
		int sum=0;
		for (int i = 0; i < s.length(); i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]=' ';
			}else if(ch[i]>='0'&&ch[i]<='9') {
				
			}else {
				ch[i]=' ';
			}
		}
		for (int j = 0; j < ch.length; j++) {
			System.out.println(ch[j]);
			str+=ch[j];
		}
		String[] strArr = str.split(" ");
		for (int i = 0; i < strArr.length; i++) {
			System.out.println(strArr[i]);
		}
		
		for (int i = 0; i < strArr.length-1; i++) {
			if(strArr[i].equals(" ")|| strArr[i].equals("  ")){
				
			}else {
			int num=Integer.parseInt(strArr[i]);
			sum+=num;
			}
		}
		System.out.println(sum);
	}
}
