package pac;

public class Palndrome {
	public static void main(String[] hguy) {
	int num=151;
	int n=num;
	int rev=0;
	while(n>0) {
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
	}
	if(num==rev)
		System.out.println(num+" is pelandrome");
	else
		System.out.println(num+" is not palendrome");
	}
}
