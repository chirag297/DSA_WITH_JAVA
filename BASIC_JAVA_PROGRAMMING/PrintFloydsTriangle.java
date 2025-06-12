/*Program To Print FLOYD'S Triangle Pattern
Author :- Chirag Solanki
*/

import java.util.*;

public class PrintFloydsTriangle{
    public static void main(String args[]){
        int no, n=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no=sc.nextInt();
        for(int i=1;i<=no;i++){
            for(int j=1;j<=i;j++){
                System.out.print(" "+n);
                n++;
            }
            System.out.println();
        }
    }
}

/* Sample Output:-

    Enter Number: 5
    1
    2 3
    4 5 6
    7 8 9 10
    11 12 13 14 15

*/
