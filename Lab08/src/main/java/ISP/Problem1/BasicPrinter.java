package ISP.Problem1;

public class BasicPrinter implements IPrinter{

    @Override
    public String Print(Document d)
    {
        String s = "Printing: " + d.text;
        return s;
    }
}
