public class MathUtil
{
    public static void main(String[] args)
    {
        printDifference(1000,400000);
    }
    public static void printDifference(int x, int y)
    {
        printAbsValue(x-y);
    }
    public static void printAbsValue(int z)
    {
        System.out.println("Value is: "+z+"\nAbsolute Value is: "+Math.abs(z));
    }

}
