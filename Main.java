
public class Main {
    public static void main(String[] args) {

        Instructor instructor1 = new Instructor(1, "John", "Smith");
        Instructor instructor2 = new Instructor(2, "Michael", "Scofield");


        Course course1 = new Course(101, "Mathematics", instructor1);
        Course course2 = new Course(102, "Physics", instructor2);


        Student student1 = new Student(1, "Ahmed", "Amine");
        Student student2 = new Student(2, "Bob", "Marley");


        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course2);


        System.out.println("Student 1 ID: " + student1.getStudentId());
        System.out.println("Student 1 Name: " + student1.getFirstName() + " " + student1.getLastName());

        System.out.println("Student 2 ID: " + student2.getStudentId());
        System.out.println("Student 2 Name: " + student2.getFirstName() + " " + student2.getLastName());

    }
}