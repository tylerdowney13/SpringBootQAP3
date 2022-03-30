package com.tylerdowney.SpringBootQAP3.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Tournament {
    // Initialize ID
    @Id
    @GeneratedValue
    private long id;

    // Initialize other instance variables
    private String tournamentStartDate;
    private String tournamentEndDate;
    private String tournamentLocation;
    private double tournamentCashPrizeAmount;

    // Getters and Setters

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTournamentStartDate() {
        return tournamentStartDate;
    }

    public void setTournamentStartDate(String tournamentStartDate) {
        this.tournamentStartDate = tournamentStartDate;
    }

    public String getTournamentEndDate() {
        return tournamentEndDate;
    }

    public void setTournamentEndDate(String tournamentEndDate) {
        this.tournamentEndDate = tournamentEndDate;
    }

    public String getTournamentLocation() {
        return tournamentLocation;
    }

    public void setTournamentLocation(String tournamentLocation) {
        this.tournamentLocation = tournamentLocation;
    }

    public double getTournamentCashPrizeAmount() {
        return tournamentCashPrizeAmount;
    }

    public void setTournamentCashPrizeAmount(double tournamentCashPrizeAmount) {
        this.tournamentCashPrizeAmount = tournamentCashPrizeAmount;
    }
}
