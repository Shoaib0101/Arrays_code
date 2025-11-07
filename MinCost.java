public class MinCost{
	public static int minCost(int arr[],int n){
		int min = arr[0];
		for(int i=1;i<n;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		
		return (n-1) * min;
	}
	
	public static void main(String args[]){
		int arr[] = {4,3,2};
		System.out.println(minCost(arr,arr.length));
	}
}
