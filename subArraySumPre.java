public class subArraySumPre{
    public static void SubarraySum(int num[]){
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        int prefix[]= new int[num.length];
        prefix[0] = num[0];
        
        for(int i=1;i<num.length;i++){
            prefix[i]=prefix[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            for(int j=i;j<num.length;j++){
                currSum = i==0 ? prefix[j] : prefix[j]-prefix[i-1];
                 
                if(currSum > maxSum){
                    maxSum = currSum;
                }
            }                 
            }
            System.out.println("maxSum:"+maxSum);
        }
    
    public static void main(String[] args) {
        int num[]={10,20,30,40,50};
        SubarraySum(num);
    }
}