public class Withdrawal
{
    public static void main(String[] args)
    {
        int withdrawal;
        withdrawal=137;

        int e=20;
        int f=10;
        int g=5;
        int h=1;
        int a= withdrawal/20;
        int b= ((withdrawal-(a*e))/f);
        int c= ((withdrawal-(a*e)-(b*f))/g);
        int d= ((withdrawal-(a*e)-(b*f)-(c*g))/h);

        System.out.println("20s:"+a);
        System.out.println("10s:"+b);
        System.out.println("5s:"+c);
        System.out.println("1s:"+d);

        System.out.println((a*e)+(b*f)+(c*g)+(d*h));

    }
}
