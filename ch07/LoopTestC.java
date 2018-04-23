public class LoopTestC
{
    public static void main (String [] args)
    {
        for (int x=100; x>=-100; x-=8)
        {
            System.out.println("The count of x is: "+x);
        }
        int y=100;
        while(y>=-100)
        {
            System.out.println("The count of y is: "+y);
            y-=8;
        }
        int z=100;
        do
        {
            System.out.println("The count of z is: "+z);
            z-=8;
        }
        while(z>=-100);
    }
}
