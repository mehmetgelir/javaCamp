package polymorphismDemo;


public class Main {

	public static void main(String[] args) {
		//BaseLogger[] Loggers = new BaseLogger[] {new FileLogger(),new DatabaseLogger(),new EmailLogger(),new ConsoleLogger()};
		//for (BaseLogger logger : Loggers) {
		//	logger.Log("Log mesaj�");
		//}
		
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger());
		customerManager.add();
		customerManager.add();
	}

}
