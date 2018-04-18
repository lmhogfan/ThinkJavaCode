import java.util.Scanner;

public class Temperature
{
    public static void main(String[] args)
    {
        double celsius;
        double farenheit;
        Scanner in = new Scanner (System.in);

        System.out.print("What is the temperature in Celsius?");
        celsius= in.nextDouble();
        System.out.println("It is "+celsius+" degrees Celsius.");

        farenheit= (celsius*9.0/5.0)+32.0;
        System.out.println("The temperature in farenheit is "+farenheit);


    }
}
