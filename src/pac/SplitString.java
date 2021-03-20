package pac;

public class SplitString {
	public static void main(String[] args) {
		String s="my name is raj";
		String[] nstring=s.split(" ");
		String rev="";
		String rev1="";
		for(int i=nstring.length-1;i>=0;i--) {
			System.out.print(nstring[i]+" ");
			rev+=nstring[i]+" ";
			rev1=rev1+" "+nstring[i];
		}
		System.out.println();
		rev.trim();
		System.out.println(rev);
		System.out.println(rev1);
		for(String x:nstring) {
			System.out.println(x);
		}
	}
}
