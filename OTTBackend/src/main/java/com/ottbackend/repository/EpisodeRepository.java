package com.ottbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ottbackend.model.Episode;

@Repository
public interface EpisodeRepository extends JpaRepository<Episode, Integer>{

}
