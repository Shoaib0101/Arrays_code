public class DuplicateRemove{
	public static void main(String args[]){
	  int arr[] = {1, 2, 2, 3, 4, 4, 4, 5, 5};
	  int idx = 1;
	  //2 2 2 2
	  for(int i=1;i<arr.length;i++){
	    if(arr[i]!=arr[i-1]){
	        arr[idx++] = arr[i];
	    }
	  }
	  for(int i=0;i<idx;i++){
	      System.out.print(arr[i]+" ");
	  }
	  System.out.println();
	}
}
