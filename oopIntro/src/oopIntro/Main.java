package oopIntro;

public class Main {

	public static void main(String[] args) {

		Product product1 = new Product(1, "Lenovo", 15000, "16 GB RAM", 10);

		Product product2 = new Product();
		product2.setId(2);
		product2.setName("Lenovo");
		product2.setDetail("16 gb ram");
		product2.setDiscount(10);
		product2.setUnitPrice(16000);
		System.out.println(product2.getUnitPriceAfterDiscount());

		Product product3 = new Product();

		Product[] products = { product1, product2, product3 };

		for (Product product : products) {

			System.out.println(product.getName());
			System.out.println("------------------");
		}

		System.out.println(products.length);

		Category category1 = new Category();
		category1.setId(1);
		category1.setName("Bilgisayar");

		Category category2 = new Category();
		category2.setId(2);
		category2.setName("Ev / Bahçe");

		System.out.println(category1.getName());
		System.out.println(category2.getName());
		// bunlar 2 farklý sayfa olsun deðiþiklik yapacaðýmýz zaman her sayfada yapmak
		// yerine aþaðýdaki yöntem uygulanýr (sayfa sayýsý daha da fazla olabilir )
		// name sonuna ! iþareti eklenmemiz istendi her sayfaya gidip kod deðiþtirmek
		// çok zor olacak
		// Category sýnýfýnda getName mteodunda return name kýsmýna + "!" eklersek tüm
		// sayfalarda deðiþiklik olacaktýr
		// get ve set mantýðýnýn önemi burda ortaya çýkýyor

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
