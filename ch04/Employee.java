import java.util.Scanner;
import java.util.Random;

public class Employee
{
    public static void main(String[] args)
    {
        System.out.println("Employee");
        int birthYear= 1995;
        boolean isUnionMember= true;
        int employeeNumber;
        Scanner scanner=new Scanner(System.in);

        printHeader();
        System.out.println("Please enter your 5 digit employee number: ");
        employeeNumber=scanner.nextInt();
        printFullName("Luke ","Allen ", "Martin, ");
        printUnionStatus(true);
        printAge(1995);
        printEvenOrOdd(101545);
        printGenerateSecretPassword(2);

    }
    private static void printHeader()
    {
        System.out.println("Welcome to the WallabyTech Employee Application");
        System.out.println("===============================================");
    }
    private static void printFullName (String first, String middle, String last)
    {
        System.out.println(last+first+middle);
    }
    private static void printUnionStatus(boolean union)
    {
        System.out.println("Your union status is: "+union);
    }
    private static void printAge(int birthYear)
    {
        int currentYear= 2018;
        System.out.println("Your age is: "+(currentYear-birthYear));
    }
    public static void printEvenOrOdd(int eo)
    {
        System.out.println("Employee number is even/odd (1=odd, 0=even);");
        System.out.println(eo%2);
    }
    public static void printGenerateSecretPassword(int password)
    {
        Random random=new Random();
        int employeeNumber=101545;
        int randomNumber=random.nextInt(10)+1;

        System.out.println("Employee's random secret pw is: "+(employeeNumber*randomNumber)*5);
    }
}


