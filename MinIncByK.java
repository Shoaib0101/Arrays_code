public class MinIncByK{
	public static int minIncByK(int arr[],int k){
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		
		int cnt = 0;
		for(int i=0;i<arr.length;i++){
			while(arr[i]!=max && arr[i]<max){
				arr[i]+=k;
				cnt++;
			}
			
			if(arr[i]==max){
				continue;
			}else if(arr[i]>max){
				return -1;
			}
		}
		return cnt;
	}
	
	public static void main(String args[]){
		int arr[] = {4, 4, 4, 4};
		System.out.println(minIncByK(arr,3));
	}
}
