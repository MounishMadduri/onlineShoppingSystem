package onlineShopping;

import java.util.ArrayList;

public class Customer extends User{
	public Customer(int id, String username, String password) {
		super(id, username, password);
	}

	private ArrayList<String> shoppingList = new ArrayList<>();
	public void addItem(int id, String name, int price) {
		Product p1 = new Product(id, name, price);
		shoppingList.add(p1.productInfo());
		System.out.println("item added: "+p1.productInfo());
	}
	public void removeItem(int id) {
		for(int i = 0; i<shoppingList.size();i++) {
			if (shoppingList.get(i).contains((Integer.toString(id)))) {
				shoppingList.remove(i);
			}
		}
	}
	public ArrayList<String> getShoppingList(){
		return shoppingList;
	}

}
