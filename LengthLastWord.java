public class LengthLastWord {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        int counter = 0;
        int i = n - 1;
        while (i >= 0 && s.charAt(i) == ' ')
        {
            i--;
        }
        while (i >= 0 && s.charAt(i) != ' ')
        {
            counter++;
            i--;
        }
        return counter;
        }
}
