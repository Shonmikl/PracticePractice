package com.example.practicepractice.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Statistics {

    private long id;
    private Fine fine;
    private long topPlace;//?
    private long occurrencesNumber;
}