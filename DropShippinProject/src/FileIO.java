import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class FileIO {
	public static Product[] salesPriceArray = new Product[100];
	public static Product[] products = new Product[150];
	public static  int productArrayCount = 0;
	public static int salesArrayCount = 0;
	public static Sales[][] salesArray = new Sales[3][50];
	private static int salesSupplierCount;
	private static int index = 0;
	private static int salesIndex1 = 0;
	public static Customer[] CustomerArray = new Customer[20];
	public static void transferCustomerData(String CSVFile) throws FileNotFoundException {
		String line = "";  
		String splitBy = ","; 
		int i = 0;
		try   
		{  
		BufferedReader br = new BufferedReader(new FileReader(CSVFile));
		String a = br.readLine(); //dead variable for skip the headers deal with it later
		while ((line = br.readLine()) != null)   
		{ 
		Customer customer = new Customer();
		String[] rows = line.split(splitBy); 
		customer.setID(rows[0]);
		customer.setName(rows[1]);
		customer.setEmail(rows[2]);
		customer.setCountry(rows[3]);
		customer.setAddress(rows[4]);
		CustomerArray[i] = customer;
		i++;
		System.out.println(customer);

		
		}  
		}   
		catch (IOException e)   
		{  
		e.printStackTrace();
		}  
}
		public static void transferProductData(String CSVFile) throws FileNotFoundException {
			String line = "";  
			String splitBy = ",";  
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
			product.setSalesPrice(calcSalesPrice(product));
			salesPriceArray[index] = product; //buraya variable atamak lazım
			
			index++; // bu arrayi file io fieldı yapıcan sonra salese atıcan
			System.out.println(product);
			
			supplier.setProducts(product);
			System.out.println(supplier);
			
			

			
			}
	
			for (int i = 0; i < supplier.getArrayIndex()  ; i++) {
				products[productArrayCount] = supplier.getProducts();
				productArrayCount++;
			}
			supplier.setArrayIndex(0);
			} 
			
			catch (IOException e)   
			{  
			e.printStackTrace();  }
			
			
	}
			public static void transferSalesData(String CSVFile) throws FileNotFoundException {
				String line = "";  
				String splitBy = ",";  
				try   
				{  
				BufferedReader br = new BufferedReader(new FileReader(CSVFile));
				br.readLine();//dead variable for skip the headers deal with it later
				SalesManagement salesManagement = new SalesManagement();
				int salesIndex = 0;
				int supplierIndex = 0;
				int i = 0;
				while ((line = br.readLine()) != null)   
				{ 
				Sales sales = new Sales();
				String[] rows = line.split(splitBy); 
				sales.setID(rows[0]);
				sales.setCustomer(rows[1]);
				sales.setProduct(rows[2]);
				sales.setSalesDate(rows[3]);
				sales.setSalesPrice(linearProductSearch(products, sales.getProduct()));
//				sales.setSalesPrice(salesPriceArray[salesIndex1]);
				salesManagement.setSales(sales);
				System.out.println(sales);
				salesManagement.setSalesIndex(salesIndex);
				System.out.println(salesManagement.toString());
				salesArray[salesSupplierCount][salesIndex] = salesManagement.getSales();
				salesIndex++;
				salesIndex1++;
				
				}
				supplierIndex++;

				
				
				
				
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
	        return -1;
	    }  
}	
			
		
