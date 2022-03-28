package com.tylerdowney.SpringBootQAP3.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
}
