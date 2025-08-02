package numbers;

public class friendlyPair {
    public static void main (String[]args)
    {

        int num1 = 6, num2 = 28;

        int sum1 = getDivisorsSum (num1);
        int sum2 = getDivisorsSum (num2);

        if ((double)sum1 / num1 ==(double) sum2 / num2)
            System.out.println (num1 + "  " + num2 + " are friendly pairs");
        else
            System.out.println (num1 + "  " + num2 + " are not friendly pairs");
    }

    static int getDivisorsSum (int num)
    {

        int sum = 0;

        for (int i = 1; i < num; i++)
        {
            if (num % i == 0)
                sum = sum + i;
        }
        return sum;
    }
}
