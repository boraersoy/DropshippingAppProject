
public class Product {
	private int ID;
	private String Title;
	private double Rate;
	private int Number_of_Reviews;
	private int Price;
	public Product(int iD,
			String title,
			double rate, int number_of_Reviews, int price) {
		ID = iD;
		Title = title;
		Rate = rate;
		Number_of_Reviews = number_of_Reviews;
		Price = price;
	}
	@Override
	public String toString() {
		return "Product [ID=" + ID + ", Title=" + Title + ", Rate=" + Rate + ", Number_of_Reviews=" + Number_of_Reviews
				+ ", Price=" + Price + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
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
	public int getNumber_of_Reviews() {
		return Number_of_Reviews;
	}
	public void setNumber_of_Reviews(int number_of_Reviews) {
		Number_of_Reviews = number_of_Reviews;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	
}
