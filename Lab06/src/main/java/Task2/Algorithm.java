package Task2;

import java.util.List;

public class Algorithm{
    private int count = 0;
    public <T> int CountIf(List<T> list, Property<T> obj)
    {
        for(T dummy: list)
        {
            if( obj.checkProperty(dummy))
                count++;
        }
        return count;
    }
}
