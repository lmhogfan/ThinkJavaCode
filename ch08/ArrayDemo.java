public class ArrayDemo
{
    public static void main (String [] args)
    {

        int [] numbers={1,5,9};
        printArray(numbers);
        System.out.println();

        int [] numbers2={5,7,13};
        int sum = arrayTotal(numbers2);
        int sum2= arrayTotal(numbers);
        printArray(numbers2);
        System.out.println("The total of these numbers is: "+sum);
        System.out.println();

        printArray(numbers);
        System.out.println("The total of these numbers is: "+sum2);
        System.out.println();

        int [] numbers3= {5,8,21,19,2};
        int max=(arrayMax(numbers3));
        printArray(numbers3);
        System.out.println("The max of these numbers is: "+max);
        System.out.println();

        int [] numbers4= {78,23,9,34};
        int max2=(arrayMax(numbers4));
        printArray(numbers4);
        System.out.println("The max of these numbers is: "+max2);

        int maxIndex=(arrayMaxIndex(numbers4));
        System.out.println(maxIndex);
        int maxIndex2= arrayMaxIndex(numbers3);
        System.out.println(maxIndex2);
        System.out.println();

        double [] numbers5= {34.2,18.0,12.5,13.1};
        double avg= arrayAverage(numbers5);
        System.out.println("The average of these numbers is "+avg);
        System.out.println();

        double [] numbers6= {10.0,15.0,20.0};
        double avg2=(arrayAverage(numbers6));
        System.out.println("The average of these numbers is " +avg2);

        int [] keyword=new int [10];
        keyword [0]=4;
        keyword [3]=2;
        keyword [9]=4;
        printArray(keyword);

        String [] keyword2= new String [10];
        keyword2 [0]= "Hi";
        keyword2 [3]= "Hello";
        keyword2 [9]= "Bye";
        printStrings(keyword2);



    }
    private static void printArray(int [] values)
    {
        for (int value:values)
        {
            System.out.println(value);
        }
    }
    private static int arrayTotal(int[] values)
    {
        int sum=0;
        for(int value: values)
        {
            sum=sum+value;
        }
        return sum;
    }

    private static int arrayMax(int [] values)
    {
        int max=0;
        for(int value:values)
        {
            if(value>max)
            max = value;
        }
        return max;
    }
    private static int arrayMaxIndex( int [] values)
    {
        int max=0;
        int maxIndex=0;

        for (int x = 0; x < values.length; x++)
        {
            if(values[x]>max)
            {
                max=values[x];
                maxIndex=x;
            }
        }
        return maxIndex;
    }
    private static double arrayAverage(double []values)
    {
        double sum=0;
        double length= values.length;
        for (double value:values)
        {
            sum= sum+value;
        }
        double avg= sum/length;
        return avg;
    }
    private static void printStrings (String [] keywords)
    {
        for (String stringTest:keywords)
        {
            System.out.println(stringTest);
        }
    }
}
