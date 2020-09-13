import java.util.Scanner;
/**
 * a program to convert Celsius to Fahrenheit 
 * @author Darian Pajic
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    // declare a variable that will store a name
    int Celsius;

    // ask the user what degrees in Celsius they want converted to Fahrenheit
    System.out.println("Insert a degrees in Celsius that you want converted to Fahrenheit: ");
    // initialize the name variable with Celsius
    Celsius = input.nextInt();
   
    // declare and calculate their degrees Celsius into Fahrenheit
    int Fahrenheit = (Celsius * 9)/5 + 32;
    // tell the user their degrees in Fahrenheit
    System.out.println(Celsius + "C " + "is equal to " + Fahrenheit + "F");
  }
}
