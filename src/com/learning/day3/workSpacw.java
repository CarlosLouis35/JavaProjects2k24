package com.learning.day3;

public class workSpacw {

	public static void main(String[] args) {
	
		
		Car volvo = new Car();
		volvo.name =  "Volvo";
		volvo.color = "gray";
		volvo.model = "V60";
		volvo.mfgYear = 2020;
		volvo.milleage = 30000;
		
		volvo.drive();
		volvo.stop();
		
		System.out.println(volvo.color);
		System.out.println(volvo.mfgYear);
		
		
		System.out.println("------------------------");
		
		
		Car toyota = new Car();
		toyota.name = "Camry";
		toyota.color = "Blue";
		toyota.model = "XSE";
		toyota.mfgYear = 2024;
		toyota.milleage = 0;
		toyota.price = 10000;
		
		System.out.println(toyota.price);
		
		toyota.changePrice(25000);
		
		System.out.println(toyota.price);
		
		System.out.println(volvo);
		System.out.println(toyota);
		
		
		
		
		System.out.println("------------------------");
		
		
		House home = new House();
		home.type = "Courtyard house";
		home.address = "123 Palermo Rose Way, Orlando, FL, US, 34745";
		home.norooms = 5;
		home.age = 2;
		home.owner = "Carlos Pacheco";
		home.price = 170000;
		
		System.out.println(home.type);
		System.out.println(home.address);
		System.out.println(home.norooms + " rooms");
		System.out.println(home.age + " years");
		System.out.println(home.owner);
		System.out.println("$ " + home.price);
		
		System.out.println("------------------------");
		
		House apt = new House();
		
		apt.type = "Penthouse";
		apt.address = "2-18, Orange Paradise Conplex, Del Ray Avenue, Orlando, FL, US, 34742";
		apt.norooms = 6;
		apt.age = 10;
		apt.owner = "Horacio Pagani";
		apt.price = 700000;
		
		System.out.println(apt.type);
		System.out.println(apt.address);
		System.out.println(apt.norooms + " rooms");
		System.out.println(apt.age + " years");
		System.out.println(apt.owner);
		System.out.println("$ " + apt.price);
		
		System.out.println("------------------------");
		
		House mansion = new House();
		
		mansion.type = "Future Mansion";
		mansion.address = "332 Cherry Blosson Road, San Franciso, CA, US, 58702";
		mansion.norooms = 10;
		mansion.age = 15;
		mansion.owner = "Arnold Schwarzenegger";
		mansion.price = 3500000;
		
		
		System.out.println(mansion.type);
		System.out.println(mansion.address);
		System.out.println(mansion.norooms + " rooms");
		System.out.println(mansion.age + " years");
		System.out.println(mansion.owner);
		System.out.println("$ " + mansion.price);
		
		System.out.println("------------------------");
		
		System.out.println(home);
		System.out.println(apt);
		System.out.println(mansion);
		
		System.out.println("------------------------");
		
		TV LgTv = new TV();
		
		LgTv.type = "OLED Evo";
		LgTv.model = "C2";
		LgTv.os = "WebOs";
		LgTv.size = 42;
		LgTv.mnfYear = 2022;
		LgTv.specs = "G-Sync Compatible VRR 120hz";
		LgTv.color = "Black";
		
		System.out.println(LgTv);
		
		System.out.println(LgTv.getOS());
		
		System.out.println("------------------------");

		
	}

}
