public class BigMethodSignature
{
    public static void main(String[] args)
    {
        printSum(1,2,3,4,5,6,7,8,9,10);
        printSum(10,20,30,40,50,60,70,80,90,100);
    }
    private static void printSum(int a, int b, int c, int d, int e, int f, int g, int h, int i, int j)
    {
        System.out.println(a+b+c+d+e+f+g+h+i+j);
    }
}
