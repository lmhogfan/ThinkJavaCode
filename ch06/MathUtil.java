public class MathUtil
{
    public static void main (String [] args)
    {
        System.out.println(absoluteSum(10,-20));
        System.out.println(absoluteSum(0,-1));
        System.out.println(absoluteSum(12,12));
        System.out.println(absoluteOverload(5,-20,-80));
        System.out.println(absoluteOverload(-10,10,-1));
        System.out.println(absoluteOverload(2,3,4));

    }
    private static int absoluteSum(int x, int y)
    {
        int absX= Math.abs(x);
        int absY= Math.abs(y);

        return (absX+absY);
    }
    private static int absoluteOverload(int x, int y, int z)
    {
        int absX= Math.abs(x);
        int absY= Math.abs(y);
        int absZ= Math.abs(z);

        return (absX+absY+absZ);
    }
}
