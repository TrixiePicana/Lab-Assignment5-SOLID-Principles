public class BasicOrderImplementation implements BasicOrder
{
    private OrderCalculator calculator;
    private OrderPlacer placer;

    public BasicOrderImplementation (OrderCalculator calculator, OrderPlacer placer)
    {
        this.calculator = calculator;
        this.placer = placer;
    }

    @Override
    public double computeTotal(double price, int quantity)
    {
        return calculator.computeTotal(price, quantity);
    }

    @Override
    public void placeOrder(String customerName, String address)
    {
        placer.placeOrder(customerName, address);
    }
}