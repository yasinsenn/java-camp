package interfaces;

public class Main {

	public static void main(String[] args) {
//		CustomerManager customerManager = new CustomerManager(new EmailLogger());  -- tek log türü için yöntem

		Logger[] loggers = { new SmsLogger(), new EmailLogger(), new FileLogger() };
		CustomerManager customerManager = new CustomerManager(loggers);

		Customer engin = new Customer(1, "Engin", "Demiroð");

		customerManager.add(engin);
	}

}
