/* Program to Read The Value Of An Araay
Author Chirag Solanki */

/*In This Program We Read And Print Value Of Array By Manualy Or One By One.
    In The Next Program We Read The Value of Array with The help Of For Loop. */
import java.util.*;

 public class ReadAraay{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int roll;
        String name;
        int marks[] = new int[10]; // Declare The Array
        System.out.print("Enter Your Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Name: ");
        name=sc.nextLine();
        System.out.print("Enter Your First Subject Mark: ");
        marks[0] = sc.nextInt(); // Read Zero'th Index Value, O'th Index Is First Position In Array
        System.out.print("Enter Your Second Subject Mark: ");
        marks[1] = sc.nextInt(); //Read First Index Value
        System.out.print("Enter Your Third Subject Mark: ");
        marks[2] = sc.nextInt(); //Read Second Index Value

        
        
        // Print Value
        System.out.println();
        System.out.println("Roll Number: "+roll);
        System.out.println("Name: "+name);
        System.out.println("First Subject Mark: "+marks[0]); //  Print Zero'th Index Value
        System.out.println("Second Subject Mark: "+marks[1]); // Print First Index Value
        System.out.println("Third Subject Mark: "+marks[2]);// Print Second Index Value
    }
}

/* Sample Output: 
    Enter Your Roll Number: 101
    Enter Your Name: Chirag
    Enter Your First Subject Mark: 94
    Enter Your Second Subject Mark: 92
    Enter Your Third Subject Mark: 91
    
    Roll Number: 101
    Name: Chirag
    First Subject Mark: 94
    Second Subject Mark: 92
    Third Subject Mark: 91

*/