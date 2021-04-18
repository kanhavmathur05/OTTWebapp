package com.ottbackend.service;

import java.util.List;

import com.ottbackend.model.Episode;

public interface EpisodeService {
	Episode getEpisode(int id);
	List<Episode> getEpisodeList();
	void addEpisode(Episode episode);
	void deleteEpisode(int id);
	void updateEpisodeInfo(Episode episode);
}
