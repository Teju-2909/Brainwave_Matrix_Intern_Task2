package hello;


public class InventoryItem {
	 private String itemName;
	 private String itemCode;
	 private int quantity;
	 private double price;

    public InventoryItem(String itemName, String itemCode, int quantity, double price) {
        this.itemName = itemName;
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.price = price;
    }
    
    public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemCode() {
		return itemCode;
	}

	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void displayItem() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Item Code: " + itemCode);
        System.out.println("Quantity: " + quantity);
        System.out.println("Price: " + price);
        System.out.println("------");
    }

    
}
