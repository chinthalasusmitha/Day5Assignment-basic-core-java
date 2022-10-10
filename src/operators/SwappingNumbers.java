package operators;
    import java.util.*;
public class SwappingNumbers {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a,b,temp;

            System.out.print("Enter first Number: ");
            a = sc.nextInt();
            System.out.print("Enter second Number: ");
            b = sc.nextInt();

            System.out.println("Before Swapping: "+a+" "+b);

            temp = a;
            a = b;
            b = temp;

            System.out.println("After Swapping: "+a+" "+b);
        }
    }

