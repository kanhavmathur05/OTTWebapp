package com.ottbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ottbackend.model.Series;
import com.ottbackend.repository.SeriesRepository;

@Service
public class SeriesServiceImpl implements SeriesService{

	@Autowired
	SeriesRepository seriesRepository;
	
	@Override
	public List<Series> getSeriesList() {
		// TODO Auto-generated method stub
		return seriesRepository.findAll();
//		return seriesRepository.getSeriesNameLike("Attack");
	}

	@Override
	public void addSeries(Series series) {
		// TODO Auto-generated method stub
		seriesRepository.save(series);
	}

	@Override
	public Series updateSeries(Series series) {
		// TODO Auto-generated method stub
		return seriesRepository.save(series);
	}

	@Override
	public void deleteSeries(int id) {
		// TODO Auto-generated method stub
		seriesRepository.deleteById(id);
	}

	@Override
	public Series getSeriesInfo(int id) {
		// TODO Auto-generated method stub
		return seriesRepository.findById(id).get();
	}

	@Override
	public List<Series> getSearchSeriesList(String query) {
		// TODO Auto-generated method stub
		System.out.println(query);
		return seriesRepository.findBySeriesNameContaining(query);
//		return seriesRepository.getSeriesNameLike(query);
//		return seriesRepository.findBySeriesName(query);
//		return seriesRepository.findAllBySeriesNameLike(query);
	}

}
