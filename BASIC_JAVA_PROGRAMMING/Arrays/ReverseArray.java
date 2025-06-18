/* Program To Reverse The Value Of Array
Author :- Chirag Solanki */
import java.util.*;

public class ReverseArray{
    public static void Reverse(int arr[]){
        int start = 0, end = arr.length-1;  
        while(start<end){
            // Swaping Logic
            int temp = arr[end];
            arr[end]=arr[start];
            arr[start]=temp;

            //after swaping start position increase by one and end decrease by one
            start++;
            end--;
        }
    }
    public static void main(String args[]){
        int arr[] = new int[6];
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<arr.length;i++){
        System.out.print("Enter Number: ");
        arr[i] = sc.nextInt();  
        }
        for(int i=0;i<arr.length;i++){
        System.out.print("Befor Reverse: "+arr[i]+" ");  // Print Value Befor Reverse An Array
        }
        System.out.println();
        Reverse(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print("After Reverse: "+arr[i]+" "); // Print Value After Reverse An Array
        }


    }
}