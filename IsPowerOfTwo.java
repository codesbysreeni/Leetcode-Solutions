public class IsPowerOfTwo 
{
    public boolean isPowerOfTwo(int n) 
    {
        if (n == 1) 
        {
            return true;
        }
        else if (n <= 0) 
        {
            return false;
        }
        else if (n % 2 != 0) 
        {
            return false;
        }
        else
        {
            return isPowerOfTwo(n / 2);
        }
    }
    public static void main(String[] args) 
    {
        IsPowerOfTwo result = new IsPowerOfTwo();
        int n = 8;
        System.out.println("Result: " + result.isPowerOfTwo(n));
    }
}