import java.util.Scanner;
public class U1Practice {

    //warm up
    //prompt the user to enter dog, cat, or moose
    //-write a boolean expression that results in
    //FALSE if the user entered something valid (one of the 3)
    //TRUE if they enter something invalid (not one of the 3)

    public static void main(String [] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter dog, cat, or moose");
//        String word = input.nextLine();
//
//        boolean isDog = word.equals("dog");
//        boolean isCat = word.equals("cat");
//        boolean isMoose = "moose".equals(word);
//
//        boolean isValid = isDog || isCat || isMoose;
//                isValid = word.equals("dog") || word.equals("cat") || word.equals("moose");
//
//        boolean isNotValid = !isValid;
//
//                isNotValid = !(word.equals("dog") || word.equals("cat") || word.equals("moose"));
//                //same as
//                isNotValid = !word.equals("dog") && !word.equals("cat") && !word.equals("moose");
//
//
//        //boolean b = xxxxxxx; //this can be multiple lines if needed
//        System.out.println("your input is invalid: " + isNotValid);

        int a = 10;
        int b = 20;

        //swap the values stored in a and b

        //doesn't work bc the value in b is overwritten immediately
        b = a;
        a = b;
        System.out.println("a is " + a + ", b is " + b);

        a = 10;
        b = 20;

        //need a temporary variable to hold the values of one of the variables
        //data type for temp needs to match the type of the other variables
        int temp = a;
        //set the temp to one of the variables,
        //for the next two lines, start each line with the previous line's right side
        a = b;
        b = temp;

        System.out.println("a is " + a + ", b is " + b);

        //it doesn't matter which variable you save to temp
        temp = b;
        b = a;
        a = temp;
        System.out.println("a is " + a + ", b is " + b);

        //order of operations is the same as math - PEMDAS
        // *, /, % have the priority and execute left to right
        // +, - have the same priority and execute left to right

        a = 9 + 7 / 2 - 3 * 3; // 7/ 2 is evaluated as int division
        //= 9 + 3     - 9
        //= 3
        System.out.println(a);

        //order of operations would change the result
        a = (9 + 7) / 2 - 3 * 3;
        System.out.println(a);

        int num = 5432;
        //calculate the sum of digits

        //isolate the right-most digit, add it to a sum, then cut that right digit off of num
        //continue until no digits remain in num

        //use mod to break off the right digit
        int digit = num % 10;
        System.out.println(digit);
        int sum = digit;

        //543, not 5430
        num = num / 10; //take advantage of int division

        //continue the same steps for the remaining digits
        digit = num % 10;
        System.out.println(digit);
        sum += digit; //same as sum = sum + digit
        num /= 10; //same as num = num / 10;

        digit = num % 10;
        sum += digit;
        num /= 10;

        digit = num % 10;
        sum += digit;

        System.out.println(sum);




    }


}
