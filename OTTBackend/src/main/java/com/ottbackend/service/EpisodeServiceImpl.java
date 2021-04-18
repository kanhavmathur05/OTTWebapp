package com.ottbackend.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ottbackend.model.Episode;
import com.ottbackend.repository.EpisodeRepository;

@Service
public class EpisodeServiceImpl implements EpisodeService {

	@Autowired
	EpisodeRepository episodeRepository;

	@Override
	public Episode getEpisode(int id) {

		return episodeRepository.findById(id).get();
	}

	@Override
	public List<Episode> getEpisodeList() {
		System.out.println("Debugger is working!!");
		return episodeRepository.findAll();
	}

	@Override
	public void addEpisode(Episode episode) {
		episodeRepository.save(episode);
	}

	@Override
	public void deleteEpisode(int id) {
		episodeRepository.deleteById(id);
	}

	@Override
	public void updateEpisodeInfo(Episode episode) {
		episodeRepository.save(episode);
	}

}
