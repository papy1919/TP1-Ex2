public class Course {
    int courseId;
    String courseName;
    Instructor instructor;

    public Course(int courseId, String courseName, Instructor instructor) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
    }

    public int getCourseId() {
        return this.courseId;
    }

    public String getCourseName() {
        return this.courseName;
    }

    public Instructor getInstructor() {
        return this.instructor;
    }
}
