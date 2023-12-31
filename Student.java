import java.util.ArrayList;

public class Student {
    // Attributes:
    int studentId;
    String firstName;
    String lastName;
    ArrayList<Course> courses=new ArrayList<Course>();


    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Methods:
    public int getStudentId() {
        return this.studentId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public ArrayList getCourses() {
        return this.courses;
    }

    public void enroll(Course course) {
        this.courses.add(course);
    }


}
