public class Alternate{
	public static void display(int arr[],int index){
		if(index<arr.length){
			System.out.print(arr[index]+" ");
			display(arr,index+=2);
		}else{
			return;
		}
	}
	public static void main(String args[]){
		int arr[] = {10,20,30,40,50};
		display(arr,0);
		System.out.println();
	}
}
