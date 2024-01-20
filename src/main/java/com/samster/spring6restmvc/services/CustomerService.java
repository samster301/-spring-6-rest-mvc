package com.samster.spring6restmvc.services;

import com.samster.spring6restmvc.model.Customer;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public interface CustomerService {

    public Map<UUID, Customer> listCustomer();


    Customer listCustomerByID(UUID id);
}
