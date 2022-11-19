package Task2;

import java.util.Stack;

public class MinStack extends Stack<Integer> {
    Stack<Integer> stack1 = new Stack<>(); //main
    Stack<Integer> stack2 = new Stack<>(); //check

    public void push(int a)
    {
        if((stack1.empty())&&(stack2.empty()))
        {
            stack1.push(a);
            stack2.push(a);
        }
        else
        {
            if(a <= stack2.peek())
            {
                stack1.push(a);
                stack2.push(a);
            }
            else
            {
                stack1.push(a);
                stack2.push(stack2.peek());
            }
        }
    }

    public Integer pop()
    {
        stack2.pop();
        return stack1.pop();
    }

    public int min()
    {
        return stack2.peek();
    }
}
