package com.example.assigment.exception;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) throws PurchaseLimitExceed {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the number of items you want to add in the list : ");
		int count=sc.nextInt();
		Item[] item = new Item[count];
		for( int i=0;i<count;i++) {
			System.out.println("Item-"+(i+1)+"  :: ");
			System.out.println("enter the item name: ");
			String name = sc.next();
			System.out.println("enter the item price: ");
			double price= sc.nextDouble();
			System.out.println("enter the item maximum limit: ");
			int max= sc.nextInt();
			if(price<=0 || max<=0) {
				throw new PurchaseLimitExceed("Item price or maximum limit cannot be 0 or less");
			}
			item[i] = new Item(name, price, max,null);
		}
		
		for(int i=0;i<count;i++) {
			System.out.println(item[i].getCategory());
		}
		
		System.out.println("Enter the number of items you want to buy: ");
		int items = sc.nextInt();
		if(items>count) {
			throw new PurchaseLimitExceed("Selected more number than the available items list");
		}
		
		ItemBought[] itemBought = new ItemBought[items];
		
		for(int i=0;i<items;i++) {
			System.out.println("Enter the item id from the above items list: ");
	        int itemid = sc.nextInt();
	        System.out.println("Enter the quantity:");
	        int quantity = sc.nextInt();
	        itemBought[i] = new ItemBought(itemid, quantity);
		}
		double totalBill=0;
		for(ItemBought ib: itemBought) {
			for(int i=0;i<item.length;i++) {
				if(ib.getItemid()==item[i].getCategory().catid) {
					if(ib.itemquantity>item[i].getMaximumNumberOfItem()) {
						throw new PurchaseLimitExceed("quantity is more than maximum limit of item");
					}else {
					System.out.println(item[i].getItemName()+", price:"+item[i].getPrice()+", quantity bought:"+ib.itemquantity);
					totalBill =totalBill + (ib.itemquantity*item[i].getPrice());
				}
				}
			}
		}
		System.out.println("Total bill: "+totalBill);
	}
	}


class Category {

	Integer catid;
	private String categoryname;
	static int count = 1;

	Category(String categoryname) {
		this.catid = count++;
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "Item Number=" + catid + ", Item Name=" + categoryname;
	}

}

class Item {

	private String itemName;
	private double price;
	private Integer maximumNumberOfItem;
	Category category;
	public Item(String itemName, double price, Integer maximumNumberOfItem, Category category) {
		super();
		this.itemName = itemName;
		this.price = price;
		this.maximumNumberOfItem = maximumNumberOfItem;
		this.category = category;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Integer getMaximumNumberOfItem() {
		return maximumNumberOfItem;
	}
	public void setMaximumNumberOfItem(Integer maximumNumberOfItem) {
		this.maximumNumberOfItem = maximumNumberOfItem;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", price=" + price + ", maximumNumberOfItem=" + maximumNumberOfItem
				+ ", category=" + category + "]";
	}	
}


class ItemBought {
	private Integer itemid;
	Integer itemquantity;
	public ItemBought(Integer itemid, Integer itemquantity) {
		super();
		this.setItemid(itemid);
		this.itemquantity = itemquantity;
	}
	public Integer getItemid() {
		return itemid;
	}
	public void setItemid(Integer itemid) {
		this.itemid = itemid;
	}	
}

class PurchaseLimitExceed extends Exception{
	private static final long serialVersionUID = 1L;

	public ItemPurchaseLimitExceed(String s) {
		super(s);
	}
}

