import java.util.Scanner;
public class Binary_search {
    public static int BS(int num[],int key){
    int start=0,end=num.length-1;   
        while(start <= end){
            int mid=(start + end)/2;
            if(num[mid] == key){
               return mid;
            }
            if(num[mid] < key){//right
                start=mid+1;
            }else{//left
                end=mid-1;
            }

        }
        return-1;
    }
   public static void main(String[] args) {
    int num[]={10,20,30,40,50,60};
    Scanner sc=new Scanner(System.in);
    int key=sc.nextInt();
    System.out.println("key found at index:"+BS(num, key));
    sc.close();   
}
}
