public class Commission extends Hourly {
	private double totalSales;
	private double commissionRate;

	public Commission(String eName, String eAddress, String ePhone, String socSecNumber, double rate, double commRate)
	{
		super(eName, eAddress, ePhone, socSecNumber, rate);
		commissionRate = commRate;
	}

	public void addSales (double totalSales)
	{
		this.totalSales = totalSales;
	}

	public double pay()
	{
		double payment = super.pay() + commissionRate*totalSales;

		return payment;
	}

	public String toString()
	{
		return (super.toString()+"\nTotal Sales: $"+totalSales);
	}
}