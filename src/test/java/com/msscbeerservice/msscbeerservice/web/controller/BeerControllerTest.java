package com.msscbeerservice.msscbeerservice.web.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;

import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(BeerController.class)
class BeerControllerTest {

    @Autowired
    MockMvc mockMvc;

    @Test
    void getBeerById() {
    }

    @Test
    void saveNewBeer() {
    }

    @Test
    void updateBeer() {
    }

}