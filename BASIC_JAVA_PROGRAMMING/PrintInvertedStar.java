/*Program To Print Inverted Start Pattern
  Author:- Chirag Solanki
 */

import java.util.*;

public class PrintInvertedStar{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt(); 
        for(int i=no;i>0;i--){ // Outer Lopp
            
            for(int j=0; j<i; j++){ //Inner Loop For Print Inverted Start Pattern

                System.out.print(" *");
            }
            System.out.println();
        }

    }
}

