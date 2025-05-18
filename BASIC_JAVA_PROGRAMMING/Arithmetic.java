/* Program of basic Arithmetic Oprations
Author :- Chirag Solanki */

class Arithmetic{
    public static void main(String args[]){
    int no1 = 20;
    int no2 = 10;
    
    
    int Sum = no1 + no2; // Sum of Two Numbers
    System.out.println("Sum Of Two Number :- "+Sum); // Print Value

    int Sub = no1 - no2; // Subtraction of Two Numbers
    System.out.println("Subtraction Of Two Number :- "+Sub); // Print Value

    int Mul = no1 * no2; // Multiplication of Two Numbers
    System.out.println("Multiplication Of Two Number :- "+Mul); // Print Value

    
    // in Division and Modulus of Two Numbers the return value is floating 
    float Div = no1 / no2; // Division of Two Numbers
    System.out.println("Division Of Two Number :- "+Div); // Print Value

    float Mod = no1 % no2; // Modulus of Two Number
    System.out.println("Modulus Of Two Number :- "+Mod); // Print Value

    }
}