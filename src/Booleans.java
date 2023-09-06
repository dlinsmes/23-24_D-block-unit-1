import java.util.Scanner;
public class Booleans {

    public static void main(String [] args) {
        //data types - String, int, double, boolean

        //boolean is a data type whose value can only
        //be either true or false
        boolean b = true;
        System.out.println(b);

        //! is negation - NOT - flip the boolean value
        //to its opposite
        b = !b;
        System.out.println(b);

        b = !false;
        System.out.println(b);

        int x = 7;

        //boolean comparisons - used in if-statements
        //and while loops

        //assignment operator (=) - evaluate what's on the right (7 > 3) --> true
        //then assign true to the left --> b is set to true
        b = x > 3;
        System.out.println(b);

        // > greater than
        // < less than
        // >= greater than or equal to
        // <= less than or equal to

        Scanner input = new Scanner(System.in);
        System.out.println("enter a number: ");
        x = input.nextInt();

        b = x <= 10;
        System.out.println("x is less than or equal to 10: " + b);

        // == is a COMPARISON to check equality --> true if the two values are the same
        // = is an assignment --> set the left to the evaluation of the right
        b = x == 5;
        System.out.println("x is equal to 5: " + b);

        // != not equal to
        b = x != 9;
        System.out.println("x is equal to 9: " + b);

        //check if x is odd
        //check if there's a remainder of 1 after dividing by 2
        b = x % 2 == 1;
        System.out.println("x is odd: " + b);

        //if the remainder is NOT 0, then there is a remainder, so odd
        b = x % 2 != 0;

        String word = "apple";
        String word2 = "apple";

        input.nextLine();

        System.out.println("enter the word apple: ");
        String word3 = input.nextLine();


        //IMPORTANT - Strings should NOT use == to check equality
        //inconsistent behavior using == for Strings
        b = word == word2;
        System.out.println("word == word2: " + b);

        b = word == word3;
        System.out.println("word == word3: " + b);

        //use .equals() to check strings
        b = word.equals(word2);
        System.out.println("word.equals(word2): " + b);

        b = word.equals(word3);
        System.out.println("word.equals(word3): " + b);

        b = "apple".equals(word3);
        b = word3.equals("apple");

        // ! - negation - NOT - evaluate the opposite expression
        b = !(x < 7); //same as x >= 7

        //opposite of < is >=
        //opposite of > is <=
        //opposite of == is !=

        //check if strings are not equal
        b = !word3.equals("apple");
        System.out.println("your word was NOT apple: " + b);

        //combining expressions

        // && - AND - both expressions need to be true
        b = x > 7 && word3.equals("apple");
        System.out.println("x > 7 AND you entered apple: " + b);

        // || - OR - at least ONE expression needs to be true
        b = x > 7 || word3.equals("apple");
        System.out.println("x > 7 OR you entered apple: " + b);

        //prompt the user for a positive number that's less than 50
        //output true/false if the number meets criteria
        System.out.println("enter a positive number that's less than 50: ");
        x = input.nextInt();
        b = x > 0 && x < 50;
        b = x >= 1 && x <= 49;

        b = ! ( x <= 0 || x >= 50 );
        b = ! ( x < 1 || x > 49 );

        //DeMorgan's Law
        //A and B are boolean expressions
        //!(A and B) is the same as (!A or !B)
        //!(A or B) is the same as (!A and !B)
        //distribute the negation to each expression flip and/or

        b = ! (x < 12 && x % 3 == 0);
        //same as
        b = x >= 12 || x % 3 != 0;






    }
}
