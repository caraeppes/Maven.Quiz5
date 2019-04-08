package rocks.zipcode.io.quiz4.collections;

import java.util.*;

/**
 * @author leon on 11/12/2018.
 */
public class ZipCodeWilmington {

    private List<Student> students;
    private Map<Student, Double> studyMap;

    public ZipCodeWilmington(){
        students = new ArrayList<>();
        studyMap = new TreeMap<>();
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public Boolean isEnrolled(Student student) {
        return students.contains(student);
    }

    public void lecture(double numberOfHours) {
        for(Student s : students){
            s.learn(numberOfHours);
        }
    }

    public Map<Student, Double> getStudyMap() {
        for(Student s : students){
            studyMap.put(s, s.getTotalStudyTime());
        }
        return studyMap;
    }
}
