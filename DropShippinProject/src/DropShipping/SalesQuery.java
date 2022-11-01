package DropShipping;

public class SalesQuery {
	
	
	public static void getMostProfitableProduct(Sales[][] sales, Product[] product) 
	{	
		Product theChosenProduct = null;
		double mostProfitable = 0;
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < sales[i].length; k++) {
				if (sales[i][k] == null) {

					break;
				}
				
				else if (sales[i][k].getSalesPrice() - linearProductSearch1(product,
						sales[i][k].getProduct()).getPrice() > mostProfitable)
				{
					mostProfitable = sales[i][k].getSalesPrice() - linearProductSearch1(product,
							sales[i][k].getProduct()).getPrice();
					theChosenProduct = linearProductSearch1(product,
							sales[i][k].getProduct());					
				}
		}
			
			}
		System.out.println("1) " +
			theChosenProduct + " --->" +  mostProfitable);		
	}
	public static Product linearProductSearch1(Product[] productArray, String salesID){    
        for(int i=0;i<38;i++){    
            if(productArray[i].getID().equals(salesID)){
                return productArray[i];    
            }    
        }    
        return null;
    }
	public static void getMostExpensive(Sales[][] salesArray, Product[] products)
	{
		double mostExpensive = 0;
		Product productName = null;
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < salesArray[i].length; k++) {
				if (salesArray[i][k] == null) {
					break;
				}
				else if (salesArray[i][k].getSalesPrice() > mostExpensive)
				{
					mostExpensive = salesArray[i][k].getSalesPrice();
					productName = linearProductSearch1(products, salesArray[i][k].getProduct());
				}
	}
		}
		System.out.println("2) " + productName + " -->" + mostExpensive);
	
	}
	public static void getTheCustomerWhoPurchasedMostProducts(Sales[][] salesArray, Customer[] customers)
	{
		Sales[] sales1d = new Sales[100];
		sales1d = convertTo1D(salesArray);
		Customer CustomerWhoBoughtMost = linearCustomerSearch1(customers,getMostSaledElement(sales1d).getCustomer());
		int count = linearSalesIDSearch(sales1d, CustomerWhoBoughtMost);
		System.out.println("3) " + CustomerWhoBoughtMost + " ---> " + count + " items"); 
	}
	public static void totalProfitMadeFromAllSales(Sales[][] salesArray, Product[] productArray)
	{	
		double profit = 0;
		
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < salesArray[i].length; k++) {
				if (salesArray[i][k] == null) {
					break;
				}
				else {
				profit += salesArray[i][k].getSalesPrice() - linearProductSearch1(productArray,
						salesArray[i][k].getProduct()).getPrice();
				}
	}
}
		System.out.println("4) " + profit);

		}			
	public static void getTheLeastProfitableSale(Sales[][] salesArray, Product[] productArray) 
	{
		Product productName = null;
		double leastProfitable = salesArray[0][0].getSalesPrice() - linearProductSearch1(productArray,
				salesArray[0][0].getProduct()).getPrice();
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < salesArray[i].length; k++) {
				if (salesArray[i][k] == null) {
					break;
				}
				else if (salesArray[i][k].getSalesPrice() - linearProductSearch1(productArray,
						salesArray[i][k].getProduct()).getPrice() < leastProfitable)
				{
					leastProfitable = salesArray[i][k].getSalesPrice() -
							linearProductSearch1(productArray,
							salesArray[i][k].getProduct()).getPrice();
					 productName = linearProductSearch1(productArray,
							salesArray[i][k].getProduct());
				}
			
		}
			
			}
		System.out.println("5) " + productName + " -->" +  leastProfitable);
		
	}
	public static int linearSalesIDSearch(Sales[] sales, Customer customer)
	{
		int count = 0;
		for (int i = 0; i <sales.length; i++) {
			if (sales[i] == null) {
				break;
			}
			else if (sales[i].getCustomer().equals(customer.getID())) {
				count++;
			}
		}
		return count;
	}
	public static Customer linearCustomerSearch1(Customer[] CustomerArray, String salesID){    
        for(int i=0;i<20;i++){    
            if(CustomerArray[i].getID().equals(salesID)){
                return CustomerArray[i];    
            }    
        }    
        return null;
    }
	public static Sales getMostSaledElement(Sales[] sales)
	{
	  int count = 1, tempCount;
	  Sales popular = sales[0];
	  Sales temp = null; //check
	  for (int i = 0; i < (sales.length - 1); i++)
	  {
		  if (sales[i] == null) {
				break;
			}
		  
	    temp = sales[i];
	    tempCount = 0;
	    for (int j = 1; j < sales.length; j++)
	    {
	    	if(sales[j] == null) {
	    		break;
	    	}
	    	else if (temp == sales[j])
	        tempCount++;
	    }
	    if (tempCount > count)
	    {
	      popular = temp;
	      count = tempCount;  
	    }
	  }
	  return popular;
	}
	public static Sales[] convertTo1D(Sales[][] sales)
	{	int z = 0;
		Sales[] salesArray = new Sales[100];
		for (int i = 0; i < 3; i++) {
			for (int k = 0; k < sales[i].length; k++) {
				if (sales[i][k] == null) {
					break;
				}
				else {
				salesArray[z] = sales[i][k];
				z++;}
			}
		}
		return salesArray;
	}
	}