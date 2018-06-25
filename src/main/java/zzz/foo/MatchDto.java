package zzz.foo;

import java.time.LocalDateTime;

public class MatchDto {
    private Team teamA;
    private Team teamB;
    private LocalDateTime matchDate;
    private MatchResultEnum matchResultTeamAvsTeamB;

    public MatchDto(Team teamA, Team teamB, LocalDateTime matchDate, MatchResultEnum matchResult) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.matchDate = matchDate;
        this.matchResultTeamAvsTeamB = matchResult;
    }

    public Team getTeamA() {
        return teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public LocalDateTime getMatchDate() {
        return matchDate;
    }

    public MatchResultEnum getMatchResultTeamAvsTeamB() {
        return matchResultTeamAvsTeamB;
    }

    public void setMatchResultTeamAvsTeamB(MatchResultEnum matchResultTeamAvsTeamB) {
        this.matchResultTeamAvsTeamB = matchResultTeamAvsTeamB;
    }


    @Override
    public String toString() {
        return "MatchDto{" +
                "teamA=" + teamA +
                ", teamB=" + teamB +
                ", matchDate=" + matchDate +
                ", matchResultTeamAvsTeamB=" + matchResultTeamAvsTeamB +
                '}';
    }
}
