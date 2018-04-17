public class Date
{
    public static void main (String [] Args)
    {
        int date, year;
        String day;
        String month;


        date =17;
        day = "Tuesday";
        month = "April ";
        year= 2018;

        System.out.println("American Format:" );
        System.out.println( day +", " + month + date +", "+year);

        System.out.println("European Format:");
        System.out.println(day+" " + date +" "+ month +year);
    }
}
