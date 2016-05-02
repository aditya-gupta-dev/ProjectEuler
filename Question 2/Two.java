
/**
 * My solution to Project Euler Question 2
 * 
 * @author Vignesh Rajmohan
 * @version May 1, 2016
 */
public class Two
  
  {
    public static void main (String[] args)
      {
        int current = 1, next = 2, fib = 0, sum = 0;
        int start = 2;
        
        for (int i = 0; i <= 30; i++)
          {
              
            fib = current + next;
            current = next;
            next = fib;
            
            if (fib % 2 == 0)
              {
                sum += fib;
              }
            
          }
        
          
        System.out.println(start + sum);
      }
  }
