package pac;

public class RemoveWords {
	public static void main(String[] args) {
		String s="welcome to india welcome to mandya";
		String[] arr=s.split(" ");
		String s1="";
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i].equals(arr[j]))
					arr[j]=" ";
			}
		}
		
		System.out.println(s1);
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=" ")
				System.out.print(arr[i]+" ");
		}
	}
}
