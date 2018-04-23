public class LoopTestB
{
    public static void main (String [] args)
    {
        for(int x=0; x<=100;x+=10)
        {
            System.out.println("The count of x is: "+x);
        }
        int y=0;
        while (y<=100)
        {
            System.out.println("The count of y is: "+y);
            y+=10;
        }
        int z=0;
        do
        {
            System.out.println("The count of z is: "+z);
            z+=10;
        }
        while (z<=100);
    }
}
