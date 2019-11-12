package com.helix.compiler.SoftLeaks;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class CustomerManager {

	private List<Customer> customers = new ArrayList<Customer>();
	private int nextAvalailbleId = 0;
	private int lastProcessedId = -1;

	public  void addCustomer(Customer customer) {
		synchronized (this) {
			customer.setId(nextAvalailbleId);
			synchronized(customers) {
				customers.add(customer);
			}
			nextAvalailbleId++;
		}

	}
// this method will simulate memory leak, since this method id not removing the Customer object after get()
	public Optional<Customer> getNextCustomer() {

				if (lastProcessedId + 1 > nextAvalailbleId) {
					lastProcessedId++;
					return Optional.of(customers.get(lastProcessedId));
				}
				return Optional.empty();
	}

// you can use this method to run the applicatin without the memory leak.
	public Optional<Customer> getNextCustomerWithoutMemoryLeak() {
		synchronized(customers){
			if(customers.size()>0){
				return Optional.of(customers.remove(0));
			}
		}
		return Optional.empty();
	}

	public void howManyCustomers() {
		int size = 0;
		size = customers.size();
		System.out.println("" + new Date() + " Customers in queue : " + size + " of " + nextAvalailbleId);
	}

}
