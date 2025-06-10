/* Program To Find Factorial Of Given Number 
Author :- Chirag Solanki
*/ 

import java.util.*;

public class FindFactorial{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int no, fact=1;
        System.out.print("Input Any Number: ");
        no = sc.nextInt();
        for(int i=no;i>0;i--){
            fact *= i;      // Logic Part Of Find Factorial
        }
        System.out.println(fact);
    }
}