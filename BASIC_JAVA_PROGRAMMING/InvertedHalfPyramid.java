/*
Program To Print Inverted & Rotated Half Pyramid Pattern
Author :- Chirag Solanki
*/

import java.util.*;

public class InvertedHalfPyramid{
    public static void main(String args[]){
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        no=sc.nextInt();
        for(int i=0;i<no;i++){

           for(int j=1;j<=(no-i);j++){
            System.out.print(" "+j);
            

           }
            System.out.println();
        }
    }
}

/* Sample Output:- 
Enter Number: 5
 1 2 3 4 5
 1 2 3 4
 1 2 3
 1 2
 1
 */