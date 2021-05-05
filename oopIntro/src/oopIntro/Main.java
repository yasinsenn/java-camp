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
		category2.setName("Ev / Bah�e");

		System.out.println(category1.getName());
		System.out.println(category2.getName());
		// bunlar 2 farkl� sayfa olsun de�i�iklik yapaca��m�z zaman her sayfada yapmak
		// yerine a�a��daki y�ntem uygulan�r (sayfa say�s� daha da fazla olabilir )
		// name sonuna ! i�areti eklenmemiz istendi her sayfaya gidip kod de�i�tirmek
		// �ok zor olacak
		// Category s�n�f�nda getName mteodunda return name k�sm�na + "!" eklersek t�m
		// sayfalarda de�i�iklik olacakt�r
		// get ve set mant���n�n �nemi burda ortaya ��k�yor

		ProductManager productManager = new ProductManager();
		productManager.addToCart(product1);
		productManager.addToCart(product2);
		productManager.addToCart(product3);

	}

}
