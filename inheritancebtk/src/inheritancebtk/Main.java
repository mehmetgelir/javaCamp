package inheritancebtk;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.id =1;
		Employee employee = new Employee();
		employee.id =2;
		
		EmployeeManager employeeManager = new EmployeeManager();
		employeeManager.BestEmployee();
		
		CustomerManager customerManager = new CustomerManager();
		customerManager.Add();

	}

}
