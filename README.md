# SpringBootQAP3
SpringBoot project for Software Architecture, Design, and Testing

## Project Setup
Java Version 11

## Dependencies:
  - spring-boot-starter-web
  - spring-boot-starter-data-rest
  - spring-boot-dev-tools
  - spring-boot-starter-test
  - sping-boot-starter-jpa
  - h2
  - mysql
  - spring-boot-maven-plugin

## Application.properties
- Database name: golf_club
- Datasource driver class: com.mysql.jdbc.Driver

## Supported Search APIs
### Member
- http://localhost:8080/member
- http://localhost:8080/member/{id}
- http://localhost:8080/member/search
- http://localhost:8080/member/search/findByMemberLastName{?memberLastName}
- http://localhost:8080/member/search/findByMemberFirstName{?memberAddress}
- http://localhost:8080/member/search/findByMemberEmail{?memberEmail}
- http://localhost:8080/member/search/findByMembershipStartDate{?membershipStartDate}
- http://localhost:8080/member/search/findByMembershipDuration{?membershipDuration}
- http://localhost:8080/member/search/findByMembershipType{?membershipType}
- http://localhost:8080/member/{id}/tournaments

## Tournament
- http://localhost:8080/tournament/
- http://localhost:8080/tournament/{id}
- http://localhost:8080/tournament/search
- http://localhost:8080/tournament/search/findByTournamentStartDate{?tournamentStartDate}
- http://localhost:8080/tournament/search/findByTournamentEndDate{?tournamentEndDate}
- http://localhost:8080/tournament/search/findByTournamentLocation{?tournamentLocation}
- http://localhost:8080/tournament/search/findByTournamentCashPrizeAmount{?tournamentCashPrizeAmount}
