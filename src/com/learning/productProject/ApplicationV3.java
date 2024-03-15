package com.learning.productProject;

import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationV3 {

  public static void main(String[] args) {

    ArrayList<Laptop> lapInv = new ArrayList<Laptop>();
    ArrayList<Table> tabInv = new ArrayList<Table>();
    ArrayList<Light> ligInv = new ArrayList<Light>();

    String option;
    String prod;
    boolean prcd = false;

    System.out.println("Welcome to Giga Walmart");

    Scanner sc = new Scanner(System.in);
    do {
      System.out.println("1. Do you want to add a product?");
      System.out.println("2. Do you want check the inventory?");
      System.out.println("3. Do you want to exit?");
      option = sc.nextLine();

      switch (option) {
        case "product": // Add product

          System.out.println("Which product want to add?");
          Scanner scp = new Scanner(System.in);
          System.out.println("1. Laptop");
          System.out.println("2. Table");
          System.out.println("3. Light");

          prod = scp.nextLine();

          switch (prod) {

            case "laptop": // Laptop
              while (!prcd) {
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
                System.out.println("Do you wish to stop adding laptops?");
                prcd = sc.nextBoolean();
                sc.nextLine();
              }
              prcd = false; // Reset prcd  despues de agregar laptop
              break;

            case "table": // table
              while (!prcd) {
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
					
                System.out.println("Do you wish to stop adding tables?");
                prcd = sc.nextBoolean();
                sc.nextLine();
              }
              prcd = false; // Reset prcd flag after adding tables
              break;

            case "light": // light
              while (!prcd) {
                // ... (your product input code)
                System.out.println("Do you wish to stop adding lights?");
                prcd = sc.nextBoolean();
                sc.nextLine();
              }
              prcd = false; // Reset prcd flag after adding lights
              break;
          }
          break;

        case "inventory": // Check inventory
          System.out.println("1. Laptop inventory");
          System.out.println("2. Table inventory");
          System.out.println("3. Light inventory");
          String invChoice = sc.nextLine();

          switch (invChoice) {
            case "1":
              System.out.println("Laptop inventory:");
              System.out.println(lapInv.toString());
              break;
            case "2":
              System.out.println("Table inventory:");
              System.out.println(tabInv.toString());
              break;
            case "3":
              System.out.println("Light inventory:");
              System.out.println(ligInv.toString());
              break;
          }
          System.out.println("Do you wish to stop checking inventory?");
          prcd = sc.nextBoolean();
          sc.nextLine();
          break;

        case "exit": // Exit
          System.out.println("Exit");
          break;
      }
    } while (!option.equalsIgnoreCase("exit")); // Mientras no use exit no va a parar el loop
    sc.close();
  }
}