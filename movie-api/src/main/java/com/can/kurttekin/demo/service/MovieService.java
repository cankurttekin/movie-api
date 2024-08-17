package com.can.kurttekin.demo.service;

import com.can.kurttekin.demo.domain.entity.Movie;
import com.can.kurttekin.demo.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> findMovieById(ObjectId id) {
        return Optional.ofNullable(movieRepository.findById(id).orElse(null));
    }

    public Optional<Movie> findMovieByImdbId(String imdbId) {
        return Optional.ofNullable(movieRepository.findMovieByImdbId(imdbId).orElse(null));
    }
}
