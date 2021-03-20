package pac;

public class FibonaciSeries {
	public static void main(String[] args) {
		int a=0;
		int b=1;
		int count=8;
		System.out.println(a);
		System.out.println(b);
		for(int i=0; i<count;i++) {
			int num=a+b;
			System.out.println(num);
			a=b;
			b=num;
		}
	}
}
