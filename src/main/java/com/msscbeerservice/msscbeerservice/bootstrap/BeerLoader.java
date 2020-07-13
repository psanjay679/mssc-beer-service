package com.msscbeerservice.msscbeerservice.bootstrap;

import com.msscbeerservice.msscbeerservice.domain.Beer;
import com.msscbeerservice.msscbeerservice.repositories.BeerRepository;
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
    public void run(String... args) throws Exception{
        loadBeerObjects();
    }

    private void loadBeerObjects() {

        if (beerRepository.count() == 0) {
            beerRepository.save(Beer.builder().
                    beerName("Budwiser").
                    quantityToBrew(100).
                    beerStyle("IPA").
                    upc(162842332424141L)
                    .price(new BigDecimal(1313))
                    .build());
            beerRepository.save(Beer.builder().
                    beerName("KingFisher").
                    quantityToBrew(100).
                    beerStyle("IPA").
                    upc(16282332424141L)
                    .price(new BigDecimal(1313))
                    .build());
            beerRepository.save(Beer.builder().
                    beerName("Bira").
                    quantityToBrew(100).
                    beerStyle("IPA").
                    upc(16284233242441L)
                    .price(new BigDecimal(1313))
                    .build());
            beerRepository.save(Beer.builder().
                    beerName("Hienaken").
                    quantityToBrew(100).
                    beerStyle("IPA").
                    upc(16284233224141L)
                    .price(new BigDecimal(1313))
                    .build());
        }

//        System.out.println("Loaded Beers: " + beerRepository.count());
    }
}
