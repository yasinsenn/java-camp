package oopIntro;

public class Product {

	private int id; // private sadece bu class�n i�erisinde ge�erli demek
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

	// burda 2 tane constructor var sadece bir tanesi �al���r
	// bu mainde product1 ve di�erlerindeki yaz�m �ekline ba�l�
	// ben �al��t�m kodu 2 ve 3 �r�nlerinde �al���rken 1 de �al��maz
	// ��nk� 1 deki yap� di�er constructor� �al��t�r�r

	public Product() {
		System.out.println("Ben �al��t�m...");
	}

	public Product(int id, String name, double unitPrice, String detail, double discount) {
		this(); // bu �ekilde parametresiz olan constructorlar �al��t�r�l�r
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;

	}

	// set yazmak get okumak anlam�nda

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	// sadece okunablir olmas� i�in set etmedik

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);

	}

	// constructorlar� k�sayol ile de yazabiliriz. Bunun i�in de�i�kenlerden birine
	// �rne�in idye sa� t�kla >> Source >> Generate constructor using field
	// alanlar� se� en alta almak i�in after se�en�inde en son olan de�i�keni se�.

	// ayn� yolla getter ve setter da olu�turabiliriz
}
