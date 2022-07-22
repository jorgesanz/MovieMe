package com.dersuzala.movieme.controller.movie;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController()
@RequestMapping("movies")
public class MovieController {

    private List<MovieDto> movies = new ArrayList<>();
    @GetMapping
    public ResponseEntity<List<MovieDto>> getMovies(){
        return ResponseEntity.ok(movies);
    }

    @PostMapping
    public ResponseEntity<MovieDto> postMovie(@RequestBody MovieDto movieDto){
        movies.add(movieDto);
        return ResponseEntity.ok(movieDto);
    }

}
