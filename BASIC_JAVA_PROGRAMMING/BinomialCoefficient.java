/* Program to Find Binomial Coefficient
Author :- Chirag Solanki  */

import java.util.*;

    public class BinomialCoefficient{
            public static int FindFactorial(int n){
            int fact = 1;
            for(int i = n;i>0; i--){
                fact *= i;
                
            }
                return fact;
            }
        public static void main(String args[]){
            int n,r, BC;
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter N: ");
            n = sc.nextInt();
            System.out.print("Enter R: ");
            r = sc.nextInt();
            BC = (FindFactorial(n)) /(FindFactorial(r) * (FindFactorial(n-r))); // Logic Of Binomial Coefficieant.
            System.out.println(BC);
            
        }
    }