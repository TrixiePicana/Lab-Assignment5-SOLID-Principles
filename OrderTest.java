package labassignment5_SOLID_Principles;

//Client Code
public class OrderTest 
{
	public static void main(String[] args) 
	{
		OrderCalculator calculator = new SimpleOrderCalculator();
		OrderPlacer placer = new StandardOrderPlacer();
		InvoiceGenerator pdfGenerator = new PdfInvoiceGenerator();
		InvoiceGenerator xmlGenerator = new XmlInvoiceGenerator();
		EmailNotifier notifier = new SimpleEmailNotifier();
		
		Order PDForder = new Order(calculator, placer, pdfGenerator, notifier);
		PDForder.computeTotal(120.0, 1);
		PDForder.placeOrder("John Doe", "123 Main St");
		PDForder.generateInvoice("order_123.pdf");
		PDForder.sendEmailNotification("johndoe@yahoo.com");
		
		// Example using the XML invoice generator (Open Closed Principle) 
		Order XMLorder = new Order(calculator, placer, xmlGenerator, notifier);
		XMLorder.computeTotal(110.0, 1);
		XMLorder.placeOrder("John Doe", "123 Main St");
		XMLorder.generateInvoice("order_123.xml");
		XMLorder.sendEmailNotification("johndoe@gmail.com");
		
		//Example using basic order interface
		BasicOrder basicorder = new BasicOrderImpl(calculator, placer);
		double basicTotal = basicorder.computeTotal(15.0, 3);
		System.out.println("Basic Order Total: " + basicTotal);
		basicorder.placeOrder("Bill Gates", "365 Victoria St");
	}
}
