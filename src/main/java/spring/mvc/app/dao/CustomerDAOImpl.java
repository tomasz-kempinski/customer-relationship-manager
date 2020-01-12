package spring.mvc.app.dao;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import spring.mvc.app.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

  @Autowired
  private SessionFactory sessionFactory;

  @Override
  public List<Customer> getCustomers() {

    Session currentSession = sessionFactory.getCurrentSession();

    Query<Customer> query = currentSession
        .createQuery("select c from Customer c order by c.lastName", Customer.class);

    List<Customer> customers = query.getResultList();

    return customers;
  }

  @Override
  public void saveCustomer(Customer theCustomer) {

    Session currentSession = sessionFactory.getCurrentSession();

    currentSession.saveOrUpdate(theCustomer);
  }

  @Override
  public Customer getCustomer(int id) {

    Session currentSession = sessionFactory.getCurrentSession();

    Customer theCustomer = currentSession.get(Customer.class, id);

    return theCustomer;
  }
}
