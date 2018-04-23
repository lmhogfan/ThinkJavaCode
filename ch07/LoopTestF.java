import java.util.Scanner;

public class LoopTestF
{
    public static void main (String [] args)
    {
        runningTotal();
    }
    private static int runningTotal()
    {
        Scanner in= new Scanner(System.in);
        System.out.println("Enter a number: ");
        int x= in.nextInt();
        int sum=0;
        while(sum<=1000)
        {
            sum+=x;
            System.out.println("The total of the numbers is " + sum);
            System.out.println("Please enter another number: ");
            x=in.nextInt();
        }
        System.out.println("The final total is: "+sum);
        return x;
    }
}
