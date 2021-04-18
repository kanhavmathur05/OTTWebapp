package com.ottbackend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ottbackend.model.Episode;
import com.ottbackend.model.Series;
import com.ottbackend.service.SeriesService;

import io.swagger.annotations.ApiOperation;

@RestController
public class SeriesController {

	@Autowired
	SeriesService seriesService;

	@ApiOperation(value = "Deletes Episode By Id", response= Episode.class, tags="deleteEpisode")
	@GetMapping("/get-series/{id}")
	public Series getSeriesInfo(@PathVariable int id) {
		return seriesService.getSeriesInfo(id);
	}

	@ApiOperation(value = "Add Series to the database", response= Series.class, tags="addSeries")
	@PostMapping("/add-series")
	public void addSeries(@RequestBody Series series) {
		seriesService.addSeries(series);
	}

	@ApiOperation(value = "Get List Of series", response= Series.class, tags="getSeriesList")
	@GetMapping("/get-series-list")
	public List<Series> getSeriesList() {
		return seriesService.getSeriesList();
	}

	@ApiOperation(value = "Returns the list of series according to the searched query on series name", response= Series.class, tags="listSearchedResultsOfSeriesByQuery")
	@GetMapping("/search-series-list/{query}") 
	public List<Series> getSeriesList(@PathVariable String query) {
		return seriesService.getSearchSeriesList(query);
	}

	@ApiOperation(value = "Update Series By Id", response= Episode.class, tags="updateSeries")
	@PutMapping("/update-series-info")
	public Series updateSeriesInfo(@RequestBody Series series) {
		return seriesService.updateSeries(series);
	}

	@ApiOperation(value = "Deletes Series By Id", response= Series.class, tags="deleteSeries")
	@DeleteMapping("/delete-series/{id}")
	public void deleteSeries(@PathVariable int id) {
		seriesService.deleteSeries(id);
	}

	@ApiOperation(value = "Returns a list of series according to the search key", response= Iterable.class, tags="getSeriesListBySearchQuery")
	@GetMapping("/get-series-list/{query}")
	public List<Series> getSearchSeriesList(@PathVariable String query) {
		return seriesService.getSearchSeriesList(query);
	}
}
