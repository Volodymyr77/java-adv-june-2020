package com.oktenweb.javaadvjune2020.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Movie {

    private int id;
    private String title;
    private int duretion;
}
