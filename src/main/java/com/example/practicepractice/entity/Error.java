package com.example.practicepractice.entity;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Error {
    private String code;
    private String message;
}