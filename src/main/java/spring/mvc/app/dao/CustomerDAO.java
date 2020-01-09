package spring.mvc.app.dao;

import java.util.List;
import spring.mvc.app.entity.Customer;

public interface CustomerDAO {

  public List<Customer> getCustomers();
}
