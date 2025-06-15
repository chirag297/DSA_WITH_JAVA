import java.util.*;

public class ArmStrong{
    public static void  main(String args[]){
        int n,lastdigit,sum = 0;

        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        int orignal = n;

        while(n>0){
            lastdigit = n % 10;
            sum += Math.pow(lastdigit, 3);
            n /= 10;
        }
        if(orignal == sum){
            System.out.println("ArmStrong");
        }else{
            System.out.println("Not");
        }
    }
}