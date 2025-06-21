/* Program Sort The Element Of Array With Bubble Sort Algorithm
Author :- Chirag Solanki */

import java.util.*;

public class SelectionSort{

    public static void Selection(int arr[]){
        
        for(int i=0;i<arr.length-1;i++){
            int minpos = i;   // We Found Minimun Value Of Array
            for(int j=i+1;j<arr.length;j++){
                if(arr[minpos] > arr[j]){ // In Case J Value Is Lower Than Minpos. Change The Value Of Minpos
                    minpos = j;
                }
            }
            //Swap The Element
            int temp = arr[minpos];
            arr[minpos] = arr[i];
            arr[i] = temp;
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
        Selection(arr);
        System.out.print("\nArray After Sorting: ");
        Print(arr);
    }
}