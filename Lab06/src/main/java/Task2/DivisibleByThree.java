package Task2;

public class DivisibleByThree implements Property<Integer>{

    @Override
    public boolean checkProperty(Integer obj) {
        return obj % 3 == 0;
    }
}
