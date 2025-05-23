package com.xpvault.backend.facade;

import com.xpvault.backend.dto.BasicCastDTO;
import com.xpvault.backend.dto.BasicDirectorDTO;
import com.xpvault.backend.dto.MovieDTO;
import info.movito.themoviedbapi.model.movies.MovieDb;

import java.util.List;
import java.util.Optional;

public interface MovieFacade {

    List<MovieDTO> getPopularMovies(String language, int page, String region);
    List<MovieDTO> getTopRatedMovies(String language, int page, String region);
    List<MovieDTO> getUpcomingMovies(String language, int page, String region);
    List<MovieDTO> getMovieByTitle(String title, String language, int page, String region);
    List<MovieDTO> getMovieByGenre(String genre, String language, int page);
    MovieDTO getMovieDetailsById(int id, String language);
    MovieDb getMovieFullDetailsById(int id, String language);
    Optional<BasicDirectorDTO> getBasicDirectorDTO(MovieDb source);
    List<BasicCastDTO> getBasicCastDTO(MovieDb source);

}
