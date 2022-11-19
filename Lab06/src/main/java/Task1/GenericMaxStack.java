package Task1;

//import java.util.Comparator;
import java.util.Stack;

public class GenericMaxStack<T extends Comparable<T>> extends Stack<T> {
    Stack<T> main_stack = new Stack<>();
    Stack<T> max_stack = new Stack<>();

    public void Push(T a)
    {
        if((main_stack.empty())&&(max_stack.empty()))
        {
            main_stack.push(a);
            max_stack.push(a);
        }
        else
        {
            if(a.compareTo(max_stack.peek())>=0)
            {
                main_stack.push(a);
                max_stack.push(a);
            }
            else
            {
                main_stack.push(a);
                max_stack.push(max_stack.peek());
            }
        }
    }

    public T pop()
    {
        max_stack.pop();
        return main_stack.pop();
    }

    public T max()
    {
        return max_stack.peek();
    }
}
