package spring.mvc.app.service;

import java.util.List;
import spring.mvc.app.entity.Customer;

public interface CustomerService {

  List<Customer> getCustomers();
}