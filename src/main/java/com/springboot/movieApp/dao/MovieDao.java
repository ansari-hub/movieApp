package com.springboot.movieApp.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import com.springboot.movieApp.Entity.Movie;



public interface MovieDao extends JpaRepository<Movie,Integer>{
	public List<Movie> getByGenre(String genre);
}
