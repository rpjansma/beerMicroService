package mservice.beermicroservice.web.services;

import mservice.beermicroservice.web.model.BeerDto;
import mservice.beermicroservice.web.model.CustomerDto;

import java.util.UUID;

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateCustomer(UUID beerId, BeerDto beerDto);

    void deleteBeerById(UUID beerId);
}
