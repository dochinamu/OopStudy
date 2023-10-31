public class hw6_1 {
    public static void main(String[] args) {
        Student s1 = new Student("John");
        Student s2 = new Student("Jane");

        s1.fillGrade(new int[][] {{4,3,2},{4,4,3,3}});
        s2.fillGrade(new int[][] {{3,2}, {4,4,4,2,1}});

        System.out.println(s1);
        System.out.println(s2);

    }
}
class Student {
    private String name;
    private int[][] grade;

    public Student() {}

    public Student(String name) {
        this.name = name;
        this.grade = new int[2][];

    }

    public void fillGrade(int[][] grade) {
        for (int row=0; row<grade.length; row++) {
            this.grade[row] = new int[grade[row].length];
            for (int col=0; col<grade[row].length; col++) {
                this.grade[row][col] = grade[row][col];
            }
        }


    }

    public double computeAverage(int[] a) {
        double total=0;
        for (int element: a) {
            total += element;
        }
        if (a.length==0) {
            System.exit(0);
        }
        return (total/a.length);
    }




    public String toString() {
        return "Student Name: " + name + "\nGPA for semester 1: " + computeAverage(grade[0]) +
                "\nGPA for semester 2: " + computeAverage(grade[1]);
    }

}