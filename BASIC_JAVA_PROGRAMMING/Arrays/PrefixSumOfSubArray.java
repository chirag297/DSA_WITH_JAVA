/* Program to Find Sum Of Sub Array With Prefix Sum Method
Author :- Chirag Solanki */

import java.util.*;

public class PrefixSumOfSubArray{
    public static void SumOfArray(int arr[]){

        int prefix[] = new int[arr.length];
    

        
        for(int i = 0;i<arr.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;

            for(int j=i;j<arr.length;j++){
                int end = j;
            

                System.out.println();
            }
            

        }
        
    }
    public static void main(String args[]){

        int arr[] = {2,4,6,8,10};
        SumOfArray(arr);

    }

}