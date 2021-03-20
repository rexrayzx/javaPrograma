package pac;

public class Upparcase {
	public static void main(String[] byg) {
		String s="welcome to india";
		String[] arr=s.split(" ");
		for(int i=0;i<arr.length;i++) {
		String s2=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
		System.out.print(s2+" ");
		}
	
	}
}
