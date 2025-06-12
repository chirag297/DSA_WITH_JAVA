/*Program To Print 0-1 Triangle Pattern
Author :- Chirag Solanki
*/

import java.util.*;

public class Zero_One_Triangle{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no=sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=i;j>=1;j--){
                if(j % 2 == 0){
                 System.out.print(" 0");   
                }else{
                System.out.print(" 1");
                }
                
            }
            System.out.println();
        }
    }
}

/* Sample Output:-
Enter Number: 5
 1
 0 1
 1 0 1
 0 1 0 1
 1 0 1 0 1

*/
