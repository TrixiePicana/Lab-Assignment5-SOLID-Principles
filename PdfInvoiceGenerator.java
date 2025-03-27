public class PdfInvoiceGenerator implements InvoiceGenerator
{
    @Override
    public void generateInvoice(String filename)
    {
        System.out.println("The invoice is produced using " + filename + ".");
    }
}
