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

    

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Teacher getTeacher() {
        return teacher;
    }
}
