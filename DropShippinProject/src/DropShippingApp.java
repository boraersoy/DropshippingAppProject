import java.io.FileNotFoundException;
import java.util.Arrays;

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
		
		Sales[][] sales = file.salesArray;
		Product[] products = file.products;
		System.out.println(Arrays.toString(sales[2])); // her fonksiyon execute 
//		olduğunda array yeniledni o yüzden 01liler kaldı düzeltilmeli
		
////		double mostProfitable = SalesQuery.getMostProfitableProduct(file.salesArray, file.products);
////		System.out.println(file.products);
////		for (int i = 0; i< file.products.length; i++) {
////			System.out.println(file.products[i].getPrice());
//		}


	
	
	}

}
