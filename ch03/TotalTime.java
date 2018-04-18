import java.util.Scanner;

public class TotalTime
{
    public static void main (String[] args)
    {
        System.out.println("TotalTime");

        Scanner in= new Scanner(System.in);
        int seconds;
        //seconds to minutes
        int hours=3600;
        int minutes=60;
        //totals
        int totalSeconds;
        int totalMinutes;
        int totalHours;
        //how long did you run?
        System.out.println("How many seconds did you run?");
        seconds=in.nextInt();
        System.out.println("You ran "+seconds+" seconds!");
        //number of hours,minutes, seconds
        totalHours= seconds/hours;
        totalMinutes= ((seconds-(hours*totalHours))/minutes);
        totalSeconds= (seconds-(hours*totalHours))%minutes;
        System.out.printf("%d seconds= %d hours,%d minutes, %d seconds",seconds,totalHours,totalMinutes,totalSeconds);

    }
}
