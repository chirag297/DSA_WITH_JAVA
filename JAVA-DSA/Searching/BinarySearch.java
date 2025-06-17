import java.util.*;

public class BinarySearch{
    public static int Binary(int arr[], int value){
        int start = 0, end = arr.length-1;
        while(start<=end){
            int mid = (start + end) / 2;
            if(arr[mid] == value){
                return mid;
            }if(arr[mid] < value){
                start = mid + 1;
                
            }else{
                end = mid - 1;
            }
        }
            return -1;   
    }
        
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[]= {10, 20, 30, 40, 50, 60};
        int value;

        /*for(int i=0;i<arr.length;i++){
            System.out.print("Enter Number: ");
            arr[i] = sc.nextInt();
        }*/
        System.out.print("Enter Number You Want To Search: ");
        value = sc.nextInt();
        
        System.out.println("Element Found At Position "+Binary(arr,value));
        
        
    }


}


