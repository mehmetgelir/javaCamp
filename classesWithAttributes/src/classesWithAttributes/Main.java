package classesWithAttributes;

public class Main {

	public static void main(String[] args) {
		
		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setPrice(121);
		product.setDescription("G�zel Pc");
		product.setStockAmount(21);
		
		System.out.println(product.getName());


		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
	}

}
