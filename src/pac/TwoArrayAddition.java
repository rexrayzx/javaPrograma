package pac;

public class TwoArrayAddition {
	public static void main(String[] args) {
		int [] arr= {20,30,40,10,5,6};
		int[] arr1= {30,40};
		for(int i=0;i<arr1.length;i++) {
			arr[i]+=arr1[i];
		}
		for(int x:arr) {
			System.out.println(x);
		}
	}
}
