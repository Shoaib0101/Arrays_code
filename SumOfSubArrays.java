public class SumOfSubArrays{
	public static void main(String args[]){
		int arr[] = {1, 4, 5, 3, 2};
		
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			int currSum = 0;
			for(int j=i;j<arr.length;j++){
				currSum += arr[j];
				sum += currSum;
			}
		}
		System.out.println(sum);
	}
}	
