package com.samster.spring6restmvc.controllers;

import com.samster.spring6restmvc.model.Customer;
import com.samster.spring6restmvc.services.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.UUID;

@AllArgsConstructor
@RestController
public class CustomerController {

    private final CustomerService customerService;

    @RequestMapping(value = "/api/v1/customer",method = RequestMethod.GET)
    public Map<UUID, Customer> getCustomerList()
    {
        return customerService.listCustomer();
    }

    @RequestMapping(value = "/api/v1/customer/{customerId}",method = RequestMethod.GET)
    public Customer getCustomerbyID(@PathVariable ("customerId") UUID customerId)
    {
        return customerService.listCustomerByID(customerId);

    }
}
