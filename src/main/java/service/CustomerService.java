package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerService {
    List<Customer> customers = new ArrayList<>();
    public CustomerService() {
        customers.add(new Customer(1,"Hung","hung@gmail.com","HN"));
    }

    public List<Customer> findAll() {
        return customers;
    }

    public Customer findById(Long id) {
        Customer customer = new Customer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id ){
                customer = customers.get(i);
            }
        }
        return customer;
    }
    public Customer findById(int id) {
        Customer customer = new Customer();
        for (int i = 0; i < customers.size(); i++) {
            if (customers.get(i).getId() == id ){
                customer = customers.get(i);
            }
        }
        return customer;
    }

    public void save(Customer customer) {
        Customer c = findById(customer.getId());
        c.setId(customer.getId());
        c.setName(customer.getName());
        c.setEmail(customer.getEmail());
        c.setAddress(customer.getAddress());
    }
}
