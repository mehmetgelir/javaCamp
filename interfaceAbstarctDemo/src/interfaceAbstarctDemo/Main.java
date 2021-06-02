package interfaceAbstarctDemo;


import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;
import java.time.LocalDate;

public class Main {
	
	
	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(1, "Mehmet", "GELÝR",LocalDate.of(1994,9, 04) ,"25111814"));
		
	
	}

}
