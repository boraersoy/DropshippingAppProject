
public class Supplier {
	private int initialCapacity = 50;
	private Product[] Products = new Product[initialCapacity];
	private int arrayIndex = 0;
	public int productArrayIndex = 0;

	public Supplier(Product[] products) {
		Products = products;
	}

	public Supplier() {
		// TODO Auto-generated constructor stub
	}

	public Product getProducts() {
		productArrayIndex++;
		return Products[productArrayIndex ];
	}

	public void setProducts(Product products) {
		Products[arrayIndex + 1 ] = products;
		arrayIndex++;
	}

	@Override
	public String toString() {
		return "Supplier [Products=" + Products[arrayIndex] + "]";
	}
	public void setArrayIndex(int index) {
		arrayIndex = index;
	}
	
	public int getArrayIndex() {
		return arrayIndex;
	}
}
