package ISP.Problem1;

import java.util.Scanner;

public class MultifunctionPrinter implements IPrinter,IFax,IScanner{
    @Override
    public String Fax(Document d)
    {
        return ("Faxing: " + d.text);
    }

    @Override
    public String Print(Document d)
    {
        return  ("Printing: " + d.text);

    }

    @Override
    public Document Scan(String s)
    {
        Document d = new Document();
        d.text = s;
        return d;
    }
}
