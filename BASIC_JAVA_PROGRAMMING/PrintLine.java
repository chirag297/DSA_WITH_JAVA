//Basic Program to Print The Line That User Enter(it is Called User define Program)
import java.util.Scanner; //
public class PrintLine{
    public static void main(String args[]){
        String line; // Variable declaration
        Scanner sc = new Scanner(System.in); // Input 
        line=sc.nextLine();
        System.out.println(line); //Print Line that user Enter
    }
}