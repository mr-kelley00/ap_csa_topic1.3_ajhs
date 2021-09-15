// Author Name, Date, Time, AP CSA Topic 1.3, version 0.5

public class ExpressionsAssignmentStatements {

    public static void main(String[] args) {
        // Declare an int variable named myInt0 and myInt1, assign them any value.
        int myInt0 = 5; 
        int myInt1 = -17;
        // Declare a double variable named myDouble0 and myDouble1, assign them any value.
        double myDouble0 = 1.32;
        double myDouble1 = -14.25; 
        /*
         * Write code that uses all five arithmetic operators on two int values, two
         * double values, and one int and one double value. Print those values on
         * individual lines. One example is provided for you.
         */

        // Addition
        System.out.println(myInt0 + myInt1);
        System.out.println(myDouble0 + myDouble1);
        System.out.println(myInt1 + myDouble1);

        // Subtraction
        System.out.println(myInt0 - myInt1);

        // Division -- Avoid Divide by Zero!
        System.out.println(myInt0 / myInt1);

        // Write a line of code demonstrating that Java rounds down when dividing
        // integers. Print that value on the screen.

        // Multiplication
        System.out.println(myInt0 * myInt1);

        // Modulus
        System.out.println(myInt0 % myInt1);

        /*
         * Write a COMPOUND EXPRESSION that uses at least three unique arithmetic
         * operators and one set of parenthesis. Print the value of that expression on
         * the screen.
         */

    }

}
