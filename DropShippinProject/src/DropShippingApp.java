import java.io.FileNotFoundException;

public class DropShippingApp {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileIO file = new FileIO();
		file.transferCustomerData("src\\Customers.csv");
		file.transferProductData("src\\S1_Products.csv");
		file.transferProductData("src\\S2_Products.csv");
		file.transferProductData("src\\S3_Products.csv");
		file.transferSalesData("src\\S1_Sales.csv");
		file.transferSalesData("src\\S2_Sales.csv");
		file.transferSalesData("src\\S3_Sales.csv");



	
	
	}

}
