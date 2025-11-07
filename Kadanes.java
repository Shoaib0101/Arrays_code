public class Kadanes {
    public static void main(String[] args) {
    	int arr[] = {1,4,-5,4,-2};
    	int cs = 0;
    	int ms = Integer.MIN_VALUE;
    	
    	for(int i=0;i<arr.length;i++){
    		cs += arr[i];
    		if(cs<0){
    			cs = 0;
    		}
    		ms = Math.max(cs,ms);
    	}
    	
    	System.out.println(ms);
    }
}
