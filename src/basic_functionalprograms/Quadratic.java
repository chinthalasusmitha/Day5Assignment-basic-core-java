package basic_functionalprograms;
import java.util.Scanner;
public class Quadratic {

        public static void main(String[] args)
        {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the value of a: ");
            double a = input.nextDouble();
            System.out.print("Enter the value of b: ");
            double b = input.nextDouble();
            System.out.print("Enter the value of c: ");
            double c = input.nextDouble();
            double d= b * b - 4.0 * a * c;
            System.out.println("The roots are:" + d);
            if (d> 0.0)
            {
                double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
                double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
//                Root 1 of x = (-b + sqrt(delta))/(2*a)
//                Root 2 of x = (-b - sqrt(delta))/(2*a)
                System.out.println("The roots are " + r1 + " and " + r2);
            }
        }
}
