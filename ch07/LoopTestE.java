import java.util.Scanner;

public class LoopTestE
{
    public static void main(String[] args)
    {
        zero();
        System.out.println("The number is zero");
    }

    private static int zero()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Please type the number zero");
        int x = in.nextInt();
        while (x != 0)
        {
            System.out.println("Please type the number zero");
            x= in.nextInt();
        }
        return x;
    }
}