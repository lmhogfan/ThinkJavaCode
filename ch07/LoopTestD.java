public class LoopTestD
{
    public static void main (String [] args)
    {
        numSequence(50);
    }

    private static int numSequence(int x)
    {
        int num=1;
        while(num<=x)
        {
            System.out.println(num++);
        }
        return num;
    }
}
