package com.samster.spring6restmvc.services;

import com.samster.spring6restmvc.model.Customer;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.*;

@Service
public class CustomerServiceImpl implements CustomerService {

    Map<UUID,Customer> customerMap = new HashMap<>();

    public CustomerServiceImpl() {
        Customer rocky = Customer.builder()
                .id(UUID.randomUUID())
                .name("Rocky Balbova")
                .version("v001")
                .createDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer hpc = Customer.builder()
                .id(UUID.randomUUID())
                .name("Hari Prasad Chourasiya")
                .version("v00987")
                .createDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();

        Customer neil = Customer.builder()
                .id(UUID.randomUUID())
                .name("Neil Armstrong")
                .version("v003")
                .createDate(LocalDateTime.now())
                .lastModifiedDate(LocalDateTime.now())
                .build();


        customerMap.put(rocky.getId(),rocky);
        customerMap.put(hpc.getId(),hpc);
        customerMap.put(neil.getId(),neil);

    }

    @Override
    public Map<UUID, Customer> listCustomer() {

      return customerMap;
    }

    @Override
    public Customer listCustomerByID(UUID id) {
        return customerMap.get(id);
    }
}
