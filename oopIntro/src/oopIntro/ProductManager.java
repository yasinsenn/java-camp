package oopIntro;

public class ProductManager {

	public void addToCart(Product product) {

		System.out.println("Sepete eklendi " + product.getName());

	}

	// variable arguments �zelli�i konudan ba��ms�z...
	// bu �ekilde array mant���yla parametre verebiliriz
	// s�n�rl� say�da olmaz istedi�imiz kadar parmetre g�ndrebiliriz
	public static int topla(int... sayilar) {
		int toplam = 0;
		for (int sayi : sayilar) {
			toplam += sayi;
		}
		return toplam;

	}
}
