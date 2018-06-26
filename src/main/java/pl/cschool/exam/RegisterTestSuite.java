package pl.cschool.exam;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.*;

import static org.junit.Assert.assertEquals;

public class RegisterTestSuite {

    Student stud1 = new Student("MarcinK");
    Student stud2 = new Student("AniaB");
    Student stud3 = new Student("JuliaM");
    Student stud4 = new Student("JanP");
    Student stud5 = new Student("ZosiaW");

    ScoreDto s1 = new ScoreDto(3,LocalDate.parse("2018-03-27"));
    ScoreDto s2 = new ScoreDto(5,LocalDate.parse("2018-01-17"));
    ScoreDto s3 = new ScoreDto(2,LocalDate.parse("2018-04-18"));
    ScoreDto s4 = new ScoreDto(4,LocalDate.parse("2018-01-22"));
    ScoreDto s5 = new ScoreDto(1,LocalDate.parse("2018-05-05"));
    ScoreDto s6 = new ScoreDto(4,LocalDate.parse("2018-02-14"));

    GroupRegisterManager register = new GroupRegisterManager();

/*
    Set<ScoreDto> scoreSet1 = new HashSet<>();
    Set<ScoreDto> scoreSet2 = new HashSet<>();
    Set<ScoreDto> scoreSet3 = new HashSet<>();
    Set<ScoreDto> scoreSet4 = new HashSet<>();

    Map<Subjects, Set<ScoreDto>> subjSet1 = new HashMap<>();
    Map<Subjects, Set<ScoreDto>> subjSet2 = new HashMap<>();
    Map<Subjects, Set<ScoreDto>> subjSet3 = new HashMap<>();
    Map<Subjects, Set<ScoreDto>> subjSet4 = new HashMap<>();

*/
    @Test
    public void addStudentToGroupTest() {
        register.addStudentToGroup(stud1);
        register.addStudentToGroup(stud2);
        System.out.println(register.getStudents());
        assertEquals(2, register.getStudents().size());
    }

    @Test
    public void addScoreTest() {
        register.addStudentToGroup(stud1);
        register.addStudentToGroup(stud2);
        register.addScore(stud1, Subjects.BIOL, s1);
        register.addScore(stud1, Subjects.BIOL, s2);
        register.addScore(stud1, Subjects.BIOL, s3);
        System.out.println(register.getStudents());
        assertEquals(1, register.getStudents().get(stud1).size());
        assertEquals(3, register.getStudents().get(stud1).get(Subjects.BIOL).size());
    }


    @Test
    public void findAllScoresBetweenTest() {
        register.addStudentToGroup(stud1);
        register.addStudentToGroup(stud2);
        register.addScore(stud1, Subjects.BIOL, s1);
        register.addScore(stud1, Subjects.BIOL, s2);
        register.addScore(stud1, Subjects.BIOL, s3);
        register.addScore(stud1, Subjects.BIOL, s4);
        register.addScore(stud1, Subjects.BIOL, s5);
        register.addScore(stud1, Subjects.MAT, s1);
        register.addScore(stud1, Subjects.MAT, s2);
        register.addScore(stud1, Subjects.MAT, s3);
        System.out.println(register.findAllScoresBetween(stud1, LocalDate.parse("2018-01-01"), LocalDate.parse("2018-03-30")));
        assertEquals(2, register.findAllScoresBetween(stud1, LocalDate.parse("2018-01-01"), LocalDate.parse("2018-03-30")).size());
        assertEquals(3, register.findAllScoresBetween(stud1, LocalDate.parse("2018-01-01"), LocalDate.parse("2018-03-30")).get(Subjects.BIOL).size());
        assertEquals(2, register.findAllScoresBetween(stud1, LocalDate.parse("2018-01-01"), LocalDate.parse("2018-03-30")).get(Subjects.MAT).size());
    }

    @Test
    public void avgScorePerSubjectTest() {
        register.addStudentToGroup(stud1);
        register.addStudentToGroup(stud2);
        register.addScore(stud1, Subjects.BIOL, s1);
        register.addScore(stud1, Subjects.BIOL, s2);
        register.addScore(stud1, Subjects.BIOL, s3);
        register.addScore(stud1, Subjects.MAT, s1);
        register.addScore(stud1, Subjects.MAT, s2);

        System.out.println(register.avgScorePerSubject(stud1));
        Map<Subjects, Double> expectedResult = new HashMap<>();
        expectedResult.put(Subjects.BIOL, 3.3);
        expectedResult.put(Subjects.MAT, 4.0);

        assertEquals(2, register.avgScorePerSubject(stud1).size());
        for (Map.Entry<Subjects, Double> entry : register.avgScorePerSubject(stud1).entrySet()) {
            assertEquals(expectedResult.get(entry.getKey()), entry.getValue(),1);
        }
    }

    @Test
    public void sortByAlphabeticalOrderTest() {
        register.addStudentToGroup(stud1);
        register.addStudentToGroup(stud2);
        register.addStudentToGroup(stud3);
        register.addStudentToGroup(stud4);
        register.addStudentToGroup(stud5);
        register.addScore(stud1, Subjects.BIOL, s1);
        register.addScore(stud1, Subjects.BIOL, s2);
        register.addScore(stud1, Subjects.BIOL, s3);
        register.addScore(stud1, Subjects.MAT, s1);
        register.addScore(stud1, Subjects.MAT, s2);
        System.out.println(register.sortByAlphabeticalOrder());

        List<Student> expectedResult = new ArrayList<>();
        expectedResult.add(stud2);
        expectedResult.add(stud4);
        expectedResult.add(stud3);
        expectedResult.add(stud1);
        expectedResult.add(stud5);
        for (int i=-0; i <register.sortByAlphabeticalOrder().size(); i++) {
            assertEquals(expectedResult.get(i),register.sortByAlphabeticalOrder().get(i));
        }
    }

    @Test
    public void avgPerStudentTest() {
        register.addStudentToGroup(stud1);
        register.addStudentToGroup(stud2);
        register.addScore(stud1, Subjects.BIOL, s1);
        register.addScore(stud1, Subjects.BIOL, s2);
        register.addScore(stud1, Subjects.BIOL, s3);
        register.addScore(stud1, Subjects.MAT, s1);
        register.addScore(stud1, Subjects.MAT, s2);
        register.addScore(stud2, Subjects.HIST, s1);
        register.addScore(stud2, Subjects.HIST, s2);
        register.addScore(stud2, Subjects.JANG, s3);
        register.addScore(stud2, Subjects.JANG, s1);

        System.out.println(register.avgPerStudent());
        Map<Student, Double> expectedResult = new HashMap<>();
        expectedResult.put(stud1, 3.66);
        expectedResult.put(stud2, 3.25);

        for (Map.Entry<Student, Double> entry : register.avgPerStudent().entrySet()) {
            assertEquals(expectedResult.get(entry.getKey()), entry.getValue(), 2);
        }
    }

    @Test
    public void sortByAvgScoreTest() {
        register.addStudentToGroup(stud1);
        register.addStudentToGroup(stud2);
        register.addStudentToGroup(stud3);
        register.addScore(stud1, Subjects.BIOL, s1);
        register.addScore(stud1, Subjects.BIOL, s5);
        register.addScore(stud1, Subjects.BIOL, s3);
        register.addScore(stud1, Subjects.MAT, s4);
        register.addScore(stud1, Subjects.MAT, s2);
        register.addScore(stud2, Subjects.HIST, s2);
        register.addScore(stud2, Subjects.HIST, s4);
        register.addScore(stud3, Subjects.JANG, s3);
        register.addScore(stud3, Subjects.JPOL, s1);
        Map<Student, Double> expectedResult = new HashMap<>();
        expectedResult.put(stud1, 3.25);
        expectedResult.put(stud2, 4.5);
        expectedResult.put(stud3, 2.5);

        System.out.println(register.avgPerStudent());
        System.out.println(register.sortByAvgScore());

        assertEquals(true, expectedResult.equals(register.sortByAvgScore()));
    }

}
