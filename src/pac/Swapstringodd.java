package pac;

public class Swapstringodd {
	public static void main(String[] args) 
	{
		String s="welcome to tys"; // for odd string  o/p=to welcome tys
		String s1[]=s.split(" ");
		int n = s1.length;
		if(s1.length%2!=0)
		{
			n=s1.length-1;
		}
		
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				String temp=s1[i];
				s1[i]=s1[i+1];
				s1[i+1]=temp;
				
			}
		}
		for(int i=0;i<s1.length;i++)
		{
			System.out.print(s1[i]+" ");
		}
	}
}
