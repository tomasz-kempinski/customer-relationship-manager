package spring.mvc.app.service;

import java.util.List;
import spring.mvc.app.entity.Customer;

public interface CustomerService {

  List<Customer> getCustomers();

  void saveCustomer(Customer theCustomer);

  Customer getCustomer(int id);

  void deleteCustomer(int id);

  List<Customer> searchCustomers(String searchedName);
}
