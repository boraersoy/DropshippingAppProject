
public class SalesQuery {
	
	
	public static double getMostProfitableProduct(Sales[][] sales, Product[] product) 
	{	
		double mostProfitable = 0;
		for (int i = 0; i < 3 ; i++) {
			for (int k = 0; k < sales[i].length; k++ ) // 
				if (sales[i][k].getSalesPrice() - product[k + 1].getPrice() > mostProfitable) {
					mostProfitable = sales[i][k + 1].getSalesPrice() - product[k + 1].getPrice();
				}
			
		}
		return mostProfitable;

		
		
		
		
	}
	
}
