public class SimpleMethods
{
    public static void main(String[] args)
    {
        printCount(5);
        printSum(4,6);
        printSum(7,2);
        printBoolean(true);
        printBoolean(false);
    }
    private static void printCount(int count)
    {
        System.out.println("The count is: "+count);
    }
    private static void printSum(int x,int y)
    {
        System.out.print(x+ " + " +y+ " = ");
        System.out.println(x+y);
    }
    private static void printBoolean(boolean isStudent)
    {
        System.out.println("I am a student: "+isStudent);
    }
}
