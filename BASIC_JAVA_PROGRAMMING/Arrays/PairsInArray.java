/* Program To Print Total Pairs and Count Total Pairs In Array 
Author :- Chirag Solanki */
import java.util.*;

public class PairsInArray{
    public static void Pairs(int arr[]){
        int tp = 0;        // 
        for(int i=0;i<arr.length;i++){ 
            int current = arr[i]; // current position of array value store in variable
            for(int j=i+1;j<arr.length;j++){ // start from next index of outer loop
                System.out.print(" ("+current+","+arr[j]+") ");  
                tp++; // Count Total Pairs
            }
            System.out.println();   
        }
        System.out.println("Total Pairs: "+tp);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        
        for (int i=0;i<arr.length;i++){
            System.out.print("Enter Number: ");
            arr[i] = sc.nextInt();
        }

        Pairs(arr); // Call The Function





    }
    }

        