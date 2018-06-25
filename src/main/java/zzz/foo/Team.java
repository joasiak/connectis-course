package zzz.foo;

import java.util.ArrayList;
import java.util.List;

public class Team implements Comparable<Team> {
    private String teamName;
    private List<Player> players = new ArrayList<>();
    private int teamScore;

    public Team(String teamName, List<Player> players) {
        this.teamName = teamName;
        this.players = players;
    }

    public String getTeamName() {
        return teamName;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public int getTeamScore() {
        return teamScore;
    }

    public void setTeamScore(int teamScore) {
        this.teamScore = teamScore;
    }

    @Override
    public int compareTo(Team o) {
        return o.getTeamScore()-teamScore;
    }

    @Override
    public String toString() {
        return "Team{"+ teamName +
                ", teamScore=" + teamScore +
                '}';
    }
}
