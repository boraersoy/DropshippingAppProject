
public class SalesQuery {
	
	
	public static void getMostProfitableProduct(Sales[][] sales, Product[] product) 
	{	
		String productName = null;
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
					 productName = linearProductSearch1(product,
							sales[i][k].getProduct()).getTitle();

				}
			
		}
			
			}
		System.out.println("most profitable product is " + productName + " " +  mostProfitable);
		

		
		
		
		
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
		String productName = null;
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < salesArray[i].length; k++) {
				if (salesArray[i][k] == null) {
					break;
				}
				else if (salesArray[i][k].getSalesPrice() > mostExpensive)
				{
					mostExpensive = salesArray[i][k].getSalesPrice();
					productName = linearProductSearch1(products, salesArray[i][k].getProduct()).getTitle();
				}
	}
		}
		System.out.println("most expensive product is " + productName + " " + mostExpensive);
	
	}
	public static void getTheCustomerWhoPurchasedMostProducts(Sales[][] salesArray)
	{
		String[] customerArray = new String[100];
		int z = 0;
		int count = 0;
		int[] CountArray = new int[100];
		Customer[] richestCustomer = new Customer[50];
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < salesArray[i].length; k++) {
				if (salesArray[i][k] == null) {
					break;
				}
				else if (!linearSearch(salesArray[i][k].getCustomer(), customerArray)) {
					customerArray[z] = salesArray[i][k].getCustomer();
					CountArray[z] = count;
					count = 0;
					//getCustomer somehow
					
					
				}
				else if (linearSearch(salesArray[i][k].getCustomer(), customerArray)) {
					count++;
				}
	}
}
		}
	
		public static boolean linearSearch(String sales, String[] stringArray) {
			for (String element : stringArray) {
			    if (element.equals(sales)) {
			        return true;
			    }
			}
			return false;
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
//				System.out.println(profit);
				}
	}
}
		System.out.println("total profit is " + profit);

		}			
	
	
	public static void getTheLeastProfitableSale(Sales[][] salesArray, Product[] productArray) 
	{
		String productName = null;
		double leastProfitable = salesArray[0][0].getSalesPrice() - linearProductSearch1(productArray,
				salesArray[0][0].getProduct()).getPrice();
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < salesArray[i].length; k++) {
				if (salesArray[i][k] == null) {
					break;
				}
				else if (salesArray[i][k].getSalesPrice() - linearProductSearch1(productArray,
						salesArray[i][k ].getProduct()).getPrice() < leastProfitable)
				{
					leastProfitable = salesArray[i][k].getSalesPrice() -
							linearProductSearch1(productArray,
							salesArray[i][k].getProduct()).getPrice();
					 productName = linearProductSearch1(productArray,
							salesArray[i][k].getProduct()).getTitle();
					
				}
			
		}
			
			}
		System.out.println("least profitable product is " + productName + " " +  leastProfitable);
		
	}
	public static Customer linearCustomerSearch1(Customer[] CustomerArray, String salesID){    
        for(int i=0;i<38;i++){    
            if(CustomerArray[i].getID().equals(salesID)){
                return CustomerArray[i];    
            }    
        }    
        return null;
    }
	}