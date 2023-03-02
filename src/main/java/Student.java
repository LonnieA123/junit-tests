import java.util.ArrayList;
import java.util.List;

public class Student {

    protected long id;
    protected String name;
    protected ArrayList<Integer> grades;

    public Student(long id, String name){
        this.id = id;
        this.name = name;
        this.grades = new ArrayList<>();
    }



    // returns the student's id
    public long getId(){
        return this.id;
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }

    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }

    // returns the list of grades
    public List<Integer> getGrades(){
        return this.grades;
    }

    // returns the average of the students grades
    public double getGradeAverage(){
    double sum = 0;

    for (double grade: getGrades()){
        sum += grade;
    }
        return sum/getGrades().size();
    }


    public static void main(String[] args) {
       Student me = new Student(123,"lonnie");
        me.addGrade(1);
        me.addGrade(2);
        me.addGrade(2);
        System.out.println(me.getGrades());
        System.out.println(me.getGradeAverage());
    }

}
