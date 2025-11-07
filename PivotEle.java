public class PivotEle{
	public static void main(String args[]){
		int arr[] = {1,7,3,6,5,6};
		int totalSum = 0;
		
		for(int a:arr){
			totalSum += a;
		}
		
		int leftSum = 0;
		for(int a:arr){
			if(leftSum == (totalSum-leftSum-a)){
				System.out.println(a);
				break;
			}
			leftSum+=a;
		}
	}
}
