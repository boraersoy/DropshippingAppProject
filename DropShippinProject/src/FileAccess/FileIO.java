package FileAccess;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import DropShipping.Customer;
import DropShipping.Product;
import DropShipping.Sales;
import DropShipping.SalesManagement;
import DropShipping.Supplier;
public class FileIO {
	private static Product[] salesPriceArray = new Product[100];
	private static Product[] products = new Product[150];
	private static  int productArrayCount = 0;  //fields for counters
	private static Sales[][] salesArray = new Sales[3][50];
	private static int salesSupplierCount;
	private static int index = 0;
	private static Customer[] CustomerArray = new Customer[20];
	private static String line = "";  
	private static String splitBy = ","; 
	public static void transferCustomerData(String CSVFile) throws FileNotFoundException {
		int i = 0;
		try   
		{  
		BufferedReader br = new BufferedReader(new FileReader(CSVFile));
		br.readLine(); // skipping the header
		while ((line = br.readLine()) != null)   
		{ 
		Customer customer = new Customer();
		String[] rows = line.split(splitBy); 
		customer.setID(rows[0]);
		customer.setName(rows[1]);
		customer.setEmail(rows[2]);
		customer.setCountry(rows[3]);
		customer.setAddress(rows[4]);
		getCustomerArray()[i] = customer;
		i++;		
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();
		}  
}
		public static void transferProductData(String CSVFile) throws FileNotFoundException {
			try   
			{  
			BufferedReader br = new BufferedReader(new FileReader(CSVFile));
			br.readLine(); //dead variable for skip the headers deal with it later
			Supplier supplier = new Supplier();
			while ((line = br.readLine()) != null)   
			{ 
			Product product = new Product();
			String[] rows = line.split(splitBy); 
			product.setID(rows[0]);
			product.setTitle(rows[1]);
			product.setRate(Double.parseDouble(rows[2]));
			product.setNumberofReviews(Integer.parseInt(rows[3]));
			product.setPrice(Integer.parseInt(rows[4]));
			salesPriceArray[index] = product; 
			index++; 
			supplier.setProducts(product);
			}
	
			for (int i = 0; i < supplier.getArrayIndex()  ; i++) {
				getProducts()[productArrayCount] = supplier.getProducts();
				productArrayCount++;
			}
			supplier.setArrayIndex(0);
			} 
			
			catch (IOException e)   
			{  
			e.printStackTrace();  }
	}
			public static void transferSalesData(String CSVFile) throws FileNotFoundException { 
				try   
				{  
				BufferedReader br = new BufferedReader(new FileReader(CSVFile));
				br.readLine();
				SalesManagement salesManagement = new SalesManagement();
				int salesIndex = 0;
				int i = 0;
				while ((line = br.readLine()) != null)   
				{ 
				Sales sales = new Sales();
				String[] rows = line.split(splitBy); 
				sales.setID(rows[0]);
				sales.setCustomer(rows[1]);
				sales.setProduct(rows[2]);
				sales.setSalesDate(rows[3]);
				sales.setSalesPrice(linearProductSearch(getProducts(), sales.getProduct()));
				salesManagement.setSales(sales);
				salesManagement.setSalesIndex(salesIndex);
				getSalesArray()[salesSupplierCount][salesIndex] = salesManagement.getSales();
				salesIndex++;				
				}
				salesSupplierCount++;
				}
				catch (IOException e)   
				{  
				e.printStackTrace();  }					
				}
		public static double calcSalesPrice(Product product
				) {
				double salesPrice = (product.getPrice() + product.getRate()/5 * 100 * product.getNumberofReviews());
				
				return salesPrice;			
		}
		//searchs productid and calculates salesprice with product's fields
		public static void searchProductId(Product productObject, Sales salesObject) {
			
			if(salesObject.getID().equals(productObject.getID()))
			{
				salesObject.setSalesPrice(calcSalesPrice(productObject));
			}
		}
		public static double linearProductSearch(Product[] productArray, String salesID){    
	        for(int i=0;i<38;i++){    
	            if(productArray[i].getID().equals(salesID)){
	                return calcSalesPrice(productArray[i]);    
	            }    
	        }    
	        return -1; //this function is also used to calculate salesPrice
	    }
		public static Sales[][] getSalesArray() {
			return salesArray;
		}
		public static void setSalesArray(Sales[][] salesArray) {
			FileIO.salesArray = salesArray;
		}
		public static Product[] getProducts() {
			return products;
		}
		public static void setProducts(Product[] products) {
			FileIO.products = products;
		}
		public static Customer[] getCustomerArray() {
			return CustomerArray;
		}
		public static void setCustomerArray(Customer[] customerArray) {
			CustomerArray = customerArray;
		}  
}	
			
		
