package arrayListWithClass;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Customer> customers = new ArrayList<Customer>();
		customers.add(new Customer(1,"Engin","Demiroð"));
		customers.add(new Customer(2,"Mehmet","Gelir"));
		customers.add(new Customer(3,"Salih","Demiroð"));
		customers.add(new Customer(4,"Derin","Demiroð"));
		

		for (Customer customer : customers) {
			System.out.println(customer.firstName);
		}
		

	}

}
