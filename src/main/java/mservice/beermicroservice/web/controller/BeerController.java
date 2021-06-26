package mservice.beermicroservice.web.controller;

import mservice.beermicroservice.web.model.BeerDto;
import mservice.beermicroservice.web.services.BeerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    @Autowired
    public BeerService beerService;


    @GetMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID id) {
           return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto) {
        BeerDto savedDto = beerService.saveNewBeer(beerDto);

        return new ResponseEntity(HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        //todo update implementation
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/{beerId}")
    public ResponseEntity deleteBeerById(@PathVariable UUID beerId) {
        //todo delete implementation
        return new ResponseEntity(HttpStatus.ACCEPTED);
    }
}
