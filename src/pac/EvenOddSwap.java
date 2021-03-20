package pac;

public class EvenOddSwap {
	public static void main(String[] args) {
		String s="welcome to india mandya pandya handya";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length-1; i+=2) {
			String temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}
}
