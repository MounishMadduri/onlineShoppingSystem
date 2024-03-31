package onlineShopping;

public class Main {

	public static void main(String[] args) {
		Customer mounish = new Customer(1, "mounish", "Gprec$123");
		mounish.addItem(100, "titan", 3000);
		System.out.println(mounish.getShoppingList());
		mounish.addItem(101, "Nike", 4000);
		System.out.println(mounish.getShoppingList());
		mounish.removeItem(101);
		System.out.println(mounish.getShoppingList());
	}

}
