public class RemoveEle{
	public static void main(String args[]){
		int arr[] = {4,5,6,3,1,3};
		int j = 0;
		int target = 5;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=target){
				arr[j] = arr[i];
				j++;
			}
		}
		
		for(int i=0;i<j;i++){
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
	}
}
