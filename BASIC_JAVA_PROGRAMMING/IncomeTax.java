/*Income Tax Calculator Program
Author :- Chirag Solanki
*/
import java.util.Scanner;

public class IncomeTax{
    public static void main(String args[]){
        int income,tax;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Income :- ");
        income = sc.nextInt();
        if(income < 500000){
            tax = (0 * income);
            System.out.println("You Have To Pay "+tax+" Tax On Your Income!");
        }else if(income >= 500000 && income<1000000){
            tax = (int)  (0.2 * income) ;
            System.out.println("You Have To Pay "+tax+" Tax On Your Income!");
        }else{
            tax = (int) (0.3 * income);
            System.out.println("You Have To Pay "+tax+" Tax On Your Income!");
        }
    }
}