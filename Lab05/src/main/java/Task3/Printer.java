package Task3;

import java.util.ArrayList;
import java.util.List;

public class Printer<T>{
    public List<T> list = new ArrayList<>();

    public String Print()
    {
        String output="";
        for(T dummy : list)
        {
            output += dummy.toString()+"\n";
        }
        return output;
    }
}
