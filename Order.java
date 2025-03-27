public class Order
{
    private OrderCalculator calculator;
    private OrderPlacer placer;
    private InvoiceGenerator invoiceGenerator;
    private EmailNotifier notifier;

    public Order(OrderCalculator calculator, OrderPlacer placer, InvoiceGenerator invoiceGenerator, EmailNotifier notifier)
    {
        this.calculator = calculator;
        this.placer = placer;
        this.invoiceGenerator = invoiceGenerator;
        this.notifier = notifier;
    }

    public double computeTotal(double price, int quantity)
    {
        return calculator.computeTotal(price, quantity);
    }

    public void placeOrder(String customerName, String address)
    {
        placer.placeOrder(customerName, address);
    }

    public void generateInvoice(String filename)
    {
        invoiceGenerator.generateInvoice(filename);
    }

    public void sendEmailNotification(String emailAddress)
    {
        notifier.sendEmailNotification(emailAddress);
    }
}