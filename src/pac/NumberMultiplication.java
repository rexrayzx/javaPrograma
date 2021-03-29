package pac;

public class NumberMultiplication {
	public static void main(String[] args) {
		int n1=4674;
		int n=n1;
		int count=0;
		while(n>0) {
			count++;
			n/=10;
		}
		
		for (int i = 1; i <= count; i++) {
			int fact=1;
			int num=n1;
			for (int j = 1; j <= count; j++) {
				int div=num%10;
				if(i!=j) {
					fact*=div;
				}
				num/=10;
			}
			System.out.println(fact);
		}
	}
}
