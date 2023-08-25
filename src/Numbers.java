import java.util.Scanner;

public class Numbers {

    public static void main(String [] args) {
        //to represent numbers in code, use int and double

        //int - integer - whole numbers incl zero and negative

        int num = 8;

        //can concatenate numbers with strings
        System.out.println("num is " + num);

        System.out.print( num  + " + 4 is...");
        //= is the assignment operator
        // evaluate (solve) what's on the RIGHt of the = 8 + 4 --> 12
        // then save that evaluation to the LEFT --> num is updated to be 12
        num = num + 4;
        System.out.println(num);

        // + addition
        // - subtraction
        // * multiplication
        // / division
        // % modulo (mod) - remainder after division

        //disregard the whole number and only look at the remainder
        num = 13 % 5;
        System.out.println("13 mod 5 is " + num);

        //same as num = num + 2
        num += 2;
        System.out.println("+ 2 is " + num);

        //shorthand operators
        //take the old value, apply the operation, save back to same var
        // +=, -=, *=, /=

        //same as num = num + 1 and num += 1
        num++;

        System.out.println("+ 1 is " + num);

        num = 6/3;
        System.out.println("6/3 is " + num);

        //int division - any decimals get truncated (cut off)
        //because ints only hold whole numbers

        //evaluates to 0 because 0.99 without decimals leaves 0 as the whole number
        num = 99/100;
        System.out.println("99/100 is " + num);

        //doubles can hold decimal values

        double d = 7.6;
        System.out.println("d is " + d);

        //if you assign an int to a double, the .0 will get added
        d = 7;
        System.out.println("d is " + d);

        //IMPORTANT - since 99 and 100 both don't have decimals, they't both
        //interpreted as ints. int division 99/100 produces 0.
        //saving 0 to a double variable makes it 0.0
        d = 99/100;
        System.out.println("d is " + d);

        //if at least one of the terms is a double (has a decimal), the division
        // will evaluate with decimals
        d = 99.0/100;
        System.out.println("d is " + d);

        d = 99/100.0;
        System.out.println("d is " + d);

        d = 99.0/100.0;
        System.out.println("d is " + d);

        //can save int values to double vars and .0 is added
        d = 7;
        System.out.println("d is " + d);

        //if a double value is saved to an int, that's more informnation
        //than an int can hold bc whole numbers don't have decimal info
        //-doesn't matter if the double value ends in .0
        //int n = d;

        //cast (convert) a double to an int
        //-truncates (cuts off) any decimal values
        int n = (int)d;
        System.out.println("n is " + n);


        n = (int)9.9;
        System.out.println("n is " + n);

        //regular rounding - if decimal is .5 or greater, round up to the
        //next whole number, otherwise stay on the current whole number
        double toRound = 5.4999999999999;

        //apply the regular rounding rule

        //adding .5 will move the whole number UP when needed, but keep it
        //as-is for initial numbers with a decimal of less than .5
        int rounded = (int) (toRound + 0.5);
        System.out.println(toRound + " rounded is " + rounded);

        Scanner input = new Scanner(System.in);
        System.out.println("enter a decimal number to round");
        double uNum = input.nextDouble();
        System.out.println(uNum + " rounded is " + (int)(uNum + .5));




    }
}
