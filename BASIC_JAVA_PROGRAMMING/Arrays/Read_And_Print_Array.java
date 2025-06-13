/* Program to Read The Value Of An Araay With Loop.
Author Chirag Solanki */


import java.util.*;

 public class Read_And_Print_Array{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int roll;
        String name;
        int marks[] = new int[3]; // Declare The Array
        System.out.print("Enter Your Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Your Name: ");
        name=sc.nextLine();
        for (int i=0;i<marks.length;i++){  // In This Program Loop Declaration Is Important.
            System.out.print("Enter Your Mark: ");
            marks[i] = sc.nextInt(); 
        }

        
        
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
    Enter Your Mark: 97
    Enter Your Mark: 98
    Enter Your Mark: 96

    Roll Number: 101
    Name: Chirag
    First Subject Mark: 97
    Second Subject Mark: 98
    Third Subject Mark: 96 

*/