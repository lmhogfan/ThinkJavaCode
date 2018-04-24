import java.util.Scanner;

public class VendingMachine
{
    public static void main(String[] args)
    {
        String[] meals = new String[3];
        meals[0] = "0)\tFreeze Dried Sushi";
        meals[1] = "1)\tSpock's Brain Blast";
        meals[2] = "2)\tAlien Asparagus";
        printMenu(meals);
        System.out.println("Your selection: ");
        int[] numSold = new int[3];
        printSales(numSold);
    }

    private static void printMenu(String[] menu)
    {
        System.out.println("Please select from: ");
        for (String menuOptions : menu)
        {
            System.out.println(menuOptions);
        }
    }

    private static void printSales(int[] sales)
    {
        for (int totalSales : sales)
        {
            Scanner choose = new Scanner(System.in);
            int choice = choose.nextInt();
            int sushi = 0;
            int spock = 0;
            int asparagus = 0;

            if (choice == 99)
                System.out.println("Goodbye!");
            else if (choice == 0)
            {
                for (sushi = 0; sushi < 99; sushi++) ;
                {
                    sushi+=totalSales;
                }
            } else if (choice == 1)
            {
                for (totalSales = 0; totalSales < 99; totalSales++) ;
                {
                    spock = totalSales + 1;
                }
            } else if (choice == 2)
            {
                for (totalSales = 0; totalSales < 99; totalSales++) ;
                {
                    asparagus = totalSales + 1;
                }
            }
            System.out.println("Thank you for choosing Alien Asparagus");
            System.out.println("Sold so far:");
            System.out.println(sushi + " of Freeze Dried Sushi");
            System.out.println(spock + " of Spock's Brain Blast");
            System.out.println(asparagus + " of Alien Asparagus");
        }
    }
}