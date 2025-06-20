/* Program to Find Sum Of Sub Array With Prefix Sum Method
Author :- Chirag Solanki */

import java.util.*;

public class PrefixSumOfSubArray{
    public static void SumOfArray(int arr[]){

        int prefix[] = new int[arr.length];
        int cursum = 0;
        int maxsum=Integer.MIN_VALUE;   

        prefix[0] = arr[0];
        for(int i = 1;i<prefix.length;i++){
            prefix[i] = prefix[i-1] + arr[i];
        }
        for(int i=0;i<arr.length;i++){
            int start = i;
            cursum = 0;
            for(int j=i;j<arr.length;j++){
                int end = j;
                cursum = start==0 ? prefix[end] : prefix[end] - prefix[start-1];
            }

            if(maxsum<cursum){
                maxsum = cursum;
            }            

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