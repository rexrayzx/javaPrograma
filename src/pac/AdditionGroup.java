package pac;

public class AdditionGroup {
	public static void main(String[] gguh) {
	
			String s="ABC123@$45xy67";
			int sum=0;
			int num=0;
			for(int i=0;i<s.length();i++)
			{
				if((s.charAt(i)>='0' && s.charAt(i)<='9'))
				{
					int n=s.charAt(i)-48;
					num=num*10+n;
				}
				else
				{
					sum=sum+num;
					num=0;
				}
			}
			System.out.println(sum);	 
		}
	
}
