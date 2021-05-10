package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager productManager = new ProductManager();
		Product product = new Product();
		product.price=1300;
		product.name ="Laptop";
		
		productManager.add(product);
		
		DatabaseHelper.Crud.delete();//inner Class
		DatabaseHelper.Connection.createConnection();
		
	}
	
	

}
