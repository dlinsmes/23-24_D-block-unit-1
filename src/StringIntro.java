//code comments start with //
//code comments are notes for yourself and anyone who
//may read your code to explain the program code

/*
block comment - don't need // at every line

java classes are program files
-class names need to match the file name
-class names need to start with a capital letter
and have not spaces
-all code we write will go inside the curly braces
for the class
 */

public class StringIntro {

    //this is the main method
    //for now, all code we write goes in main()
    public static void main(String[] args) {


        //this is a print statement
        System.out.println("Hello world!");

        //quotes around hello world indicate that
        // this is a string
        //a string is a data type that holds chars, nums, text
        //to be stored or used as data in the program

        //print() (not println()) will output any following text
        //on the same line
        System.out.print("Hi ");

        System.out.print("Hello ");

        //println() produces a line break AFTER what's outputted
        System.out.println("Hola");
        //appears on the same line as hi and hello and sets up a line
        //break before bonjour

        System.out.println("bonjour");

        System.out.println();
        System.out.println();

        //since name isn't in quotes, it's interpreted as a variable
        //but since name isn't a variable that has been declared,
        //there is an error

        // System.out.println(name);

        //variables hold data for use in the program
        //to set up a variable, it needs to be declared/defined

        //String is the variable's data type - this acts as the declaration
        //name is the variable name
        //jimothy is the value that's held in name
        String name = "jimothy";

        //now that the var has been defined, it can be used
        System.out.println(name);

        //concatenate (join) strings with a +
        System.out.println("My name is " + name);

        //when referencing or changing an existing var, DON'T redeclare it
        //(don't say String again)
        name = "something else";

        System.out.println("now my name is " + name);

        String friendName = "joe";
        //var nanmes can't have spaces so the convention is to use
        //camelCase - lowercase first word, uppercase first letter of
        //following words
        String lotsOfWords = "my friend's name is " + friendName;
        System.out.println(lotsOfWords);

    }
}