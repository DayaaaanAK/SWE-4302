package Bonus;

import java.util.Stack;

public class Generic_Stack<T extends Comparable> extends Stack<T> {
    Stack<T> stack1 = new Stack<T>(); //main
    Stack<T> stack2 = new Stack<T>(); //check

    public void Push(T a)
    {
        if((stack1.empty())&&(stack2.empty()))
        {
            stack1.push(a);
            stack2.push(a);
        }
        else
        {
            if(a.compareTo(stack2.peek())<=0)
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

    public T pop()
    {
        stack2.pop();
        return stack1.pop();
    }

    public T min()
    {
        return stack2.peek();
    }
}
