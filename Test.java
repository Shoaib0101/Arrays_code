import java.util.*;
public class Test{
	public static void main(String args[]){
		int arr[] = {1,5,7,-1,5,3,3};
		
		int low = 0;
		int high = arr.length-1;
		int sum = 0;
		int target = 6;
		
		Arrays.sort(arr);
		while(low<high){
			sum = arr[low]+arr[high];
			if(sum==target){
				System.out.print(arr[low]+" "+arr[high]+" ");
				low++;
				high--;
			}else if(sum>target){
				high--;
			}else if(sum<target){
				low++;
			}
		}
		System.out.println();
	}
}
