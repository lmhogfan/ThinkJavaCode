public class MultiplicationTable
{
    public static void main (String [] args)
    {
        printTable(20);
    }
    public static void printRow(int n,int cols)
        {
            int x= 1;

            while (x<=cols)
             {
                System.out.printf("%4d",x*n);
                x=x+1;
             }
            System.out.println();
        }
     private static void printTable(int rows)
     {
         int y = 1;
         while (y <= rows)
         {
             printRow(y,rows);
             y=y+1;
         }
     }
}
