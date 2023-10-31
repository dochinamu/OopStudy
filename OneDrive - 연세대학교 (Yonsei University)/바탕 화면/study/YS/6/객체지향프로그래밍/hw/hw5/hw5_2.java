public class hw5_2 {
    public static void main(String[] args) {

        // create a classroom of capacity 5 (students)
        Classroom classroom = new Classroom(5);

        Student student1 = new Student("John", false);
        Student student2 = new Student("Jane", false);
        Student student3 = new Student("Mike", false);

        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);

        classroom.markAttendance("John", true);  // John attended
        classroom.markAttendance("Jane", false); // Jane did not attend
        classroom.markAttendance("Mike", true);  // Mike attended

        Student[] studentArray = classroom.getStudents();

        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];
            if (student != null) {
                System.out.println(student);
            }
        }
    }
}

class Student {
    private String name;
    private boolean attended;

    public Student() {}

    public Student(String name, boolean attended) {
        this.name = name;
        this.attended = attended;
    }

    public Student(Student otherStudent) {
        if (otherStudent == null) {
            System.exit(0);
        }
        this.name = otherStudent.name;
        this.attended = otherStudent.attended;
    }

    public String getName() {
        return name;
    }
    public void setName() {
        this.name = name;
    }

    public boolean isAttended() {
        return attended;
    }

    public void setAttended(boolean attended) {
        this.attended = attended;
    }

    public String toString() {
        return "[Student] name(" + name + ") attended(" + attended + ")";
    }
}

class Classroom {
    private Student[] students;
    private int studentCount;

    public Classroom() {}

    public Classroom(int capacity) {
        students = new Student[capacity];
        studentCount = 0;
    }
    public void addStudent(Student student) {
        if (studentCount < students.length) {
            students[studentCount] = new Student(student);
            studentCount++;
        }
    }

    public void markAttendance(String name, boolean attended) {
        for (int i =0; i < students.length; i++) {

            if (students[i].getName().equals(name)) {
                students[i].setAttended((attended));
                break;
            }
        }
    }

    public Student[] getStudents() {
        Student[] temp = new Student[students.length];
        for (int i = 0; i< students.length; i++) {
            if (students[i] != null)
                temp[i] = new Student(students[i]);
        }
        return temp;
    }



}


