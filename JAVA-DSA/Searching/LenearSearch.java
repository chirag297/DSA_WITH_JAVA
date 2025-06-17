import java.util.*;

public class LenearSearch{
    public static int Lenear(int arr[], int value){
        for(int i=0;i<arr.length;i++){
            // Find Value
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[6];
        int value;

        for(int i=0;i<arr.length;i++){
            System.out.print("Enter Number: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the Number You Want TO Search: ");
        value = sc.nextInt();

        int index = Lenear(arr,value);

        if(index==-1){
            System.out.println("Value Not Found In Array! ");
        }else{
            System.out.println("Element "+value+"Present In Array At Position "+index);
        }

    }
}