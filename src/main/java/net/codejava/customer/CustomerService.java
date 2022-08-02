package net.codejava.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CustomerService {
    @Autowired CustomerRepository repo;

    public void save(Customer customer) {

        repo.save(customer);
    }

    public List<Customer> listAll() {

        return (List<Customer>) repo.findAll();
    }

    public Customer findById(int id) {
        return repo.findById(id).get();
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}
