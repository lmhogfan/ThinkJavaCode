public class Coffee
{
    public static void main(String[] args)
    {
        /*
        Travel<21=free coffee
        Bike<30=10%
        Ride>=35 =20%
        Bike <50 = 20%
        Ride <50 = 30%
         */
        bikeDiscount(20);
        bikeDiscount(30);
        bikeDiscount(52);
        busDiscount(35);
        busDiscount(50);
    }
    public static void bikeDiscount(int milesRidden)
    {
      int discount=0;
        if (milesRidden<21)
            discount=100;
        if (milesRidden<50&&milesRidden>=30)
            discount=20;
        if (milesRidden<30&&milesRidden>=21)
            discount=30;
        System.out.println("You receive "+discount+"% off!");
    }
    public static void busDiscount(int milesRidden)
    {
        int discount=0;
        if (milesRidden<21)
            discount=100;
        if (milesRidden>=35&&milesRidden<50)
            discount=50;
        if (milesRidden<=50&&milesRidden>35)
            discount=30;
        System.out.println("You receive "+discount+"% off!");
    }
}
