package mservice.beermicroservice.web.controller;

import mservice.beermicroservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {


    @GetMapping("/{beerId}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID id) {
           return new ResponseEntity<>();
    }
}
