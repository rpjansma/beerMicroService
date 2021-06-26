package mservice.beermicroservice.web.services;

import mservice.beermicroservice.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID id);

    void updateCustomer(UUID customerId, CustomerDto customerDto);

    CustomerDto saveNewCustomer(CustomerDto customerDto);

    void deleteById(UUID customerId);
}