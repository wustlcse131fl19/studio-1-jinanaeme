package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main (String[] args){

        ArgsProcessor ap = new ArgsProcessor(args);

        Double n1 = ap.nextDouble("Enter a value for the first number: ");
        Double n2 = ap.nextDouble("Enter a value for the second number:");

        double average = (n1 + n2)/2;

        System.out.println("This is the average of the two numbers: " + average);
    }

}

