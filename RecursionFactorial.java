public class RecursionFactorial 
{
    public static int fact(int n) 
    {
        if(n != 0)
        {
            return n * fact(n-1);
        }
        else
        {
            return 1;
        }
    }
    public static void main(String[] args) 
    {
        int n=10;
        System.out.println("Factorial of 10 is " + fact(n));
    }
} 