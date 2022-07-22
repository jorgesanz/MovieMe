package com.dersuzala.movieme.controller.movie;

import lombok.Data;

import java.io.Serializable;

@Data
public class MovieDto implements Serializable {
    private String name;
    private Integer year;
    private String director;
    private String country;
}
