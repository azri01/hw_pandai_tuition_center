import java.util.ArrayList;

public class StudentBatch {
    private ArrayList<Student> students;
    private Teacher teacher;
    private int currSz;
    private int maxSize;

    public StudentBatch(Teacher teacher, int maxSize) {
        this.teacher = teacher;
        this.maxSize = maxSize;
        this.currSz = 0;
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        if (currSz < maxSize) {
            students.add(student);
            currSz++;
            System.out.println("Tutor " + teacher.getName().getFirstName() + " is assigned to " + student.getName().getFirstName());
        } else {
            System.out.println("Batch is full, cannot add student.");
        }
    }

    /*
    public Student findStudent(String name) {
        for (Student student : students) {

            if (student.getName().getFirstName().equals(name)) {

                System.out.println(student.getName().getFirstName() + " is in this batch.");
                return student;
            }
        }

        System.out.println(name + " is not in this batch.");
        return null;
    }*/

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
