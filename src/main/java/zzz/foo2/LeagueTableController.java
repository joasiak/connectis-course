package zzz.foo2;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LeagueTableController implements DbService {

    private List<MatchDto> leagueTable = new ArrayList<>();

    public void add(MatchDto match) {
        leagueTable.add(match);
    }

    @Override
    public void teamScoreCalc() {
        for (MatchDto list : leagueTable) {

        }
    }

    @Override
    public List<MatchDto> findAllMatchesBetween(LocalDateTime startDate, LocalDateTime endDate) {
        return leagueTable.stream().filter(s->s.getMatchDate().isAfter(startDate) && s.getMatchDate().isBefore(endDate)).
                collect(Collectors.toList());
    }

    @Override
    public List<MatchDto> findMatchesPlayedByGivenTeam(String teamName) {
        return leagueTable.stream().filter(s->s.getTeamA().getTeamName().equals(teamName) || s.getTeamB().getTeamName().equals(teamName))
                .collect(Collectors.toList());
    }

    @Override
    public List<Team> sortByTeamScore() {
        List<Team> teamList = new ArrayList<>();
        for (MatchDto list : leagueTable) {
            if (!teamList.contains(list.getTeamA()))
            teamList.add(list.getTeamA());
            if (!teamList.contains(list.getTeamB()))
            teamList.add(list.getTeamB());
        }
        Collections.sort(teamList);
        return teamList;
    }
}



