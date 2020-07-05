package com.msscbeerservice.msscbeerservice.web.controller;


import com.msscbeerservice.msscbeerservice.web.models.BeerDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {

    @GetMapping("{beerId}")
    public ResponseEntity<BeerDto> getBeers(@PathVariable("beerId") UUID beerId) {

    }
}
