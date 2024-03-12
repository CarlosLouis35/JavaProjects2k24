package MiClase;

import javax.xml.stream.events.Namespace;

public class Metodos {
	
	public static void main(String[] args){
		
	String name = "Carlos";
	String lastN = "Pacheco";
	String address = "123 evergreen, Hollywood, California";
	
	String s = " ";
	
	System.out.println(name + " " +  lastN + " "+  address);
	System.out.println(name.concat(s.concat(lastN.concat(s.concat(address)))));
	
	name.length();
	System.out.println(name.length());
	
	StringBuilder car = new StringBuilder();
	
	car.append("Toyota");
	car.append(" ");
	car.append("Celica");
	
	
	System.out.println(car);
	
	StringBuffer car2 = new StringBuffer();
	car2.append("Nissan");
	car2.append(" ");
	car2.append("Z");
	
	System.out.println(car2);
	
	
	
		
		
	}
	
	
	
}
