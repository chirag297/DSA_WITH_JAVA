/*Author Chirag Solanki.
User Define Arithmetic Oprations Program */
import java.util.Scanner; // It imports the Scanner class so you can read input from the user.

public class UserDefineArithmetic{
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);

        //variable declaration
        int no1,no2,sum,sub,mul;
        float div,mod; 

        System.out.print("Enter First Number :-");
        no1 = sc.nextInt();
        System.out.print("Enter Second Number :-");
        no2 = sc.nextInt();


        sum = no1+no2;
        sub = no1-no2;
        mul = no1*no2;
        div = no1/no2;
        mod = no1%no2;

        System.out.println("\nAddition of "+no1+" And "+no2+" = "+sum);
        System.out.println("Subtraction of "+no1+" And "+no2+" = "+sub);
        System.out.println("Multiplication of "+no1+" And "+no2+" = "+mul);
        System.out.println("Division of "+no1+" And "+no2+" = "+div);
        System.out.println("Modulus of "+no1+" And "+no2+" = "+mod);
    
    }
}
