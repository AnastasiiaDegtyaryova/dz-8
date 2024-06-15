public class Main {
    public static void main(String[] args) {
        Student headman = new Student(1, "John", "Doe");
        StudentsGroup group = new StudentsGroup(headman);

        group.addStudent(new Student(2, "Anna", "Black"));
        group.addStudent(new Student(3, "Bob", "Smith"));
        group.addStudent(new Student(4, "Mary", "White"));

        group.addTask("Make task 1");
        group.addTask("Make task 2");
        group.addTask("Make task 3");

        System.out.println("State before changes:");
        System.out.println("Headman: " + group.getHeadman());
        System.out.println("Students: " + group.getStudents());
        System.out.println("Tasks: " + group.getTasks());

        group.changeHeadman(new Student(2, "Anna", "Black"));
        group.markTaskAsCompleted(new Student(3, "Bob", "Smith"), "Make task 2");

        Student studentToRemove = new Student(4, "Mary", "White");
        group.removeStudent(studentToRemove);

        System.out.println("State after changes:");
        System.out.println("Headman: " + group.getHeadman());
        System.out.println("Students: " + group.getStudents());
        System.out.println("Tasks: " + group.getTasks());

    }
}


