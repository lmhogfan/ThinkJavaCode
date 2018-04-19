public class Escape
{
    public static void main(String[] args)
    {
        String header= "\n\tNEW YORK 3-DAY FORECAST:\n";
        header += "\n\tDay\t\tHigh\tLow\tConditions\n";
        header += "\t---\t\t----\t---\t----------\n";

        String forecast= "\tSunday\t68F\t\t48F\tSunny\n";
        forecast += "\tMonday\t69F\t\t57F\tSunny\n";
        forecast += "\tTueday\t71F\t\t50F\tCloudy\n";

        System.out.println(header+forecast);

    }

}
