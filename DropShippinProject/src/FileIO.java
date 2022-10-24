import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
	
	
	public static void transferCustomerData(String CSVFile) throws FileNotFoundException {
		String line = "";  
		String splitBy = ",";  
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
			String a = br.readLine(); //dead variable for skip the headers deal with it later
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
			System.out.println(product);
			
			supplier.setProducts(product);
			System.out.println(supplier);
			
			

			
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
				while ((line = br.readLine()) != null)   
				{ 
				Sales sales = new Sales();
				String[] rows = line.split(splitBy); 
				sales.setID(Integer.parseInt(rows[0]));
				sales.setCustomer(rows[1]);
				sales.setProduct(rows[2]);
				sales.setSalesDate(rows[3]);
				salesManagement.setSales(sales);
				System.out.println(sales);
				salesIndex++;
				salesManagement.setSalesIndex(salesIndex);
				System.out.println(salesManagement.toString());

				
				}
				supplierIndex++;

				salesManagement.setSupplierIndex(supplierIndex);
				}   
				catch (IOException e)   
				{  
				e.printStackTrace();  }
				
		}
			
			
	}
