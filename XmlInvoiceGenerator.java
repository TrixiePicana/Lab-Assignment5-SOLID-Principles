//We can extend the functionality by creating new classes that implement the interfaces
//without modifying the existing Order class.
public class XmlInvoiceGenerator implements InvoiceGenerator
{
    @Override
    public void generateInvoice(String filename)
    {
        System.out.println("The invoice is produced using " + filename + ".");
    }
}