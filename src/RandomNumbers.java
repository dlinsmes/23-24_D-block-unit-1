public class RandomNumbers {

    public static void main(String [] args) {

        // Math.random() generate a random double between 0 and 1
        //inclusive of 0, exclusive of 1 --> always 0.something
        double r = Math.random();
        System.out.println(r);

        //expand the range of the number produced to [0, 5)
        //use multiplication to expand the range of numbers generated
        r = Math.random() * 5;
        System.out.println(r);

        //generate a random int [0, 5)
        //cast as int to truncate any decimals from the double
        int n = (int)(Math.random() * 5);
        System.out.println(n);

        //random int [0, 11)
        n = (int)(Math.random() * 11);
        System.out.println(n);


        //IMPORTANT - parentheses around the multiplier
        //-without them, only Math.random() is cast
        //and 0.something always casts as 0 due to truncation
        //0 times anything is 0
        //-use parentheses to multiply the range first and THEN
        //cast/truncate
        n = (int)Math.random() * 999999999;
        System.out.println(n);

        //[0, 11) -- highest possible value is 10
        n = (int)(Math.random() * 11);
        System.out.println(n);

        //[1, 12)
        //use addition or subtraction as an offset
        n = (int)(Math.random() * 11) + 1;
        System.out.println(n);

        //generate an int [1, 6] (die roll)
        n = (int)(Math.random() * 6) + 1;
        System.out.println(n);

        //formula for generating an int in the range of [min, max]
        //(int)(Math.random() * (max-min+1) ) + min
        //for [1, 6]:
        // (int)(Math.random() * (6-1+1) ) + 1
        //=(int)(Math.random() * 6 ) + 1

        //[10, 20]
        //max is 20, min is 10; 20 - 10 + 1 --> 11
        n = (int)(Math.random() * 11) + 10;
        System.out.println(n);


    }
}
