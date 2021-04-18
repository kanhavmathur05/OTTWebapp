package com.ottbackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ottbackend.model.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, Integer>{
	List<Series> findBySeriesNameContaining(String seriesName);

	@Query("Select s from Series s Where s.seriesName LIKE ?1")
	List<Series> getSeriesNameLike(String query);
	
	List<Series> findBySeriesName(String query);
	
	List<Series> findAllBySeriesNameLike(String query);
}
