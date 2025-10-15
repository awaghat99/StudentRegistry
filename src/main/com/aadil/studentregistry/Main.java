public class Main {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();

        // Add some students
        Student s1 = new Student("001", "Alice");
        Student s2 = new Student("002", "Bob");
        registry.addStudent(s1);
        registry.addStudent(s2);

        // Enroll students in courses
        registry.enrollStudentInCourse("001", "Math");
        registry.enrollStudentInCourse("002", "Science");
        registry.enrollStudentInCourse("002", "English");
        registry.enrollStudentInCourse("002", "History");
        registry.enrollStudentInCourse("001", "Science");


        // Print all students and courses
        registry.printAllStudents();
        System.out.println("Alice's courses: " + registry.getStudentCourses("001"));
        System.out.println("Bob's courses: " + registry.getStudentCourses("002"));

        registry.removeCourseForStudent("002", "Math");
        registry.printAllStudents();
    }
}
