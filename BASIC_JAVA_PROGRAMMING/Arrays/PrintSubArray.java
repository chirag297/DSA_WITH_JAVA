/* Program To Print SubArray Of Array
Author :- Chirag Solanki */

import java.util.*;

public class PrintSubArray{
    public static void SubArray(int arr[]){
        int sum=0;

        for(int i=0;i<arr.length;i++){
            int start = i; 
            for(int j=i;j<arr.length;j++){
                int end = j;

                // Loop For Print Sub Array 
                for(int k=start;k<end;k++){
                    System.out.print(arr[k]+" "); 
                    
                }
                
                System.out.println(); 
                
            }
                    
        }
    }

    public static void main(String args[]){
        int arr[] = new int[5];
        Scanner sc = new Scanner(System.in);

        for(int i =0;i<arr.length;i++){
            System.out.print("Enter Number: ");
            arr[i] = sc.nextInt();
        }

        SubArray(arr); // Call The Function

    }

}