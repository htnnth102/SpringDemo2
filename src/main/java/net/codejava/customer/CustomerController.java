package net.codejava.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Map;

@Controller
public class CustomerController {
    @Autowired
    //autowire de lay tu repo
    private CustomerService customerService;

    @RequestMapping("/")
    public ModelAndView home() {
        List<Customer> lstCustomer = customerService.listAll();
        lstCustomer.add(new Customer("Ngan", "Ha Thi", "Ha Noi"));
        lstCustomer.add(new Customer("Ngan", "Ha Thi", "Ha Noi"));
        lstCustomer.add(new Customer("Ngan", "Ha Thi", "Ha Noi"));
        ModelAndView mav = new ModelAndView("index");
        mav.addObject("listCustomers", lstCustomer);
        return mav;
    }

    @RequestMapping("/new")
    public String addNewForm(Map<String, Object> model) {
        Customer cus = new Customer();
        model.put("customer", cus);
        return "new-customer";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveCus(@ModelAttribute("customer") Customer customer) {
        customerService.save(customer);
        return "redirect:/";
    }
}
