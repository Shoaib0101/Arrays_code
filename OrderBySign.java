public class OrderBySign{
	public static void main(String args[]){
		int arr[] = {1,-1};
		int res[] = new int[arr.length];
		int ptr1 = 0;
		int ptr2 = 1;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]>=0 && ptr1<arr.length){
				res[ptr1] = arr[i];//3 -2 1 -5 2
				ptr1+=2;// 4
			}else{
				res[ptr2] = arr[i];//3 -2 1 -5 2 -4
				ptr2+=2;//5
			}
		}	
		
		for(int r:res){
			System.out.print(r+" ");
		}
		
		System.out.println();
	}
}
