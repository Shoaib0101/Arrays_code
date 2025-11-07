public class Pairs {
    public static void printPairs(int num[]){
        int cnt=0;
        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
            System.out.print("("+curr+","+num[j]+")");
            cnt++;
        }
            System.out.println("");
        }
        System.out.println("The total count is:"+cnt);
  
    }
    public static void main(String[] args) {
       int num[]={10,20,30,40,50};
       printPairs(num);
    }
}
