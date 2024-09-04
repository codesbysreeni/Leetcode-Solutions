public class MyPow 
{
    public double myPow(double x, long n) 
    {
        if(n == 0)
        {
            return 1;
        }
        else if (n < 0)
        {
            return 1 / myPow(x, -n);
        }
        else
        {
            return x * myPow(x, n-1);   
        }
    }
    public static void main(String[] args)
    {
        double x = 2.1000;
        int n = 2;

        MyPow result = new MyPow();
        System.out.println("The result of " + x + " raised to the power of " + n + " is: " + result.myPow(x, n));
    }
} 