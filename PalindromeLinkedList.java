import java.util.Stack;

public class PalindromeLinkedList {

    public static void main(String[] args) {
        int[] list = {1, 2, 2, 1};

        Stack<Integer> stack = new Stack<>();
        int n = list.length;

        int start = (n % 2 == 0) ? n / 2 : n / 2 + 1;

        for (int i = 0; i < n / 2; i++) 
        {
            stack.push(list[i]);
        }

        boolean isPalindrome = true;
        for (int i = start; i < n; i++) 
        {
            int j = stack.pop();
            if (list[i] != j) 
            {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) 
        {
            System.out.println("The list is a palindrome");
        } else 
        {
            System.out.println("The list is not a palindrome");
        }
    }
}
