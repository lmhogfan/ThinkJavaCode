import java.util.Scanner;

public class HowManyDogs
{
    public static void main (String [] args)
    {
        int numDogs=0;

        System.out.println("How many dogs do you have?");
        Scanner dogs= new Scanner(System.in);
        numDogs=dogs.nextInt();

        String [] dogName= new String[numDogs];
        System.out.println("What is your dogs name?");
        Scanner name= new Scanner(System.in);
        for (int number=0;number<numDogs; number++)
        {
            dogName[number]=name.nextLine();
        }
        dogList(dogName);

    }
    private static void dogList (String[] values)
    {
        for (String list:values)
        {
            System.out.println("I have a dog named "+list);
        }
    }
}
