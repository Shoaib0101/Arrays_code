public class GenrateSubArrays{
	public static void printSubArrays(int arr[],int start,int end){
		if(end == arr.length){
			return;
		}else if(start>end){
			printSubArrays(arr,0,end+1);
		}else{
			System.out.print("[");
			for(int i=start;i<end;i++){
				System.out.print(arr[i]+",");
			}
			System.out.println(arr[end]+"]");
			printSubArrays(arr,start+1,end);
		}
	}
	public static void main(String args[]){
		int arr[] = {1,2,3};//[1] [1,2] [1,2,3]
				      //[2],[2,3]	
		printSubArrays(arr,0,0);
		/*for(int i=0;i<arr.length;i++){
			for(int j=i;j<arr.length;j++){
				for(int k=i;k<=j;k++){
					System.out.print(arr[k]+" ");
				}
				System.out.println();
			}
		}*/		
	}
}
