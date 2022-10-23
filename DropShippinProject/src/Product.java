
public class Product {
	private String ID;
	private String Title;
	private double Rate;
	private int NumberOfReviews;
	private int Price;
	public Product(String iD,
			String title,
			double rate, int number_of_Reviews, int price) {
		
		ID = iD;
		Title = title;
		Rate = rate;
		NumberOfReviews = number_of_Reviews;
		Price = price;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", Title=" + Title + ", Rate=" + Rate + ", Number_of_Reviews=" + NumberOfReviews
				+ ", Price=" + Price + "]";
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public double getRate() {
		return Rate;
	}
	public void setRate(double rate) {
		Rate = rate;
	}
	public int getNumberofReviews() {
		return NumberOfReviews;
	}
	public void setNumberofReviews(int d) {
		NumberOfReviews = d;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
}
