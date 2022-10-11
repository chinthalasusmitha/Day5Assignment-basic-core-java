package operators;

import java.util.Scanner;

public class LargestNo {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the 1st Number : ");
            int num1 = sc.nextInt();

            System.out.println("Enter the 2nd Number : ");
            int num2 = sc.nextInt();

            System.out.println("Enter the 3rd Number : ");
            int num3 = sc.nextInt();

            if(num1 > num2){
                if(num1 > num3){
                    System.out.println("Largest among the three numbers is "+num1);
                }else{
                    System.out.println("Largest among the three numbers is "+num3);
                }
            }else{
                if(num2 > num3){
                    System.out.println("Largest among the three numbers is "+num2);
                }else{
                    System.out.println("Largest among the three numbers is "+num3);
                }
            }

        }

    }