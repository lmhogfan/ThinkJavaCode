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
        Scanner choose = new Scanner(System.in);
        int sushi=0;
        int spock=0;
        int asparagus=0;
        for (int x = 0; x >=0; x++)
        {

            int choice = choose.nextInt();
            if (choice == 99)
            {
                break;
            }
            else if (choice == 0)
                {
                    numSold[0] = numSold[0] + 1;
                    sushi = numSold[0];
                    System.out.println("Thank you for choosing Alien Asparagus");
                    System.out.println("Sold so far: ");
                    System.out.println(sushi + " Freeze Dried Sushi");
                    System.out.println(spock + " Spock's Brain Blast");
                    System.out.println(asparagus + " Alien Asparagus");
                }

            else if (choice == 1)
            {
                numSold[1] = numSold[1] + 1;
                spock=numSold[1];
                System.out.println("Thank you for choosing Alien Asparagus");
                System.out.println("Sold so far: ");
                System.out.println(sushi+" Freeze Dried Sushi");
                System.out.println(spock+" Spock's Brain Blast");
                System.out.println(asparagus+" Alien Asparagus");
            }

            else if (choice == 2)
            {
                numSold[2] = numSold[2] + 1;
                asparagus=numSold[2];
                System.out.println("Thank you for choosing Alien Asparagus");
                System.out.println("Sold so far: ");
                System.out.println(sushi+" Freeze Dried Sushi");
                System.out.println(spock+" Spock's Brain Blast");
                System.out.println(asparagus+" Alien Asparagus");
            }
        }
        System.out.println("Goodbye!");
        printSales(sushi,spock,asparagus);
    }

    private static void printMenu(String[] menu)
    {
        System.out.println("Please select from: ");
        for (String menuOptions : menu)
        {
            System.out.println(menuOptions);
        }
    }

    private static void printSales(int sushiPass, int spockPass, int asparagusPass)
    {
        {
            System.out.println("Thank you for choosing Alien Asparagus");
            System.out.println("Sold so far: ");
            System.out.println(sushiPass + " Freeze Dried Sushi");
            System.out.println(spockPass + " Spock's Brain Blast");
            System.out.println(asparagusPass + " Alien Asparagus");
        }
    }
}
