package pandy.test.service;

import java.util.List;

import pandy.test.domain.Customer;

//保存客户
public interface CustomerService {
	//保存客户
	void save(Customer c);

	List<Customer> getAll();

}

