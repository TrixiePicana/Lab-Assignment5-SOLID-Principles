package labassignment5_SOLID_Principles;

public class SimpleOrderCalculator implements OrderCalculator
{
	@Override
	public double computeTotal (double price, int quantity) 
	{
		return price * quantity;
	}
}

