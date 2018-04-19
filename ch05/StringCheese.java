import java.util.Scanner;

public class StringCheese
{
    public static void main(String[] args)
    {
        /*
        1&2 inch cheese= $2 shipping per yard
        3 inch cheese= $4 shipping per yard
        1 inch= $2/yard
        2 inch= $4/yard
        3 inch= $6/yard
        "The cost of your cheese is $"+
         */
        int inchPrice= 2;
        int inch2Price=4;
        int inch3Price=6;
        int shipping12=2;
        int shipping3=4;
        int yards;  //yards ordered
        int cheese;  //type of cheese

        Scanner amount= new Scanner(System.in); //get yards
        Scanner type= new Scanner (System.in);  //get cheese type

        System.out.println("What diameter cheese would you like to order?");
        cheese=type.nextInt();
        System.out.println("How many yards would you like to order?");
        yards=amount.nextInt();

        if ((yards>50&&cheese==1))
            System.out.println("The cost of your cheese is $"+((yards*inchPrice)+5));
        else if ((yards<=50&&cheese==1))
            System.out.println("The cost of your cheese is $"+((yards*inchPrice)+(yards*shipping12)+5));
        else if ((yards>75&&cheese==2))
            System.out.println("The cost of your cheese is $"+((yards*inch2Price)+5));
        else if ((yards<=75&&cheese==2))
            System.out.println("The cost of your cheese is $"+((yards*inch2Price)+(yards*shipping12)+5));
        else if ((yards>25&&cheese==3))
            System.out.println("The cost of your cheese is $"+((yards*inch3Price)+5));
        else if ((yards<=25&&cheese==3))
            System.out.println("The cost of your cheese is $"+((yards*inch3Price)+(yards*shipping3)+5));
        else
            System.out.println("This order is too crazy!");
    }
}
