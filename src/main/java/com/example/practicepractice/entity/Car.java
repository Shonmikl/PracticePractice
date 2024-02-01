package com.example.practicepractice.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Table(name = "cars")
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Car {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "brand")
    private String brand; //enum

    @Column(name = "model")
    private String model;

    @OneToOne
    @JoinColumn(name = "stateNumber_id", referencedColumnName = "id")
    private StateNumber stateNumber;

    @JoinColumn(name = "carOwner_id", referencedColumnName = "id")
    private CarOwner carOwner;
}