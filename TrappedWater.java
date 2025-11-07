public class TrappedWater {
    public static int trappedWater(int height[]){
        int n=height.length;//5
        
        //calculating left boundary max boundary
        int leftMax[]=new int[n];//4 2 0 3 2 5
        leftMax[0]=height[0];//4
        for(int i=1;i<n;i++){	
            leftMax[i]=Math.max(height[i], leftMax[i-1]);//hegiht  = 4 4 4 4 4 5
        } 
        
        //calculating right max boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];//5
        for(int i=n-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);//5 5 5 5 5 5
        }
        
        for(int arr:rightMax){
        	System.out.print(arr+" ");
        }
        int trappedWater=0; 
        //calculaing waater level
        for(int i=0;i<n;i++){
            int waterlevel=Math.min(rightMax[i], leftMax[i]);
            trappedWater+=waterlevel-height[i];
        }
        return trappedWater;
       }
    public static void main(String[] args) {
        int height[]={4,2,0,3,2,5};
        System.out.println("Trapped water level is:"+trappedWater(height));
    }
}
