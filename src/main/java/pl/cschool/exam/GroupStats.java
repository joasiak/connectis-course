package pl.cschool.exam;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public interface GroupStats {

    void addStudentToGroup(Student student);
    void addScore(Student student, Subjects subject, ScoreDto score);
    Map<Subjects, Set<ScoreDto>> findAllScoresBetween(Student student,LocalDate startDate, LocalDate endDate);
    Map<Subjects, Double> avgScorePerSubject(Student student);
    List<Student> sortByAlphabeticalOrder();
    Map<Student, Double> sortByAvgScore();
}
