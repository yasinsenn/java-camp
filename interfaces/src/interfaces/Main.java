package interfaces;

public class Main {

	public static void main(String[] args) {
//		CustomerManager customerManager = new CustomerManager(new EmailLogger());  -- tek log t�r� i�in y�ntem

		Logger[] loggers = { new SmsLogger(), new EmailLogger(), new FileLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);

		Customer engin = new Customer(1, "Engin", "Demiro�");

		customerManager.add(engin);
	}

}
