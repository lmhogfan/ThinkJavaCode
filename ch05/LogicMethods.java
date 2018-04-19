public class LogicMethods
{
    public static void main(String [] args)
    {
        printIsLarge(100);
        printIsLarge(20);
        printIsLarge(1000);
        printIsLargeOrSmall(5);
        printIsLargeOrSmall(100);
        printIsLargeOrSmall(1);
        printLargest(10,2);
        printLargest(4,8);
        printLargest(5,5);
        printLargestOdd(27,10);
        printLargestOdd(13,15);
        printLargestOdd(10,4);
    }
    private static void printIsLarge(int number)
    {
        if (number>99)
        System.out.println("The number is large");
    }
    private static void printIsLargeOrSmall(int number)
    {
        if (number>99)
            System.out.println("The number is large");
        if (number<10)
            System.out.println("The number is small");
    }
    private static void printLargest(int number1,int number2)
    {
        if (number1>number2)
            System.out.println("The largest number is: "+number1);
        else if (number2>number1)
            System.out.println("The largest number is: "+number2);
        else
            System.out.println("The numbers are equal");
    }
    private static void printLargestOdd(int number1,int number2)
    {
        if ((number1%2!=0&&(number1>number2)))
            System.out.println("The largest odd number is: "+number1);
        else if ((number2%2!=0&&(number2>number1)))
            System.out.println("The largest odd number is: "+number2);
        else
        {
            System.out.print("Two odds make an even ");
            System.out.print(number1 + " + " + number2);
            System.out.println(" = "+(number1+number2));
        }
    }
}
