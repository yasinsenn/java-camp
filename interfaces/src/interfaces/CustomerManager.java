package interfaces;

public class CustomerManager {

//	private Logger logger; -- tek log t�r� i�in y�ntem

	private Logger[] loggers; // birden fazla log t�r� g�nderebilmek i�in

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("M��teri eklendi " + customer.getFirstName());
		// this.logger.log(customer.getFirstName()); -- tek log t�r� i�in y�ntem

		Utils.runLoggers(loggers, customer.getFirstName());
	}

	public void delete(Customer customer) {

		System.out.println("M��teri silindi " + customer.getFirstName());
		// this.logger.log(customer.getFirstName()); -- tek log t�r� i�in y�ntem

		// metodu static yapt�k o y�zden newlemeden s�n�f ile kullanabildik
		Utils.runLoggers(loggers, customer.getFirstName());
	}

}
