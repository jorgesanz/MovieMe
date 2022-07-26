package com.dersuzala.movieme.repository;

import com.dersuzala.movieme.controller.movie.MovieDto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepository extends CrudRepository<MovieDto, String> {}