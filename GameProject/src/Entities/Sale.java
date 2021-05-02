package Entities;

import Abstract.Entity;

public class Sale implements Entity {
	private int id;
	private double salePrice;
	
	public Sale(int id, double salePrice) {
		super();
		this.id = id;
		this.salePrice = salePrice;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCampaginName() {
		return salePrice;
	}

	public void setCampaginName(double salePrice) {
		this.salePrice = salePrice;
	}

}
