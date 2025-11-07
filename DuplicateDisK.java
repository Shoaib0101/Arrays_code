public class DuplicateDisK{
	public static void main(String args[]){
		int arr[] = {1, 2, 3, 4, 1, 2, 3, 4};
		int k = 3;
		
		boolean flag = false;		
		for(int i=0;i<arr.length;i++){//1 2 3
			for(int j=(i+1);j<arr.length && j<=i+k;j++){
				if(arr[i]==arr[j]){
					flag = true;
					break;
				}
			}
			if(flag) break;
		}
		if(flag){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
