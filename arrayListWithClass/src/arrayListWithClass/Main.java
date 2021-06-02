package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"Engin","Demiro�"));
		customers.add(new Customer(2,"Mehmet","Gelir"));
		customers.add(new Customer(3,"Salih","Demiro�"));
		customers.add(new Customer(4,"Derin","Demiro�"));
		

		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
		

	}

}
