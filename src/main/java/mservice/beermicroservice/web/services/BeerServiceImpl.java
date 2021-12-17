package mservice.beermicroservice.web.services;

import lombok.extern.slf4j.Slf4j;
import mservice.beermicroservice.web.model.BeerDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {

    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName("Brejolinha Glaxiosa")
                .beerStyle("GOSE")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                    .id(UUID.randomUUID())
                    .build();
    }

    @Override
    public void updateBeer(UUID id, BeerDto beerDto) {
    }

    @Override
    public void deleteBeerById(UUID beerId) {
        log.debug("Deleting a beer...");
    }
}
