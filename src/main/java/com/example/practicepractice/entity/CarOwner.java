package com.example.practicepractice.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class CarOwner {
    private long id;
    private String firstName;
    private String middleName;
    private String lastName;
}