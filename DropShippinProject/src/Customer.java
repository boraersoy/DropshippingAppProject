
public class Customer {
	private int ID;
	private String Name;
	private String Email;
	private String Country;
	private String Address;
	public Customer(int iD,
			String name, String email, String country, String address) {
		ID = iD;
		Name = name;
		Email = email;
		Country = country;
		Address = address;
	}
	@Override
	public String toString() {
		return "Customer [ID=" + ID + ", Name=" + Name + ", Email=" + Email + ", Country=" + Country + ", Address="
				+ Address + "]";
	}
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
}
