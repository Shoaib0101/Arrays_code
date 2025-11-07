public class ZeroToEnd{
	public static void main(String args[]){
		int arr[] = {0,1,2,0,2,0,8,0};
		
		int j = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]!=0){
				arr[j] = arr[i];
				j++;
			}
		}
		
		for(int i=j;i<arr.length;i++){
			arr[i] = 0;
		} 
		
		for(int a:arr){
			System.out.print(a+" ");
		}
		
		System.out.println();
	}
}
