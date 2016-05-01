
/**
 * My Solution to Euler Project Question 1
 * 
 * @author Vignesh Rajmohan
 * @version April 28, 2016
 */
public class One
{
    public static void main()
    {
        int sum = 0;
        for (int i = 0; i < 1000; i++)
        {
            if (i % 3 == 0)
            {
                sum += i;
            }
            else if (i % 5 == 0)
            {
                sum += i;
            }
        }
        
        System.out.print(sum);
    }
}
