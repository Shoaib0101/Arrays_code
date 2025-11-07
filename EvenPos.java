import java.util.Arrays;
public class EvenPos{
	public static void main(String args[]){
		int arr1[] = {1,2,2,1};
		for(int i=1;i<arr1.length;i++){
			if((i+1)%2==0){
				
				if(arr1[i]<arr1[i-1]){
					int temp = arr1[i];
					arr1[i] = arr1[i-1];
					arr1[i-1] = temp;
				}
					
			}else{
				if(arr1[i]>arr1[i-1]){
					int temp = arr1[i];
					arr1[i] = arr1[i-1];
					arr1[i-1] = temp;
				}
			}
		}
		
		for(int a:arr1){
			System.out.print(a+" ");
		}
		System.out.println();
	}
}
