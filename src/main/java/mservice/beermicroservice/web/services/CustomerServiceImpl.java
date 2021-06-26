package mservice.beermicroservice.web.services;

import lombok.extern.slf4j.Slf4j;
import mservice.beermicroservice.web.model.CustomerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Override
    public CustomerDto getCustomerById(UUID id) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name("Nomezinho Nominal")
                .build();
    }

    @Override
    public void updateCustomer(UUID customerId, CustomerDto customerDto) {}

    @Override
    public CustomerDto saveNewCustomer(CustomerDto customerDto) {
        return null;
    }

    @Override
    public void deleteById(UUID customerId) {
        log.debug("Deleting a customer...");
    }
}