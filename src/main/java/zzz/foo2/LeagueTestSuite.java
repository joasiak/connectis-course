package zzz.foo2;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class LeagueTestSuite {

    LeagueTableController league =  new LeagueTableController();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

    @Before
    public void prepare() {

        //players
        Player player1 = new Player("WojciechSz", 1);
        Player player2 = new Player("GrzegorzK", 10);
        Player player3 = new Player("LukaszP", 20);
        Player player4 = new Player("JakubB", 16);
        Player player5 = new Player("KamilG", 15);
        Player player6 = new Player("RobertL", 9);
        Player player7 = new Player("MichałP", 2);
        Player player8 = new Player("ArkadiuszM", 7);
        Player player9 = new Player("PiotrZ", 19);
        List<Player> team1 = new ArrayList<>();
        team1.add(player1);
        team1.add(player2);
        List<Player> team2 = new ArrayList<>();
        team2.add(player3);
        team2.add(player4);
        List<Player> team3 = new ArrayList<>();
        team3.add(player5);
        team3.add(player6);
        List<Player> team4 = new ArrayList<>();
        team4.add(player7);
        team4.add(player8);
        List<Player> team5 = new ArrayList<>();
        team5.add(player9);
        Team lech = new Team("Lech", team1);
        Team legia = new Team("Legia", team2);
        Team wisla = new Team("Wisla Plock", team3);
        Team lechia = new Team("Lechia Gdansk", team4);
        Team gornik = new Team("Gornik Zabrze", team5 );
/*
        MatchDto match1 = new MatchDto(lech, legia, 2,1, LocalDateTime.parse("2018-05-28 17:00", formatter));
        MatchDto match2 = new MatchDto(legia, wisla, LocalDateTime.parse("2018-04-08 20:00", formatter), MatchResultEnum.WIN);
        MatchDto match3 = new MatchDto(lech, wisla, LocalDateTime.parse("2018-04-19 18:00", formatter), MatchResultEnum.WIN);
        MatchDto match4 = new MatchDto(lech, gornik, LocalDateTime.parse("2018-05-18 16:00", formatter), MatchResultEnum.WIN_IN_EXTRATIME);
        MatchDto match5 = new MatchDto(lechia, lech, LocalDateTime.parse("2018-05-05 19:00", formatter), MatchResultEnum.DRAW);
        MatchDto match6 = new MatchDto(gornik, wisla, LocalDateTime.parse("2018-04-16 20:00", formatter), MatchResultEnum.LOSS_IN_EXTRATIME);
        MatchDto match7 = new MatchDto(wisla, lechia, LocalDateTime.parse("2018-03-29 18:00", formatter), MatchResultEnum.LOSS);
        MatchDto match8 = new MatchDto(lechia, gornik, LocalDateTime.parse("2018-06-14 15:00", formatter), MatchResultEnum.LOSS_IN_EXTRATIME);
        MatchDto match9 = new MatchDto(legia, gornik, LocalDateTime.parse("2018-06-02 17:00", formatter), MatchResultEnum.WIN);
        MatchDto match10 = new MatchDto(lechia, legia, LocalDateTime.parse("2018-03-09 12:30", formatter), MatchResultEnum.DRAW);

        league.add(match1);
        league.add(match2);
        league.add(match3);
        league.add(match4);
        league.add(match5);
        league.add(match6);
        league.add(match7);
        league.add(match8);
        league.add(match9);
        league.add(match10);

        league.teamScoreCalc();
*/
    }

    @Test
    public void findAllMatchesBetweenTest(){
        System.out.println(league.findAllMatchesBetween(LocalDateTime.parse("2018-06-01 12:00", formatter),LocalDateTime.parse("2018-06-25 12:00", formatter)));

    }
    @Test
    public void findMatchesPlayedByGivenTeamTest() {
        System.out.println(league.findMatchesPlayedByGivenTeam("Legia"));
    }


    @Test
    public void sortByTeamScoreTest() {
        System.out.println(league.sortByTeamScore());

    }
}
