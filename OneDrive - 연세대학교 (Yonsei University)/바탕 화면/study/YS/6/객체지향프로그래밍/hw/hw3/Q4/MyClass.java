package Q4;

public class MyClass {
//    public static void main(String[] args) {
//        Student s1 = new Student();
//        Student s2 = new Student();
//        System.out.println(s1.method1());
//        System.out.println(s1.method1() + s2.method1());
//    }

    public static void main(String[] args) {
        Test a = new Test();
        Test b = new Test(5);
        Test c = a;
        Test d = new Test(b);
        c.setX(7);
        d.setX(8);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(c.getBro());
    }

}

class Test {
    private int x;
    private Test bro;

    public Test() { x=0; bro=null;}
    public Test(int x) {this.x=x; bro=null;}
    public Test(Test a) {this.x=a.x; bro= new Test(a.bro);}
    public void setX(int x) {this.x=x;}
    public Test getBro() {return this.bro;}
    public String toString() {return ""+x;}
}

//class Student {
//    private String name;
//    private int id;
//    private double grade;
//
//    public Student() {
//        this.name = "John";
//        this.id = 123;
//        this.grade = 3.5;
//    }
//
//
//    public String method1() {
//        return "Hello";
//    }
//}
//
//// 2번
//class Person {
//    private String name;
//    private int age;
//    static String planet ="Earth";
//
//    public Person(String name) {
//        this.name = name;
//    }
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public String toString() {
//        return name + " " + age;
//    }
//
//    public void intro() {
//        System.out.println("I'm living on " + planet);
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//}