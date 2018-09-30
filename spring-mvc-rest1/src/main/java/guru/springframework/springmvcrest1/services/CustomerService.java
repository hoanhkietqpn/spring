package guru.springframework.springmvcrest1.services;

import guru.springframework.springmvcrest1.domain.Customer;

import java.util.List;

public interface CustomerService {
    Customer findCustomerByID(long id);

    List<Customer> findAllCustomers();

    Customer saveCustomer(Customer customer);
}
