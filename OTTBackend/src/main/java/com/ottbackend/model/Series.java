package com.ottbackend.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "series")
public class Series {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "total_episodes")
	private int totalEpisodes;

	@Column(name = "category")
	private String category;

	@Column(name = "series_name")
	private String seriesName;

	@Column(name = "series_description",length = 500)
	private String seriesDescription;

	@Column(name = "series_poster")
	private String seriesPoster;

	@JsonManagedReference
	@OneToMany(mappedBy = "series",cascade = CascadeType.ALL, orphanRemoval = true,fetch = FetchType.EAGER)//, 
	private List<Episode> episodeList;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotalEpisodes() {
		return totalEpisodes;
	}

	public void setTotalEpisodes(int totalEpisodes) {
		this.totalEpisodes = totalEpisodes;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getSeriesName() {
		return seriesName;
	}

	public void setSeriesName(String seriesName) {
		this.seriesName = seriesName;
	}

	public String getSeriesDescription() {
		return seriesDescription;
	}

	public void setSeriesDescription(String seriesDescription) {
		this.seriesDescription = seriesDescription;
	}

	public String getSeriesPoster() {
		return seriesPoster;
	}

	public void setSeriesPoster(String seriesPoster) {
		this.seriesPoster = seriesPoster;
	}

	public List<Episode> getEpisodeList() {
		return episodeList;
	}

	public void setEpisodeList(List<Episode> episodeList) {
		this.episodeList = episodeList;
	}

}
