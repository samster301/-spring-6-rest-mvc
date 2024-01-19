package com.samster.spring6restmvc.services;

import com.samster.spring6restmvc.model.Beer;
import com.samster.spring6restmvc.model.BeerStyle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.*;

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

    @Override
    public List<Beer> listBeers() {
        List<Beer> beerList = new LinkedList<Beer>();

        Beer beer1 = new Beer.BeerBuilder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Dog fish head")
                .beerStyle(BeerStyle.PALE_ALE)
                .upc("123456")
                .price(new BigDecimal(12.99))
                .quantityOnHand(120)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer2 = new Beer.BeerBuilder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Medelo")
                .beerStyle(BeerStyle.PILSNER)
                .upc("476776")
                .price(new BigDecimal(7.99))
                .quantityOnHand(230)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        Beer beer3 = new Beer.BeerBuilder()
                .id(UUID.randomUUID())
                .version(1)
                .beerName("Guinness")
                .beerStyle(BeerStyle.STOUT)
                .upc("656766")
                .price(new BigDecimal(11.99))
                .quantityOnHand(160)
                .createdDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();

        beerList.add(beer1);
        beerList.add(beer2);
        beerList.add(beer3);

        return  beerList;
    }
}
