package pac;
/**
 * 
 * @author Rajiv
 *
 */
public class Sort {
	/**
	 * To sort the Array in descending order
	 * @param args
	 */
	public static void main(String[] args) {
		int [] arr= {20,30,40,10};
		int n=arr.length;
		int sum=0;
		int minsum=0;
         for(int i=0; i <n-1; i++){  
                 for(int j=i+1; j <n; j++){  
                          if(arr[i] < arr[j]){  
                        	  arr[i]=arr[i]+arr[j];
                        	  arr[j]=arr[i]-arr[j];
                        	  arr[i]=arr[i]-arr[j];
                          }
                 } 
         }
         /* to print sorted array*/
         for(int x: arr) {
        	 System.out.println(x);
         }
         
         /* addition of maximum three elements*/
        for(int i=0; i<3;i++) {
        	sum+=arr[i];
        }
        
        /* addition of least three elements*/
        for(int i=n-1;i>=n-3;i--) {
        	minsum+=arr[i];
        }
        
        System.out.println("Sum of least three elements: "+minsum);
        
         System.out.println("Sum of 3 max elements: "+sum);
         System.out.println();
         System.out.println("1st highest no: "+ arr[0]);
         System.out.println("2nd highest no: "+ arr[1]);
         System.out.println();
         System.out.println("1st minimum no: "+ arr[n-1]);
         System.out.println("2nd least no: "+ arr[n-2]);
	}
}
