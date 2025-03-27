public class StandardOrderPlacer implements OrderPlacer
{
    @Override
    public void placeOrder(String customerName, String address)
    {
        System.out.println("The order is out for delivery for " + customerName + " at " + address + ".");
    }
}