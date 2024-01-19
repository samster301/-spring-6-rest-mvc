package com.samster.spring6restmvc.services;

import com.samster.spring6restmvc.model.Beer;

import java.util.List;
import java.util.UUID;

public interface BeerService {
    Beer getBeerbyId(UUID id);

    List<Beer> listBeers();
}
