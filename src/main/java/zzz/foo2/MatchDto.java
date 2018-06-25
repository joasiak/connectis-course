package zzz.foo2;

import java.time.LocalDateTime;
import java.util.List;

public class MatchDto {
    private Team teamA;
    private Team teamB;
    private List<Goal> goalTeamA;
    private List<Goal> goalTeamB;
    private LocalDateTime matchDate;

    public MatchDto(Team teamA, Team teamB, List<Goal> goalTeamA, List<Goal> goalTeamB, LocalDateTime matchDate) {
        this.teamA = teamA;
        this.teamB = teamB;
        this.goalTeamA = goalTeamA;
        this.goalTeamB = goalTeamB;
        this.matchDate = matchDate;
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

    @Override
    public String toString() {
        return "MatchDto{" +
                "teamA=" + teamA +
                ", teamB=" + teamB +
                ", matchDate=" + matchDate +
                '}';
    }
}
