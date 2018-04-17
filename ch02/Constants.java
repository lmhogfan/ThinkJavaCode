/* A program to demonstrate constant varibles.

 */

public class Constants
{
    public static void main (String[] args)
    {
        //Constant score values.
        final int TOUCHDOWN= 6;
        final int CONVERSION= 1;
        final int FIELDGOAL= 3;

        //Calculate points scored.
        int td, pat, fg, total;

        //Output calculated total.
        td = 4*TOUCHDOWN;
        pat=3*CONVERSION;
        fg=2*FIELDGOAL;
        total= (td+pat+fg);

        System.out.println("Score: "+ total);

    }
}
