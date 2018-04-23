public class Divisible
{
    public static void main(String [] args)
    {
        System.out.println(isDivisible(10,5));
        System.out.println(isDivisible(10,3));
        System.out.println(isDivisible(12,5));
        System.out.println(isDivisible(25,5));
        System.out.println(isTriangle(10,2,5));
        System.out.println(isTriangle(10,7,4));

    }
    private static boolean isDivisible(int n, int m)
    {
        boolean answer=false;
        int div=n%m;
        if (div==0)
        {
            answer=true;
        }
        return answer;
    }

    private static boolean isTriangle(int a,int b, int c)
    {
        boolean answer= false;

        if(a<(b+c)&&b<(a+c)&&c<(b+a))
        {
            answer=true;
        }
        return answer;
    }


}
