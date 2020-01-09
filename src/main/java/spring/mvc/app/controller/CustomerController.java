package spring.mvc.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import spring.mvc.app.dao.CustomerDAO;
import spring.mvc.app.entity.Customer;

@Controller
@RequestMapping("/customer")
public class CustomerController {

  @Autowired
  private CustomerDAO customerDAO;

  @RequestMapping("/list")
  public String listCustomers(Model model){

    List<Customer> theCustomers = customerDAO.getCustomers();

    model.addAttribute("customers", theCustomers);

    return "list-customers";
  }
}
