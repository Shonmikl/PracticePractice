package com.example.practicepractice.entity;

import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Fine {
    private long id;
    private String fineType;
    private BigDecimal fineAmount;
}