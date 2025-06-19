/* Program to Print Sum Of Sub Array With Brute Force Method
Author :- Chirag Solanki */
import java.util.*;

    public class SumOfSubArray{
        public static void SumOfArray(int arr[]){
            
            int cursum = 0;
            int maxsum = Integer.MIN_VALUE;

            for(int i = 0;i<arr.length;i++){
                int start = i;
                for(int j=i;j<arr.length;j++){
                    int end = j;
                    cursum = 0;
                    for(int k=start;k<=end;k++){
                        cursum+=arr[k]; // Add Value Of Sub Array.
                    }
                    System.out.println(cursum);
                    if(maxsum < cursum){  
                        maxsum = cursum;  // if cursum value Is higher Than maxsum than value stores in maxsum.
                    }
                        
                }
                
                
            }
            System.out.println("Maximum Sum: "+maxsum);
        
        }

        public static void main(String args[]){
            int arr[] = new int[5];
            Scanner sc = new Scanner(System.in);

            for(int i=0;i<arr.length;i++){
                System.out.print("Enter Number: ");
                arr[i]=sc.nextInt();
            }
            SumOfArray(arr);  // Call Function

        }
}