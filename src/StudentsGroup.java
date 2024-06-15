import java.util.ArrayList;
import java.util.List;

public class StudentsGroup {
    private Student headman;
    private List<Student> students;
    private List<String> tasks;

    public StudentsGroup(Student headman) {
        if (headman != null) {
            this.headman = headman;
        } else {
            this.headman = new Student(0, "Headman", "Headman");
        }
        this.students = new ArrayList<>();
        this.tasks = new ArrayList<>();
    }

    public void changeHeadman(Student newHeadman) {
        if (newHeadman != null) {
            this.headman = newHeadman;
        }
    }

    public void addStudent(Student student) {
        if (student != null) {
            students.add(student);
        }
    }

    public void removeStudent(Student student) {
        students.remove(student);
    }

    public void addTask(String task) {
        if (task != null && !task.isEmpty()) {
            tasks.add(task);
        }
    }

    public void markTaskAsCompleted(Student student, String task) {
        if (students.contains(student)) {
            tasks.remove(task);
        }
    }

    public Student getHeadman() {
        return headman;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getTasks() {
        return tasks;
    }
}
