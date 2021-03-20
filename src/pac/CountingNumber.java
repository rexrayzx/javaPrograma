package pac;

public class CountingNumber {

	public static void main(String[] args) {
		int[] c= {4,2,3,5,6,1};
		for(int i=0;i<c.length;i++) {
		
			for(int j=0;j<c.length;j++) {
				
				if(c[i]+c[j]==7) {
					System.out.print(c[i]+" , "+c[j]);
				}
			
			}
		
		}

	}


}
