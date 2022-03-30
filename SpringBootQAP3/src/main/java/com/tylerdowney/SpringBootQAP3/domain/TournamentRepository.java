package com.tylerdowney.SpringBootQAP3.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tournament", path = "tournament")
public interface TournamentRepository extends JpaRepository<Tournament, Long> {
    List<Tournament> findByTournamentStartDate(@Param("tournamentStartDate") String tournamentStartDate);
    List<Tournament> findByTournamentEndDate(@Param("tournamentEndDate") String tournamentEndDate);
    List<Tournament> findByTournamentLocation(@Param("tournamentLocation") String tournamentLocation);
    List<Tournament> findByTournamentCashPrizeAmount(@Param("tournamentCashPrizeAmount") double tournamentCashPrizeAmount);
}
