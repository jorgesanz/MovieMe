package com.dersuzala.movieme.controller.movie;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@Data
@RedisHash("Student")
public class MovieDto implements Serializable {

    @Id
    private String id;
    private String name;
    private Integer year;
    private String director;
    private String country;
}
