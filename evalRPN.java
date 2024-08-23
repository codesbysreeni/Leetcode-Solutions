import java.util.Stack;

public class evalRPN {
    public int evalRPN(String[] tokens) {
        
        Stack<Integer> s = new Stack<>();
        int a = 0, b = 0;
        
        int i = tokens.length;
        //  System.out.println("Length " + i);
        

        for (int j = 0; j <= i - 1; j++) {
            if(!tokens[j].equals("+") && !tokens[j].equals("-")
            && !tokens[j].equals("*") && !tokens[j].equals("/"))
			{
                s.push(Integer.valueOf(tokens[j]));
                //  System.out.println("Push : " + s);
            } 
			else 
			{
                switch (tokens[j]) 
                {
                    case "+":
                        b = s.pop();
                        a = s.pop();
                        s.push(a + b);
                        break;
                    case "-":
                        b = s.pop();
                        a = s.pop();
                        s.push(a - b);
                        break;
                    case "*":
                        b = s.pop();
                        a = s.pop();
                        s.push(a * b);
                        break;
                    case "/":
                        b = s.pop();
                        a = s.pop();
                        s.push(a / b);
                        break;
                }
            }
        }
        return s.pop();
    }
}
