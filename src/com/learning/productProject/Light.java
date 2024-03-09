package com.learning.productProject;

public class Light extends Product {
	
	int watts;
	int lumens;
	
	// Light Constructor
public Light(int id, String name, double price, double rating,int watts, int lumens){
		
		this.id = id;
		this.name = name;
		this.price = price;
		this.rating = rating;
		this.watts = watts;
		this.lumens = lumens;	
			}

	// Light Methods
	public void noOfAmps() {
		
		
		}
	
	public void checkPowerUtil() {
		
		
		}
	
	// Light Overriding
	
	@Override
	public String toString() {
		return this.id + " " + this.name  + " " + this.price + " " + this.watts+ " " + 
	      this.lumens;
		}
	
	
	// Light Equals
	public boolean equals(Light light) {
		return (light.id == this.id) && (light.watts == this.watts) && (light.lumens == this.lumens);
		
		}
	
	//Getters and Setters
	// ***Getters
	
		 public double getWatts() {
			    return watts;
			  }
		 public double getWidth() {
			    return lumens;
			  }
		
		// **Setters
		   
		  public void setWatts(int newWatts) {
			    this.watts = newWatts;
			  }
		  public void setLumens(int newLumens) {
			    this.lumens = newLumens;
			  }

		
	
	
	
	
	
	
	
	
	
	
	
	
	
}
