public class StringUtil
{
    public static void main (String [] args)
    {
        getFirstCharacter("Hello");
        getFirstCharacter("Goodbye");
        getLastCharacter("Hello");
        getLastCharacter("Goodbye");
        getFirstTwoCharacters("Hello");
        getFirstTwoCharacters("Goodbye");
        getLastTwoCharacters("Hello");
        getLastTwoCharacters("Goodbye");
        getAllButFirstThreeCharacters("Hello");
        getAllButFirstThreeCharacters("Goodbye");
        printCharacters("Hello");

    }
    private static String getFirstCharacter(String test)
    {
        String answer= test.substring(0,1);
        System.out.println(answer);
        return answer;
    }
    private static String getLastCharacter (String test)
    {
        int start= test.length();
        String answer=test.substring(start-1);
        System.out.println(answer);
        return answer;
    }
    private static String getFirstTwoCharacters (String test)
    {
        String answer=test.substring(0,2);
        System.out.println(answer);
        return answer;
    }
    private static String getLastTwoCharacters (String test)
    {
        int start= test.length();
        String answer=test.substring(start-2);
        System.out.println(answer);
        return answer;
    }
    private static String getAllButFirstThreeCharacters(String test)
    {
        String answer=test.substring(3);
        System.out.println(answer);
        return answer;
    }
    private static int printCharacters(String test)
    {
        int position=0;
        for(int x=0; x<test.length(); x++)
        {
            char letter=test.charAt(x);
            position++;
            System.out.println(letter+":"+(position-1));
        }
        return position;
    }
}