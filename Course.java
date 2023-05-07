public class Course {
    private String name;
    private int capacity;
    private int enrolled;
    private Student[] students;
    
    public Course(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.enrolled = 0;
        this.students = new Student[capacity];
    }
    
    public String getName() {
        return name;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    public int getEnrolled() {
        return enrolled;
    }
    
    public boolean enroll(Student student) {
        if (enrolled < capacity) {
            students[enrolled] = student;
            enrolled++;
            return true;
        } else {
            return false;
        }
    }
    public Student[] getEnrolledStudents() {
        return students;
    }
    public boolean deleteStudent(int id) {
        for (int i = 0; i < enrolled; i++) {
            if (students[i].getId() == id) {
                // Shift all students after the deleted student to the left
                for (int j = i; j < enrolled - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[enrolled - 1] = null;
                enrolled--;
                return true;
            }
        }
        return false; // Student not found
    }
    public Student findStudentById(int id) {
        for (int i = 0; i < enrolled; i++) {
            if (students[i] != null && students[i].getId() == id) {
                return students[i];
            }
        }
        return null;
    }

}
