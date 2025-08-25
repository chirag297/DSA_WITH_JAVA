/* Program To Find Sum Of Sub Array Using Kadan's Algorithem
Author:- Chirag Solanki */

import java.util.*;

    public class KadansSumOfArray{

        public static void SumOfArray(int arr[]){
            int cursum = 0;
           
            int maxsum = Integer.MIN_VALUE;
   
            
           for(int i=0;i<arr.length;i++){
            
            
                cursum += arr[i];
                if(cursum < 0){
                    cursum = 0;
                }
                maxsum = Math.max(cursum, maxsum);
            }
            System.out.println(maxsum);
    }
        
        public static void main(String args[]){

            Scanner sc = new Scanner(System.in);
            int arr[] = new int[5];
            for(int i=0;i<arr.length;i++){
                System.out.print("Enter Number: ");
                arr[i] = sc.nextInt();
            }
            SumOfArray(arr);
        }
    
}
