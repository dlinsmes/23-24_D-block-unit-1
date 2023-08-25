import java.util.Scanner;
//this imports java's Scanner library, which
//lets you get user input
//-this isn't test by this class or AP

public class Input {

    //java looks for the main method to run code
    public static void main(String [] args) {

        //declare a string var named lunch
        //that has a value of chicken and rice
        String lunch = "chicken and rice";

        //concatenate (join) strings together in a print statement
        System.out.println("I have " + lunch + " for lunch today");

        //set up a Scanner which lets you get keyboard input
        //input is just a variable name - call it what you want
        Scanner input = new Scanner(System.in);

        //prompt for input
        System.out.println("What is your name?");

        //save the input to a var
        String uName = input.nextLine();

        System.out.println("Hi " + uName);

        //when you need additional inputs, you DON'T need to
        //create more Scanners - just use the same one

        System.out.println("how are you?");
        String status = input.nextLine();
        System.out.println("you are " + status);
    }

}
