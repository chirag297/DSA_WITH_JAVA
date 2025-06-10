/* Program To Print Left Half Pyramid. Print Pattern By using Number,
 Also Numbers are Increasing Form in Pattern.
Author:- Chirag Solanki*/

import java.util.*;

public class LeftHalfPyramid{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no = sc.nextInt();
        for(int i = 1;i<=no;i++){ // Outer (Main) Loop

            for (int j=no;j>=i;j--){ // First Inner Loop For Priting Space
                System.out.print("  ");
            }

            for(int j=1;j<=i;j++){ // Second Inner Loop For Print Left Half Pyramid
                System.out.print(" "+j);
            }
            System.out.println();
        }

    }
}