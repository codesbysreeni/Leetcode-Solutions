public class PalindromeNumber 
{
    public boolean isPalindrome(int x) 
    {
        String str = String.valueOf(x);
        StringBuilder rev_str = new StringBuilder();
        int pointer = str.length() - 1;

        while (pointer >= 0) 
        {
            rev_str.append(str.charAt(pointer));
            pointer--;
        }

        String result = rev_str.toString();

        if (str.equals(result)) 
        {
            return true;
        } 
        else 
        {
            return false;
        }
    }
}