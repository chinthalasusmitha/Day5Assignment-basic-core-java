package harmonic;
    import java.util.Scanner;
public class HarmonicNo {
        public static void main(String arg[])
        {
            double a;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter a number");
            a=sc.nextDouble();
            double h=harmonicCal(a);
            System.out.println("Harmonic value = "+h);
        }
        static double harmonicCal(double n)
        {
            double sum=0;
            for(double  i=2;i<=n;i++)
            {
                sum=sum+(1/i);
            }
            return sum;
        }
    }

