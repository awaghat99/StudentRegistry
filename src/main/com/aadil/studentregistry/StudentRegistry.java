import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;


public class StudentRegistry {
    private List<Student> students = new ArrayList<>();
    private Set<String> courses = new HashSet<>();
    private Map<String, List<String>> studentCourses = new HashMap<>();
    private Map<String, Integer> courseCount = new HashMap<>();

    public void addStudent(Student student) {
        for (Student pupil : students) {
            if (pupil.getId().equals(student.getId())) {
                throw new IllegalArgumentException("This student already exists");
            }
        }
        students.add(student);
    }

    public void removeStudentById(String id) {
        Iterator<Student> iter = students.iterator();

        while(iter.hasNext()) {
            if (iter.next().getId().equals(id)) {
                iter.remove();
                break;
            }
        }
        List<String> studentCurrentCourses = studentCourses.get(id);

        for (String course : studentCurrentCourses) {
            courseCount.put(course, courseCount.get(course) -1);
        }
        studentCourses.remove(id);
    }

    public List<Student> searchStudentByName(String name) {
        List<Student> nameMatches = new ArrayList<>();

        for (Student pupil : students) {
            if (pupil.getName().toLowerCase().contains(name.toLowerCase())) {
                nameMatches.add(pupil);
            }
        }

        return nameMatches;
    }

    public void enrollStudentInCourse(String studentId, String course) {
        boolean studentExists = students.stream().anyMatch(s -> s.getId().equals(studentId));

        if (!studentExists) {
            throw new IllegalArgumentException("This student is not in the system. Please enroll before trying to add courses.");  
        }

        if (!courses.contains(course)) {
            courses.add(course);
            courseCount.put(course, 1);
        } else {
            courseCount.put(course, courseCount.get(course) + 1);
        }

        List<String> currentCourses = studentCourses.computeIfAbsent(studentId, k -> new ArrayList<>());

        if (!currentCourses.contains(course)) {
            currentCourses.add(course);
        }
    }

    public void removeCourseForStudent(String studentId, String course) {
        studentCourses.get(studentId).remove(course);
        courseCount.put(course, courseCount.get(course) - 1);

        if (courseCount.get(course).equals(0)) {
            courseCount.remove(course);
            courses.remove(course);
        }
    }

    public List<String> getStudentCourses(String studentId) {
        List<String> coursesList = studentCourses.get(studentId);

        if (coursesList == null) {
            return Collections.emptyList();
        }

        return Collections.unmodifiableList(coursesList);
    }

    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

}
