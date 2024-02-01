package com.example.practicepractice.entity;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class PenaltyEvent {
    private long id;
    private LocalDate eventDate;
    private Fine fine;
    private Car car;
}