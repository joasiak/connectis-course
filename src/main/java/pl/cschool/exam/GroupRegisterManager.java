package pl.cschool.exam;

import java.time.LocalDate;
import java.util.*;

public class GroupRegisterManager implements GroupStats {

    private Map<Student, Map<Subjects, Set<ScoreDto>>> students = new HashMap<>();

    @Override
    public void addStudentToGroup(Student student) {
        if (!students.containsKey(student))
            students.put(student, new HashMap<Subjects, Set<ScoreDto>>());
    }

    @Override
    public void addScore(Student student, Subjects subject, ScoreDto score) {
        if (students.containsKey(student)) {
            if (!students.get(student).containsKey(subject)) {
                students.get(student).put(subject, new HashSet<ScoreDto>());
            }
                students.get(student).get(subject).add(score);
        }
    }

    @Override
    public Map<Subjects, Set<ScoreDto>> findAllScoresBetween(Student student, LocalDate startDate, LocalDate endDate) {
        Map<Subjects, Set<ScoreDto>> map = new HashMap<>();
        for (Subjects subj : students.get(student).keySet()) {
            map.put(subj, new HashSet<>());
            for (ScoreDto score : students.get(student).get(subj)) {
                if (score.getScoreDate().isAfter(startDate) && score.getScoreDate().isBefore(endDate)) {
                    map.get(subj).add(score);
                }
            }
        }
        return map;
    }

    @Override
    public Map<Subjects, Double> avgScorePerSubject(Student student) {
        Map<Subjects, Double> map = new HashMap<>();
        for (Subjects subj : students.get(student).keySet()) {
            int sum=0;
            for (ScoreDto score : students.get(student).get(subj)) {
                sum+=score.getScore();
            }
            map.put(subj, (double) sum/students.get(student).get(subj).size());
        }
        return map;
    }

    @Override
    public List<Student> sortByAlphabeticalOrder() {
      //  Map.Entry<Student, Map<Subjects, Set<ScoreDto>>> entry = (Entry<Student, Map<Subjects, Set<ScoreDto>>) new HashMap<>().entrySet();
        List<Student> list = new ArrayList<>();
        for ( Map.Entry<Student, Map<Subjects, Set<ScoreDto>>> entry : students.entrySet()) {
            list.add(entry.getKey());
        }
        Collections.sort(list);
        return list;
    }

    public Map<Student, Double> avgPerStudent() {
        Map<Student, Double> result  = new HashMap<>();
        for (Student stud : students.keySet()) {
            double sum = 0;
            for (Map.Entry<Subjects, Double> entry : avgScorePerSubject(stud).entrySet()) {
                sum+=entry.getValue();
            }
            result.put(stud, (double) sum / avgScorePerSubject(stud).size());
        }
        return result;
    }

    @Override
    public Map<Student, Double> sortByAvgScore() {
        sortByValues(avgPerStudent());

        return sortByValues(avgPerStudent());
    }


    private static HashMap sortByValues(Map map) {
        List list = new LinkedList(map.entrySet());
        // Defined Custom Comparator here
        Collections.sort(list, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Comparable) ((Map.Entry) (o2)).getValue())
                        .compareTo(((Map.Entry) (o1)).getValue());
            }
        });

        // Here I am copying the sorted list in HashMap
        // using LinkedHashMap to preserve the insertion order
        HashMap sortedHashMap = new LinkedHashMap();
        for (Iterator it = list.iterator(); it.hasNext();) {
            Map.Entry entry = (Map.Entry) it.next();
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        return sortedHashMap;
    }



    public Map<Student, Map<Subjects, Set<ScoreDto>>> getStudents() {
        return students;
    }

    @Override
    public String toString() {
        return "GroupRegisterManager{" +
                "students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupRegisterManager that = (GroupRegisterManager) o;
        return Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {

        return Objects.hash(students);
    }
}
