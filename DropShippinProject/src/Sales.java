
public class Sales {
	private int ID;
	private String Customer;
	private String Product;
	private String SalesDate;
	private double SalesPrice;
	
	public Sales(int iD,
			String customer,
			String product, String salesDate, int salesPrice) {
		super();
		ID = iD;
		Customer = customer;
		Product = product;
		SalesDate = salesDate;
		SalesPrice = salesPrice;
	}
	public Sales() {
		// TODO Auto-generated constructor stub
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getCustomer() {
		return Customer;
	}
	public void setCustomer(String customer) {
		Customer = customer;
	}
	public String getProduct() {
		return Product;
	}
	public void setProduct(String product) {
		Product = product;
	}
	public String getSalesDate() {
		return SalesDate;
	}
	public void setSalesDate(String salesData) {
		SalesDate = salesData;
	}
	public double getSalesPrice() {
		return SalesPrice;
	}
	public void setSalesPrice(double salesPrice) {
		SalesPrice = salesPrice;
	}
//	public void calcSalesPrice() {
//		SalesPrice = Price + Rate/5 * 100 * numberOfReviews;
//	}
	@Override
	public String toString() {
		return "Sales [ID=" + ID + ", Customer=" + Customer + ", Product=" + Product + ", SalesData=" + SalesDate
				+ ", SalesPrice=" + SalesPrice + "]";
	}
}
