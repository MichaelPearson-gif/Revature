package com.app;

public class Flight implements Comparable<Flight>{

	// fields: Id, name, ManufactureName, Cost, rating, availability
	private int id;
	private String name;
	private String ManufactureName;
	private double cost;
	private float rating;
	private boolean availability;
	
	public Flight() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Flight(int id, String name, String manufactureName, double cost, float rating, boolean availability) {
		super();
		this.id = id;
		this.name = name;
		ManufactureName = manufactureName;
		this.cost = cost;
		this.rating = rating;
		this.availability = availability;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufactureName() {
		return ManufactureName;
	}

	public void setManufactureName(String manufactureName) {
		ManufactureName = manufactureName;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public boolean isAvailability() {
		return availability;
	}

	public void setAvailability(boolean availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", ManufactureName=" + ManufactureName + ", cost=" + cost
				+ ", rating=" + rating + ", availability=" + availability + "]";
	}

	@Override
	public int compareTo(Flight o) {
		Integer id1 = this.id;
		Integer id2 = o.id;
		return id1.compareTo(id2);
	}
	
	
	
}
