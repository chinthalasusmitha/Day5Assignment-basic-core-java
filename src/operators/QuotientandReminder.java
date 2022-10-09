package operators;

import java.util.Scanner;

public class QuotientandReminder {
    // Java Program to Compute Quotient and Remainder

        public static void main(String[] args) {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("To get a quotient and reminder");

            int dividend = 50, divisor = 5;

            int quotient = dividend / divisor;
            int remainder = dividend % divisor;

            System.out.println("Quotient = " + quotient);
            System.out.println("Remainder = " + remainder);
        }
    }
