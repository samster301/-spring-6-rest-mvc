package com.samster.spring6restmvc.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
public class Customer {
    private UUID id;
    private String name;
    private String version;
    private LocalDateTime createDate;
    private LocalDateTime lastModifiedDate;

}
