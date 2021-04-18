package com.ottbackend.service;

import java.util.List;

import com.ottbackend.model.Series;

public interface SeriesService {
	Series getSeriesInfo(int id);
	List<Series> getSeriesList();
	void addSeries(Series series);
	Series updateSeries(Series series);
	void deleteSeries(int id);
	List<Series> getSearchSeriesList(String query);
}
