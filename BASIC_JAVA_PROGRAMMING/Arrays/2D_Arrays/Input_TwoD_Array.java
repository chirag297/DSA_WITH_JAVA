
import java.util.*;

public class Input_TwoD_Array{
    public static void main(String args[]){

        int n,m;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Rows Of Array: ");
        n = sc.nextInt();                         
        System.out.print("Enter Column Of Array: ");
        m = sc.nextInt();
        
        int arr[][] = new int[n][m];  // declare two d array

        

        

        for(int i = 0;i<n;i++){  // input value
            for(int j = 0;j<m;j++){
                System.out.print("Enter Number: ");
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i<n;i++){  // print value

            for(int j = 0;j<m;j++){
                System.out.print(" "+arr[i][j]);

            }
            System.out.println();
        
        }
    
    }

}