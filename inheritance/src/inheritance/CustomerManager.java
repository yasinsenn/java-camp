package inheritance;

public class CustomerManager {

	public void add(Customer customer) {

		System.out.println(customer.customerNumber + " eklendi...");
	}

	// toplu müþteri ekleme --- bulk insert
	public void addMultiple(Customer[] customers) {

		for (Customer customer : customers) {
			add(customer);
		}
	}
}
