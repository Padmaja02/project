

import java.io.Serializable;

public class Customer implements Serializable {
/**
	 * 
	 */
private static final long serialVersionUID = 1L;
private int customerNo;
private String customerName;
private String address;
private String itemPurchased;
private int itemId;
public String getCustomerName() {
	return customerName;
}
public void setCustomerName(String customerName) {
	this.customerName = customerName;
}
public int getCustomerNo() {
	return customerNo;
}
public void setCustomerNo(int customerNo) {
	this.customerNo = customerNo;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getItemPurchased() {
	return itemPurchased;
}
public void setItemPurchased(String itemPurchased) {
	this.itemPurchased = itemPurchased;
}
public int getItemId() {
	return itemId;
}
public void setItemId(int itemId) {
	this.itemId = itemId;
}
public static long getSerialversionuid() {
	return serialVersionUID;
}

}
