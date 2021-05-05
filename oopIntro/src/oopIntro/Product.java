package oopIntro;

public class Product {

	private int id; // private sadece bu classýn içerisinde geçerli demek
	private String name;
	private double unitPrice;
	private String detail;
	private double discount;

	// burda 2 tane constructor var sadece bir tanesi çalýþýr
	// bu mainde product1 ve diðerlerindeki yazým þekline baðlý
	// ben çalýþtým kodu 2 ve 3 ürünlerinde çalýþýrken 1 de çalýþmaz
	// çünkü 1 deki yapý diðer constructorý çalýþtýrýr

	public Product() {
		System.out.println("Ben çalýþtým...");
	}

	public Product(int id, String name, double unitPrice, String detail, double discount) {
		this(); // bu þekilde parametresiz olan constructorlar çalýþtýrýlýr
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
		this.discount = discount;

	}

	// set yazmak get okumak anlamýnda

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

	// sadece okunablir olmasý için set etmedik

	public double getUnitPriceAfterDiscount() {
		return this.unitPrice - (this.unitPrice * this.discount / 100);

	}

	// constructorlarý kýsayol ile de yazabiliriz. Bunun için deðiþkenlerden birine
	// örneðin idye sað týkla >> Source >> Generate constructor using field
	// alanlarý seç en alta almak için after seçenðinde en son olan deðiþkeni seç.

	// ayný yolla getter ve setter da oluþturabiliriz
}
