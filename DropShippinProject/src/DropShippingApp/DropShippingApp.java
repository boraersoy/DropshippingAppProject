package DropShippingApp;
import java.io.FileNotFoundException;
import java.util.Arrays;

import DropShipping.Customer;
import DropShipping.Product;
import DropShipping.Sales;
import DropShipping.SalesQuery;
import FileAccess.FileIO;

public class DropShippingApp {

	public static void main(String[] args) throws FileNotFoundException {
		FileIO file = new FileIO();
		//reading csv files
		FileIO.transferCustomerData("src\\Customers.csv");
		FileIO.transferProductData("src\\S1_Products.csv");
		FileIO.transferProductData("src\\S2_Products.csv");
		FileIO.transferProductData("src\\S3_Products.csv");
		FileIO.transferSalesData("src\\S1_Sales.csv");
		FileIO.transferSalesData("src\\S2_Sales.csv");
		FileIO.transferSalesData("src\\S3_Sales.csv");
		//copying object arrays
		Sales[][] sales = FileIO.getSalesArray();
		Product[] products = FileIO.getProducts();
		Customer[] customers = FileIO.getCustomerArray();		
		SalesQuery.getMostProfitableProduct(sales, products);
		SalesQuery.getMostExpensive(sales, products);
		SalesQuery.getTheCustomerWhoPurchasedMostProducts(sales, customers);
		SalesQuery.totalProfitMadeFromAllSales(sales, products);
		SalesQuery.getTheLeastProfitableSale(sales, products);		
		SalesQuery.convertTo1D(sales);
	}
}
