package oopIntro;

public class ProductManager {

	public void addToCart(Product product) {

		System.out.println("Sepete eklendi " + product.getName());

	}

	// variable arguments özelliði konudan baðýmsýz...
	// bu þekilde array mantýðýyla parametre verebiliriz
	// sýnýrlý sayýda olmaz istediðimiz kadar parmetre göndrebiliriz
	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;

	}
}
