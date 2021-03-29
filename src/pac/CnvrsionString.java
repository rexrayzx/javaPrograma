package pac;

public class CnvrsionString {

	public static void main(String[] args) {
		int i=123;
		Integer j=i;
		String h=j.toString();
		//System.out.println(h.length());
		for(int k=0;k<h.length();k++) {
			System.out.println(h.charAt(k));
		}

	}

}
