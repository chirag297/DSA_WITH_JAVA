/* Program To Print half Pyramid. Print Pyramid Pattern By Using Characters.
Author:- Chirag Solanki */

import java.util.*;

public class CharacterPyramid{
    public static void main(String args[]){
        char ch = 'A';
        int no;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number");
        no=sc.nextInt();
        for(int i=0;i<no;i++){ // outer loop
            for(int j=0;j<i;j++){ // Inner Loop
                System.out.print(" "+ch);
                ch++;  // Moves to next Character
            }
            System.out.println();
        }
    }
}