package pac;

public class StringInt {
	public static void main(String[] hdf) {
		String s="123";
		int in = Integer.parseInt(s);
		int sum=0;
		while(in!=0) {
			int rem=in%10;
			sum+=rem;
			in=in/10;
		}
		System.out.println(sum);
	}
}
