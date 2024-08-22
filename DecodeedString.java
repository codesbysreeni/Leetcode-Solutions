import java.util.Stack;

public class DecodeedString {
    public static void main(String[] args) 
    {
        String s = "2[abc]3[cd]ef";
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) 
        {
            char ch = s.charAt(i);
            if (ch != ']') 
            {
                stack.push(ch);
            } 
            else 
            {
                StringBuilder newstring = new StringBuilder();
                while (stack.peek() != '[') 
                {
                    newstring.insert(0, stack.pop());
                }
                stack.pop();
                StringBuilder numString = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) 
                {
                    numString.insert(0, stack.pop());
                }
                int number = Integer.parseInt(numString.toString());
                StringBuilder temp = new StringBuilder();
                for (int j = 0; j < number; j++) 
                {
                    temp.append(newstring);
                }
                for (int j = 0; j < temp.length(); j++) 
                {
                    stack.push(temp.charAt(j));
                }
            }
        }
        StringBuilder finalstring = new StringBuilder();
        while (!stack.isEmpty()) 
        {
            finalstring.insert(0, stack.pop());
        }
        System.out.println("Decoded String: " + finalstring.toString());
    }
}
