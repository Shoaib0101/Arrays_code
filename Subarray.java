public class Subarray {
    public static void printSubarray(int num[]) {
        int maxSum = Integer.MIN_VALUE; 
        int currSum = 0; 

        
        for (int i = 0; i < num.length; i++) {
            int start = i;

           
            for (int j = i; j < num.length; j++) {
                int end = j;
                currSum = 0;

            
                for (int k = start; k <= end; k++) {
                    currSum += num[k];
                }

                System.out.println("Subarray (from index " + start + " to " + end + "): currSum = " + currSum);

                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }

        System.out.println("maxSum: " + maxSum);
    }

    public static void main(String[] args) {
        int num[] = {10, 20, 30, 40, 50};  
        printSubarray(num);
    }
}
