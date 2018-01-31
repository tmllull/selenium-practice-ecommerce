package domain;

public class PurchaseItem {
	
	private String productName;
	private int productQuantity;
	
	public PurchaseItem(String name, int quantity) {
		productName=name;
		productQuantity=quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	

}
