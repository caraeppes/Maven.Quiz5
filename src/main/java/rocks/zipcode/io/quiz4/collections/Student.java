package rocks.zipcode.io.quiz4.collections;

/**
 * @author leon on 11/12/2018.
 */
public class Student implements Comparable {

    private Integer id;
    private Double totalStudyTime;

    public Student() {
        this(null);
    }

    public Student(Integer id) {
        this.id = id;
        this.totalStudyTime = 0.0;
    }

    public void learn(Double amountOfHours) {
        totalStudyTime += amountOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

    @Override
    public int compareTo(Object o) {
        if((this. id != null) && ((Student)o).id != null) {
            return this.id - ((Student) o).id;
        }else{
            return (int)(((Student)o).totalStudyTime - this.totalStudyTime);
        }
    }
}
