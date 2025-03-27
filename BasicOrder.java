package labassignment5_SOLID_Principles;

//Implementing ISP (Interface Segregation Principle)for some orders where invoice and 
//email notifications are not required
public interface BasicOrder 
{
	double computeTotal(double price, int quantity);
	void placeOrder(String customerName, String address);
}
