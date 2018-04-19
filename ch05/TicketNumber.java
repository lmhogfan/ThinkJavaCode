import java.util.Scanner;

public class TicketNumber
{
    public static void main (String [] args)
    {
        int ticketNumber;
        Scanner myTicket=new Scanner(System.in);
        System.out.println("What is your ticket number?");
        ticketNumber=myTicket.nextInt();

        int lastDigit=ticketNumber%10;
        int ticketPrefix= (ticketNumber-lastDigit);
        if ((ticketPrefix/10)%7==lastDigit)
            System.out.println("Good Number");
        else
            System.out.println("Bad Number");

    }
}
