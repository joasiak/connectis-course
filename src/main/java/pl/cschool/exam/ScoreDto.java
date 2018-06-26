package pl.cschool.exam;

import java.time.LocalDate;
import java.util.Locale;

public class ScoreDto {

    private Integer score;
    private LocalDate scoreDate;

    public ScoreDto(Integer score, LocalDate scoreDate) {
        this.score = score;
        this.scoreDate = scoreDate;
    }

    public Integer getScore() {
        return score;
    }

    public LocalDate getScoreDate() {
        return scoreDate;
    }

    @Override
    public String toString() {
        return "ScoreDto{" + score +
                " " + scoreDate +
                '}';
    }
}
