public class InsertInSpec{
	public static void main(String args[]){
		int arr[] = {1,2,3,4,5,0};
		int indx = 2;
		int val = 200;
		
		for(int i=arr.length-2;i>=indx;i--){
			arr[i+1] = arr[i];
		}
		arr[indx] = val;
		
		for(int a:arr){
			System.out.print(a+" ");
		}
	}
}
