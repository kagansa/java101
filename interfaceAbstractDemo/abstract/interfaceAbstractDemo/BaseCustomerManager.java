package interfaceAbstractDemo;

public abstract class BaseCustomerManager implements CustomerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to Database : " + customer.getFirstName());
		
	}

}
