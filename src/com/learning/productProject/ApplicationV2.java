package com.learning.productProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationV2 {

	public static void main(String[] args) {
		
		 ArrayList<Laptop> lapInv = new ArrayList<Laptop>();
		 ArrayList<Table> tabInv = new ArrayList<Table>();
		 ArrayList<Light> ligInv = new ArrayList<Light>();
		 
		 String option;
		 String prod;
		 int prodInv = 0;

		 boolean stopp = false;
		 boolean prcd = false;
		 
		System.out.println("Welcome to Giga Walmart");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1. Do you want to add a product?");
		System.out.println("2. Do you want check the inventory?");
		System.out.println("3. Do you want to exit?");
		option = sc.nextLine();
		
		switch (option) {
		case "product": 
		
			System.out.println("Which product want to add?");
			Scanner scp = new Scanner(System.in);
			System.out.println("1. Laptop");
			System.out.println("2. Table");
			System.out.println("3. Light");
			
			prod = scp.nextLine();
			
			switch (prod) {
			
			case "laptop": // Laptop
	
						while (!prcd ) {
							
							System.out.println("Enter laptop ID:");
							int	id = sc.nextInt();
								sc.nextLine();   //Line needed to move to the next line because int has no next line

							System.out.println("Enter laptop name and model:");
							String	name  = sc.nextLine();
							
							System.out.println("Enter laptop price:");
							Double	price = sc.nextDouble();
								sc.nextLine();
								
							System.out.println("Enter Rating:");
							Double	rating = sc.nextDouble();
								sc .nextLine();

							System.out.println("Enter laptop CPU:");
							 String cpu = sc.nextLine();
							
							System.out.println("Enter laptop RAM Size:");
							int	ramSize = sc.nextInt();
								sc.nextLine();
							
							System.out.println("Enter laptop SSD Size:");
							int	ssdSize = sc.nextInt();
								sc.nextLine();   
								
							System.out.println("Enter laptop Screen Size:");
							Double	screenSize = sc.nextDouble();
								sc.nextLine();   
								
							Laptop laptop = new Laptop(id, name, price, id, cpu, ramSize, ssdSize, screenSize);
							
							lapInv.add(laptop);
							
							System.out.println(laptop.toString());
							
							System.out.println("Do you wish to stop?");
							prcd = sc.nextBoolean();
							sc.nextLine()	;						
						}
						break;
			
				// end of laptop
			case "table": // table
				while (	!prcd ) {
					
					System.out.println("Enter table ID:");
					int	id = sc.nextInt();
						sc.nextLine();   //Line needed to move to the next line because int has no next line

					System.out.println("Enter table name and model:");
					String	name  = sc.nextLine();
					
					System.out.println("Enter table price:");
					Double	price = sc.nextDouble();
						sc.nextLine();
						
					System.out.println("Enter rating:");
					Double	rating = sc.nextDouble();
						sc .nextLine();

					System.out.println("Enter table height:");
					int height = sc.nextInt();
					 	sc.nextLine();
					
					System.out.println("Enter table width:");
					int	width = sc.nextInt();
						sc.nextLine();
					
					System.out.println("Enter table length:");
					int	length = sc.nextInt();
						sc.nextLine();   
		
					Table table = new Table(id, name, price, rating, height, width,length );
					tabInv.add(table);
					System.out.println(table.toString());
					
					System.out.println("Do you wish to stop?");
					prcd = sc.nextBoolean();
					sc.nextLine()	;break;						
				}				
					
					// end of table
					
			case "light": // light
				while (	!prcd ) {
					
					System.out.println("Enter table ID:");
					int	id = sc.nextInt();
						sc.nextLine();   //Line needed to move to the next line because int has no next line

					System.out.println("Enter table name and model:");
					String	name  = sc.nextLine();
					
					System.out.println("Enter table price:");
					Double	price = sc.nextDouble();
						sc.nextLine();
						
					System.out.println("Enter rating:");
					Double	rating = sc.nextDouble();
						sc .nextLine();

					System.out.println("Enter table width:");
					int	watts = sc.nextInt();
						sc.nextLine();
					
					System.out.println("Enter table length:");
					int	lumens = sc.nextInt();
						sc.nextLine();   
		
					Light light = new Light(id, name, price, rating, watts, lumens );
						ligInv.add(light);
					
					System.out.println(light.toString());
									
					System.out.println("Do you wish to stop?");
					prcd = sc.nextBoolean();
					sc.nextLine()	;						
				}

					break;
					//end of light
			case "exit": 
				
				prcd = true;
				// exit to menu
				 
			} //end of  product switch
		
		 // end of case product
		case "inventory":
			
				System.out.println("1. Laptop inventory");
				System.out.println("2. Table inventory");
				System.out.println("3. Light inventory");
				
				switch(prodInv){
				case 1:  while (!prcd) {
					
					System.out.println("laptop");
					System.out.println(lapInv.toString());
					System.out.println("Do you wish to stop?");
					
					prcd = sc.nextBoolean();
					sc.nextLine();
								
				}
				
				case 2:  while (!prcd) {
					
					System.out.println("table");
					System.out.println(tabInv.toString());
					System.out.println("Do you wish to stop?");
					
					prcd = sc.nextBoolean();
					sc.nextLine();
			
				}
				
				case 3:  while (!prcd) {
					
					System.out.println("lighr");
					System.out.println(ligInv.toString());
					System.out.println("Do you wish to stop?");
					
					prcd = sc.nextBoolean();
					sc.nextLine();				
				}
	
						} 
							
		case "exit": 
			System.out.println("Exit");
		break;// end of case 3
		
	
		}

}
			
		
		
		

	}

