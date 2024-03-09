package com.learning.productProject;

public class InventoryPlayground {
	
	public static void main(String[] args) {
		//Owe input
		// Object Creation test
		
		//                laptop =  id      name        price    rating      cpu               ram size ssd size screen size;
		Laptop laptop1 = new Laptop(12, "Lenovo Legion", 1499.99, 4.5,  "Intel Core i9-14900HX", 32,     1000,       17.8);
		Laptop laptop2 = new Laptop(12, "Lenovo Legion", 1499.99, 4.5,  "Intel Core i9-14900HX", 32,     1000,       17.8);
		
		//               table = id          name          price  rating, height, width, length
		Table table1 = new Table(33, "Ikea LeDream table", 199.99, 3.7,     48,      2,    72);
		Table table2 = new Table(33, "Ikea LeDream table", 199.99, 3.7,     48,      2,    72);

		//              light =  id     name              price rating watts lumens
		Light light1 = new Light(5, "Sylvannia 535 bulb", 8.99,  4.8,    5,   1500);
		Light light2 = new Light(5, "Sylvannia 535 bulb", 8.99,  4.8,    5,   1500);
		
		//Print object with toString()
		
		System.out.println(laptop1.toString());
		System.out.println(laptop2.toString());
		
		System.out.println(table1.toString());
		System.out.println(table2.toString());
		
		System.out.println(light1.toString());
		System.out.println(light2.toString());
		
		//Print equals()
		
		System.out.println(laptop1.equals(laptop2));
		System.out.println(table1.equals(table2));
		System.out.println(light1.equals(light2));
		
	}

}
