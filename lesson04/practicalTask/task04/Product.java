package lesson04.practicalTask.task04;

import java.util.Comparator;

public class Product {

	private String name;
	private double price;
	private double quantity;

	public Product() {

	}

	public Product(String name, double price, double quantity) {

		this.name = name;
		this.price = price;
		this.quantity = quantity;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public static Comparator<Product> ProductPrice = new Comparator<Product>() {
		public int compare(Product p1, Product p2) {
			int price1 = (int) p1.getPrice();
			int price2 = (int) p2.getPrice();

			return price2 - price1;
		}
	};

	public static Comparator<Product> ProductQuantity = new Comparator<Product>() {
		public int compare(Product q1, Product q2) {
			int quantity1 = (int) q1.getQuantity();
			int quantity2 = (int) q2.getQuantity();
			return quantity2 - quantity1;
		}
	};

	public static Comparator<Product> ProductNameComparator = new Comparator<Product>() {

		public int compare(Product n1, Product n2) {
			String productName1 = n1.getName().toUpperCase();
			String productName2 = n2.getName().toUpperCase();
			return productName1.compareTo(productName2);

		}
	};

	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}

}
