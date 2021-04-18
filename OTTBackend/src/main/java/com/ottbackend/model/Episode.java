package com.ottbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
@Table(name = "episode")
public class Episode {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "episode_number")
	private int episodeNumber;

	@JsonBackReference
	@ManyToOne
	@JoinColumn(name = "series_id")
	private Series series;

	@Column(name = "episode_link")
	private String episodeLink;

	@Column(name = "episode_description")
	private String episodeDescription;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getEpisodeNumber() {
		return episodeNumber;
	}

	public void setEpisodeNumber(int episodeNumber) {
		this.episodeNumber = episodeNumber;
	}

	public Series getSeries() {
		return series;
	}

	public void setSeries(Series series) {
		this.series = series;
	}

	public String getEpisodeLink() {
		return episodeLink;
	}

	public void setEpisodeLink(String episodeLink) {
		this.episodeLink = episodeLink;
	}

	public String getEpisodeDescription() {
		return episodeDescription;
	}

	public void setEpisodeDescription(String episodeDescription) {
		this.episodeDescription = episodeDescription;
	}

}
