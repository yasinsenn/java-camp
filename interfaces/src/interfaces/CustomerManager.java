package interfaces;

public class CustomerManager {

//	private Logger logger; -- tek log türü için yöntem

	private Logger[] loggers; // birden fazla log türü gönderebilmek için

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Müþteri eklendi " + customer.getFirstName());
		// this.logger.log(customer.getFirstName()); -- tek log türü için yöntem

		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {

		System.out.println("Müþteri silindi " + customer.getFirstName());
		// this.logger.log(customer.getFirstName()); -- tek log türü için yöntem

		// metodu static yaptýk o yüzden newlemeden sýnýf ile kullanabildik
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
