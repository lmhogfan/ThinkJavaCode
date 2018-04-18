public class Time
{
    public static void main(String[] args)
    {
        double hour, minute, second;
        String time;
        String secondsLeft;
        double midnight;
        double secondsTotal;
        double secondsInDay;
        String percPassed;
        double percent;

        time = "Number of seconds since Midnight: ";
        secondsLeft= "The amount of seconds left in the day: ";
        percPassed= "The percentage of the day that has passed: ";

        hour = 15.0;
        minute = 32.0;
        second = 45.0;
        secondsInDay= (86400.0);
        midnight= (second + (minute * 60) + (hour * 60 * 60));
        secondsTotal= (((23-hour)*60*60)+((59-minute)*60)+ (60-second));
        percent= ((midnight/secondsInDay));

        System.out.println(time+midnight);
        System.out.println(secondsLeft+secondsTotal);
        System.out.println(percPassed+(percent*100));

        hour = 16.0;
        minute = 18.0;
        second= 45.0;

        double timeNow;
        String timeSince;

        timeNow= (second+(minute*60)+(hour*60*60));
        timeSince= "Seconds since exercise started: ";

        System.out.println(timeSince+(timeNow-midnight));




    }
}
