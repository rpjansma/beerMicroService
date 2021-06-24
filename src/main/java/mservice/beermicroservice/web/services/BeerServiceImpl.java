package mservice.beermicroservice.web.services;

import lombok.extern.slf4j.Slf4j;
import mservice.beermicroservice.web.model.BeerDto;
import mservice.beermicroservice.web.model.BeerStyleEnum;
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
                .beerStyle(BeerStyleEnum.GOSE)
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                    .id(beerDto.getId())
                    .beerName(beerDto.getBeerName())
                    .beerStyle(beerDto.getBeerStyle())
                    .price(beerDto.getPrice())
                    .quantityOnHand(beerDto.getQuantityOnHand())
                    .build();

    }
}
