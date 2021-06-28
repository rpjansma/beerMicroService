package mservice.beermicroservice.bootstrap;

import mservice.beermicroservice.domain.Beer;
import mservice.beermicroservice.repositories.BeerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class BeerLoader implements CommandLineRunner {

    private final BeerRepository beerRepository;

    public BeerLoader(BeerRepository beerRepository) {
        this.beerRepository = beerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        loadBeerObjects();
    }

    private void loadBeerObjects(){
        if(beerRepository.count() == 0) {
            beerRepository.save(Beer.builder()
                    .beerName("Brejolinha Galaxiosa")
                    .beerStyle("IPA")
                    .upc(72527273070L)
                    .quantityOnHands(100)
                    .price(new BigDecimal("10.50"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Jabuti do Mato")
                    .beerStyle("PILSEN")
                    .upc(13527273370L)
                    .quantityOnHands(300)
                    .price(new BigDecimal("6.50"))
                    .build());
            beerRepository.save(Beer.builder()
                    .beerName("Jararaca")
                    .beerStyle("PALE_ALE")
                    .upc(90522273070L)
                    .quantityOnHands(50)
                    .price(new BigDecimal("8.10"))
                    .build());
        }
    }
}
