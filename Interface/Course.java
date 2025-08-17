package Interface;

public class Course {
    static int maxCapacity = 100;

    String courseName;
    String[] enrolledStudents;
    int enrollments;

    // Constructor
    Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new String[maxCapacity];
        this.enrollments = 0;
    }

    // Static method to set max capacity
    static void setMaxCapacity(int capacity) {
        maxCapacity = capacity;
    }

    // Enroll student
    void enrollStudent(String studentName) {
        if (enrollments < maxCapacity) {
            enrolledStudents[enrollments++] = studentName;
            System.out.println(studentName + " enrolled in " + courseName);
        } else {
            System.out.println("Cannot enroll " + studentName + ". Course is full.");
        }
    }

    // Unenroll student
    void unenrollStudent(String studentName) {
        boolean found = false;
        for (int i = 0; i < enrollments; i++) {
            if (enrolledStudents[i].equals(studentName)) {
                // Shift remaining students left
                for (int j = i; j < enrollments - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[--enrollments] = null;
                found = true;
                System.out.println(studentName + " has been unenrolled from " + courseName);
                break;
            }
        }
        if (!found) {
            System.out.println(studentName + " is not enrolled in " + courseName);
        }
    }

    // Main class inside the same file
    public static void main(String[] args) {
        // Set max capacity for all courses
        Course.setMaxCapacity(3);

        // Create a course
        Course javaCourse = new Course("Java Programming");

        // Enroll students
        javaCourse.enrollStudent("Alice");
        javaCourse.enrollStudent("Bob");
        javaCourse.enrollStudent("Charlie");

        // Try to enroll beyond capacity
        javaCourse.enrollStudent("David"); // Should print: Course is full

        // Unenroll a student
        javaCourse.unenrollStudent("Bob");

        // Try to unenroll someone not in the course
        javaCourse.unenrollStudent("Eve");

        // Enroll another student after removal
        javaCourse.enrollStudent("David"); // Should now succeed
    }
}
