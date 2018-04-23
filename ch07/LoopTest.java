public class LoopTest
{
    public static void main(String [] args)
    {
        int y=1;
        int z=1;
        for (int x=1; x<=10; x++)
        {
            System.out.println("The count of x is: " +x);
        }
        while (y<=10)
        {
            System.out.println("The count of y is: "+y);
            y++;
        }
        do
        {
            System.out.println("The count of z is : "+z);
            z++;
        }
        while(z<=10);
    }
}
