package eg1;

public class Product {
	
	private int id;
	private String name;
	private double price;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public void printProduct() {
		System.out.println("Id = " + id);
		System.out.println("Name = " + name);
		System.out.println("Price = " + price);
	}
	
	public void setID(int id) {
		this.id = id;
	}
	public int getID() {
		return id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getPrice() {
		return price;
	}

}
