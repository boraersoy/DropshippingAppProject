
public class Sales {
	private int ID;
	private String Customer;
	private String Product;
	@Override
	public String toString() {
		return "Sales [ID=" + ID + ", Customer=" + Customer + ", Product=" + Product + ", SalesData=" + SalesData
				+ ", SalesPrice=" + SalesPrice + "]";
	}
	public Sales(int iD,
			String customer,
			String product, String salesData, int salesPrice) {
		super();
		ID = iD;
		Customer = customer;
		Product = product;
		SalesData = salesData;
		SalesPrice = salesPrice;
	}
	private String SalesData;
	private int SalesPrice;
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
	public String getSalesData() {
		return SalesData;
	}
	public void setSalesData(String salesData) {
		SalesData = salesData;
	}
	public int getSalesPrice() {
		return SalesPrice;
	}
	public void setSalesPrice(int salesPrice) {
		SalesPrice = salesPrice;
	}
}
