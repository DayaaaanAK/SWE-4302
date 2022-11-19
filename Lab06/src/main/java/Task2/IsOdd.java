package Task2;

public class IsOdd implements Property<Integer>{

    @Override
    public boolean checkProperty(Integer obj) {
        return obj % 2 != 0;
    }
}
