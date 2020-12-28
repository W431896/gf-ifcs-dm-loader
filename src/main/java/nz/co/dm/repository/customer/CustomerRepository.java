package nz.co.dm.repository.customer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import nz.co.dm.model.customer.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
	
	//List<Customer> findAllCustomers();
	@Query("SELECT c FROM Customer c WHERE c.name = ?1")
	List<Customer> findCustomersByName(String name);

}
