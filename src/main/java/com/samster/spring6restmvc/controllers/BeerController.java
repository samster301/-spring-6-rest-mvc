package com.samster.spring6restmvc.controllers;

import com.samster.spring6restmvc.model.Beer;
import com.samster.spring6restmvc.services.BeerService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;

import java.util.UUID;

@Slf4j
@AllArgsConstructor
@Controller
public class BeerController {
    private final BeerService beerService;

    public Beer getBeerById(UUID id) {

        log.debug("Logging in controller");
        return beerService.getBeerbyId(id);
    }
}
