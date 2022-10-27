
public class SalesManagement {
	private final int  numberOfSuppliers = 3;
	private final int maxCapacity = 50;
	private int SupplierIndex = 0;
	private int SalesIndex = 0;
	private Sales[][] Sales = new Sales[numberOfSuppliers][maxCapacity];
	
	
	private int supplierIndex = 0;
	private int salesIndex = 0;
	public Sales getSales() {
		
		return Sales[SupplierIndex][SalesIndex];
	}
	public void setSales(Sales sales) {
		Sales[SupplierIndex][SalesIndex] = sales;
		
	}
	public int getSupplierIndex() {
		return supplierIndex;
	}
	public void setSupplierIndex(int supplierIndex) {
		this.supplierIndex = supplierIndex;
	}
	public int getSalesIndex() {
		return salesIndex;
	}
	public void setSalesIndex(int salesIndex) {
		this.salesIndex = salesIndex;
	}
	
	@Override
	public String toString() {
		return "SalesManagement [Sales=" + Sales[supplierIndex][SalesIndex] + "]";
	}
	
}
