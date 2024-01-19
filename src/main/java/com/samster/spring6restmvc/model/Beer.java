package com.samster.spring6restmvc.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
public class Beer {

    private UUID id;
    private Integer version;
    private String beerName;
    private BeerStyle beerStyle;
    private String upc;
    private Integer quantityOnHand;
    private BigDecimal price;
    private LocalDateTime createdDate;
    private LocalDateTime updateDate;

    Beer(UUID id, Integer version, String beerName, BeerStyle beerStyle, String upc, Integer quantityOnHand, BigDecimal price, LocalDateTime createdDate, LocalDateTime updateDate) {
        this.id = id;
        this.version = version;
        this.beerName = beerName;
        this.beerStyle = beerStyle;
        this.upc = upc;
        this.quantityOnHand = quantityOnHand;
        this.price = price;
        this.createdDate = createdDate;
        this.updateDate = updateDate;
    }

    public static BeerBuilder builder() {
        return new BeerBuilder();
    }

    public static class BeerBuilder {
        private UUID id;
        private Integer version;
        private String beerName;
        private BeerStyle beerStyle;
        private String upc;
        private Integer quantityOnHand;
        private BigDecimal price;
        private LocalDateTime createdDate;
        private LocalDateTime updateDate;

        public BeerBuilder() {
        }

        public BeerBuilder id(UUID id) {
            this.id = id;
            return this;
        }

        public BeerBuilder version(Integer version) {
            this.version = version;
            return this;
        }

        public BeerBuilder beerName(String beerName) {
            this.beerName = beerName;
            return this;
        }

        public BeerBuilder beerStyle(BeerStyle beerStyle) {
            this.beerStyle = beerStyle;
            return this;
        }

        public BeerBuilder upc(String upc) {
            this.upc = upc;
            return this;
        }

        public BeerBuilder quantityOnHand(Integer quantityOnHand) {
            this.quantityOnHand = quantityOnHand;
            return this;
        }

        public BeerBuilder price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public BeerBuilder createdDate(LocalDateTime createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public BeerBuilder updateDate(LocalDateTime updateDate) {
            this.updateDate = updateDate;
            return this;
        }

        public Beer build() {
            return new Beer(this.id, this.version, this.beerName, this.beerStyle, this.upc, this.quantityOnHand, this.price, this.createdDate, this.updateDate);
        }

        public String toString() {
            return "Beer.BeerBuilder(id=" + this.id + ", version=" + this.version + ", beerName=" + this.beerName + ", beerStyle=" + this.beerStyle + ", upc=" + this.upc + ", quantityOnHand=" + this.quantityOnHand + ", price=" + this.price + ", createdDate=" + this.createdDate + ", updateDate=" + this.updateDate + ")";
        }
    }
}
