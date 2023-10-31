public class hw3_01 {
    public static void main(String[] args) {

        // student st1
        Student st1 = new Student();
        st1.setName("John");
        st1.setId(123);
        st1.setGrade(95.0);

        // gradebook gd1
        Gradebook gd1 = new Gradebook();
        gd1.setCourse("Math");
        gd1.setStudent(st1);

        System.out.print("Grade Book1: ");
        printDetails(gd1);

        // student st2
        Student st2 = new Student();
        st2.setName("Jenny");
        st2.setId(456);
        st2.setGrade(86.2);

        // gradebook gd2
        Gradebook gd2 = new Gradebook();
        gd2.setCourse("Eng");
        gd2.setStudent(st2);

        System.out.print("Grade Book2: ");
        printDetails(gd2);

        // student st3
        Student st3 = new Student();
        st3.setName("John");
        st3.setId(123);
        st3.setGrade(95.0);

        // gradebook gd3
        Gradebook gd3 = new Gradebook();
        gd3.setCourse("Math");
        gd3.setStudent(st1);

        System.out.print("Grade Book3: ");
        printDetails(gd3);

        // equal test
        System.out.println("gd1 == gd2 ? " + gd1.equals(gd2));
        System.out.println("gd1 == gd3 ? " + gd1.equals(gd3));
        System.out.println("st1 == st2 ? " + st1.equals(st2));
        System.out.println("st1 == st3 ? " + st1.equals(st3));
    }

    public static void printDetails(Gradebook gd) {
        System.out.println(gd);
    }
}


class Student {
    private String name;
    private int id;
    private double grade;

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }
    public double getGrade() {
        return this.grade;
    }
    public boolean equals(Student other) {
        return this.name.equals(other.name) && this.id == other.id && this.grade == other.grade;
    }
    public String toString() {
        return "Student Name: " + this.name + ", ID: " + this.id + ", Grade: " + this.grade;
    }

}

class Gradebook {
    private String course;
    private Student student;

    public void setCourse(String course) {
        this.course = course;
    }
    public void setStudent(Student student) {
        this.student = student;
    }
    public String getCourse() {
        return this.course;
    }
    public Student getStudent() {
        return this.student;
    }

    public boolean equals(Gradebook other) {
        return this.course.equals(other.course) && this.student.equals(other.student);
    }

    public String toString() {
        return "Course: " + this.course + ", Student: [" + this.student.toString() + "]";
    }
}

