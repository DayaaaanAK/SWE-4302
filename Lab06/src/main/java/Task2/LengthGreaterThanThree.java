package Task2;

public class LengthGreaterThanThree implements Property<String>{
    @Override
    public boolean checkProperty(String obj) {
        return obj.length() > 3;
    }
}
