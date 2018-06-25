package zzz.foo;

import java.time.LocalDateTime;
import java.util.List;

public interface DbService {

    void teamScoreCalc();
    List<MatchDto> findAllMatchesBetween(LocalDateTime startDate, LocalDateTime endDate);
    List<MatchDto> findMatchesPlayedByGivenTeam(String teamName);
    List<Team> sortByTeamScore();
}
