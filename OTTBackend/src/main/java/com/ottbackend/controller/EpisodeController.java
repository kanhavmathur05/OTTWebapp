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
import com.ottbackend.service.EpisodeService;

import io.swagger.annotations.ApiOperation;

@RestController
public class EpisodeController {

	@Autowired
	EpisodeService episodeService;

	@ApiOperation(value = "Get List of all the episodes", response= Iterable.class, tags="getAllEpisodes")
	@GetMapping("/get-episode-list")
	public List<Episode> getEpisodeList() {
		return episodeService.getEpisodeList();
	}

	@ApiOperation(value = "Get an episode by id", response=Episode.class , tags="getEpisodeById")
	@GetMapping("/get-episode/{id}")
	public Episode getEpisode(@PathVariable int id) {
		return episodeService.getEpisode(id);
	}

	@ApiOperation(value = "Adds an episode to a series", response=Episode.class , tags="addEpisode")
	@PostMapping("/add-episode")
	public void addEpisode(@RequestBody Episode episode) {
		episodeService.addEpisode(episode);
		;
	}
	@ApiOperation(value = "Updates information of an episode", response= Episode.class, tags="updateEpisodeInfo")
	@PutMapping("/update-episode")
	public void updateEpisode(@RequestBody Episode episode) {
		episodeService.updateEpisodeInfo(episode);
	}
	
	@ApiOperation(value = "Deletes Episode By Id", response= Episode.class, tags="deleteEpisode")
	@DeleteMapping("/delete-episode/{id}")
	public void deleteEpisode(@PathVariable int id) {
		episodeService.deleteEpisode(id);
	}
}
