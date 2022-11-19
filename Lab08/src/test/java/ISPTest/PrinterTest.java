package ISPTest;

import ISP.Problem1.BasicPrinter;
import ISP.Problem1.Document;
import ISP.Problem1.MultifunctionPrinter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrinterTest {
    @Test
    public void PrinterTest1()
    {
        Document document = new Document();
        document.text = "This is a text.";
        BasicPrinter dummy = new BasicPrinter();
        assertEquals("Printing: This is a text.",dummy.Print(document));
    }
    @Test
    public void PrinterTest2()
    {
        MultifunctionPrinter dummy = new MultifunctionPrinter();
        Document document = dummy.Scan("This is a text.");
        assertTrue(dummy.Scan("This is a text.") instanceof Document);
        assertEquals("Printing: This is a text.", dummy.Print(document));
        assertEquals("Faxing: This is a text.", dummy.Fax(document));
    }
}
