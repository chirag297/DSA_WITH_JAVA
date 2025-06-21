/* Program Sort The Element Of Array With Bubble Sort Algorithm
Author :- Chirag Solanki */

import java.util.*;

public class BubbleSort{
    
        public static void Bubble(int arr[]){
            
            for(int i=0;i<arr.length;i++){  // Outer Loop Runs Size Of Array Time

                int flage = 1;  
                for(int j=0;j<arr.length-1-i;j++){ // This Loop Logic is We Place Largest Element At last And Every time
                                                   // We Decrease The Loop by one Because By The Time Element Sort one by One

                    if(arr[j] > arr[j+1]){  // if first element is bigger Than second element then we swap the elements
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                        flage = 0;  // if Array Already Sorted Then Flag Value Not Become Change. 
                    }

                    }
                    if(flage == 1){
                        return;
                }
            }
        }

        public static void Print(int arr[]){  // Print array Function
            for(int i=0;i<arr.length;i++){
                System.out.print(" "+arr[i]);
            }
        }

        public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int no;
        System.out.print("Enter The Size Of Array: ");
        no = sc.nextInt();
        int arr[] = new int[no];

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Number: ");
            arr[i] = sc.nextInt();

        }
        System.out.print("Array Before Sorting: ");
        Print(arr);
        Bubble(arr);
        System.out.print("\nArray After Sorting: ");
        Print(arr);
    }
}