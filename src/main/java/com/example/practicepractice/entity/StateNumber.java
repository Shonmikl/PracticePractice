package com.example.practicepractice.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class StateNumber {
    private long id;
    private String country;
    private long regionCode;
    private String govNumberSeries;
    private long registrationNumber;
}