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
    private double tournamentCachPrizeAmount;
    private List<Member> tournamentMembers;
}
