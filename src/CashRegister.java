import java.util.Scanner;

public class CashRegister {
    //warm up - set up a scanner and prompt the user
    //for a double input, then output the rounded version
    //of their number

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println("enter a decimal number");
//        double num = input.nextDouble();
//        int rounded = (int)(num + 0.5);
//        System.out.println(num + " rounded is " + rounded);

        //math operation review

        //7 bc int division truncates any decimals
        int a = 37 / 5;

        //2 bc mod gives the remainder after division
        int b = 37 % 5;

        System.out.println("37 / 5 is " + a);
        System.out.println("37 % 5 is " + b);

        //3.0 bc 7 and 2 are both ints
        // so it does int division to get 3
        //then saving 3 to a double variable results in 3.0
        double c = 7 / 2;
        System.out.println("7 / 2 is " + c);

        //to get 3.5, change at least one of the div terms
        //to a double by adding .0


        //doubles are only an approximation of decimal numbers
        //-sometimes the value is extremely close, but off by
        //a small decimal amount

        //should be 7.5
        c = 9.7 - 2.2;
        System.out.println("9.7 - 2.2 is " + c);

        c = 9.7 - 2.1;
        System.out.println("9.7 - 2.1 is " + c);

        c = 9.7 - 2.0;
        System.out.println("9.7 - 2.0 is " + c);

        //should be .49
        c = 47.49 % 1;
        System.out.println("47.49 % 1 is " + c);

        //sometimes doubles will hold data that's slightly
        //under or over the expected value

        //round to the desired decimal place
        //for .490000001 --> .49

        c = c * 100; //49.00001
        int n = (int)(c + 0.5); // 49
        c = n / 100.0; // 0.49
        System.out.println(c);

        //should be 7.5
        c = 9.7 - 2.2;

        c = c * 10; //74.999999
        n = (int)(c + 0.5); // 75
        c = n / 10.0; // 7.5
        System.out.println(c);

//       c =  (int)(( c * 10) + 0.5)/10.0;


        //cash register
        //prompt the user for a dollar and cent amount
        //-output the minimum quantity of bills and coins
        //to add up to their amount
        //bills: 100, 20, 10, 5, 1
        //coins: quarter, dime, nickle, penny

        //use ONLY division, modulo, and rounding
        //(no multiplication, subtraction, ifs, loops);

        System.out.println("enter a dollar and cent amount: ");
        double amt = input.nextDouble();
        System.out.println("$" + amt + " is...");

        //start with the largest denomination
        //use int to store the quantity of each bill amount
        int q = (int) amt/ 100;
        System.out.println(q + " $100 bills");

        //calculate the remaining amount after counting $100 bills
        amt = amt % 100;

        q = (int) amt / 20;
        System.out.println(q + " $20 bills");

        amt = amt % 20;
        q = (int) amt / 10;
        System.out.println(q + " $10 bills");

        amt = amt % 10;
        q = (int) amt / 5;
        System.out.println(q + " $5 bills");

        amt = amt % 5;
        q = (int) amt;
        System.out.println(q + " $1 bills");

        amt = amt % 1;
        System.out.println("remaining is " + amt);

        // try 157.98 as an initial amt and check the coin amts


    }

}
