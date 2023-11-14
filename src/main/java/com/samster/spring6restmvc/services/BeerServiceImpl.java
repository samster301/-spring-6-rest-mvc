package com.samster.spring6restmvc.services;

import com.samster.spring6restmvc.model.Beer;
import com.samster.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public Beer getBeerbyId(UUID id) {

        log.debug("Logging in Service");
        return Beer.builder()
                .id(id)
                .version(1)
                .beerName("Dog fish head")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal(12.99))
                .quantityOnHand(120)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
    }
}
