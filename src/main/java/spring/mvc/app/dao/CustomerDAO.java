package spring.mvc.app.dao;

import java.util.List;
import spring.mvc.app.entity.Customer;

public interface CustomerDAO {

  List<Customer> getCustomers();

  void saveCustomer(Customer theCustomer);
}
