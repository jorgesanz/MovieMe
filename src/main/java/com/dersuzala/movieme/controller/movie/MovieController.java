package com.dersuzala.movieme.controller.movie;

import com.dersuzala.movieme.repository.MovieRepository;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController()
@RequestMapping("movies")
public class MovieController {

    private List<MovieDto> movies = new ArrayList<>();
    @Autowired
    private MovieRepository movieRepository;

    @GetMapping
    public ResponseEntity<List<MovieDto>> getMovies(){

        List<MovieDto> movies = Lists.newArrayList(movieRepository.findAll());
        return ResponseEntity.ok(movies);
    }

    @PostMapping
    public ResponseEntity<MovieDto> postMovie(@RequestBody MovieDto movieDto){
        movieDto.setId(UUID.randomUUID().toString());
        movieRepository.save(movieDto);
        return ResponseEntity.ok(movieDto);
    }

}
