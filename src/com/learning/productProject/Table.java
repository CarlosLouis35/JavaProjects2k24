package com.learning.productProject;



public class Table extends Product{
	
	double height;
	double width;
	double length;
	
	// Table Constructor
	
public Table(int id, String name, double price, double rating, double height, double width, double length){
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.height = height;
		this.width = width;
		this.length = length;
	
	//Table Methods	
		
	}
	
	public void tableArea() {
		
	}
	
	public void tableVolume() {
		
	}
	
	//Table overriding
	
	@Override
	public String toString() {
		return this.id + " " + this.name  + " " + this.price + " " + this.height+ " " + 
	      this.width + " " + this.length;
			}
	
	//Table Equals
	public boolean equals(Table table) {
		return (table.id == this.id) && (table.length == this.length) && (table.height == this.height)
				&& (table.width == this.width);	
			}
	
	//Setters and getters
	
	// ***Getters

	 public double getHeight() {
		    return height;
		  }
	 public double getWidth() {
		    return width;
		  }
	 public double getLength() {
		    return length;
		  }
	
	// **Setters
	   
	  public void setHeight(double newHeight) {
		    this.height = newHeight;
		  }
	  public void setWidth(double newWidth) {
		    this.width = newWidth;
		  }
	  public void setLength(double newLength) {
		    this.length = newLength;
		  }
	
}
