////public class MyClass {
////    public static void main(String[] args) {
////        int[] a = {1,2,3,4,5};
////        int[] b = test(a, a[4]);
////
////        showArray(a);
////    }
////
////    static int[] test(int[] array, int x) {
////        int [] newArray = array;
////        for (int i =0; i<array.length; i++)
////            newArray[i] *= 2;
////        x=7;
////        return newArray;
////    }
////
////    static void showArray (int[] array) {
////        for (int i =0; i<array.length; i++)
////            System.out.print(array[i] + " ");
////        System.out.println();
////    }
////}
////
////class Class1
////{
////    private int x;
////    private Class2 y;
////
////    private int n;
////    private double[] z;
////
////    public Class1() {
////        x = 2;
////        y = new Class2();
////        n = 3;
////        z = new double [n];
////    }
////
////    public Class1(Class1 other) {
////        x = other.x;
////        y = other.y;
////        z = other.z;
////        n = other.n;
////    }
////
////    public Class2 getY() {
////        return y;
////    }
////    public double[] getZ() {
////        return z;
////    }
////    public String toString() {
////        String s = "" + x + " " + y + " " + n + " ";
////        for (int i = 0; i < n; i++) {
////            s += z[i] + " ";
////        }
////        return s;
////    }
////}
////
////class Class2
////{
////    private int a;
////    private int b;
////
////    public Class2() {
////        a = 11;
////        b = 22;
////    }
////
////    public Class2(Class2 other) {
////        a = other.a;
////        b = other.b;
////    }
////
////    public String toString() {
////        return "" + a + " " + b;
////    }
////}
//
//
//public class MyClass {
////    public static void main(String[] args) {
////        Student s1 = new Student();
////        Student s2 = new Student();
////        System.out.println(s1.method1());
////        System.out.println(s1.method1() + s2.method1());
////    }
//
//    public static void main(String[] args) {
//        Test a = new Test();
//        Test b = new Test(5);
//        Test c = a;
//        Test d = new Test(b);
//        c.setX(7);
//        d.setX(8);
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(c.getBro());
//    }
//
//}
//
//class Test {
//    private int x;
//    private Test bro;
//
//    public Test() { x=0; bro=null;}
//    public Test(int x) {this.x=x; bro=null;}
//    public Test(Test a) {
//        this.x = a.x;
//        if (a.bro != null) {
//            this.bro = new Test(a.bro); // 'bro'를 위해 새로운 Test 객체를 만듭니다.
//        } else {
//            this.bro = null; // 'a.bro'가 null이면 'bro'를 null로 설정합니다.
//        }
//    }
//
//
//    public void setX(int x) {this.x=x;}
//    public Test getBro() {return this.bro;}
//    public String toString() {return ""+x;}
//}
//
////class Student {
////    private String name;
////    private int id;
////    private double grade;
////
////    public Student() {
////        this.name = "John";
////        this.id = 123;
////        this.grade = 3.5;
////    }
////
////
////    public String method1() {
////        return "Hello";
////    }
////}
////
////// 2번
////class Person {
////    private String name;
////    private int age;
////    static String planet ="Earth";
////
////    public Person(String name) {
////        this.name = name;
////    }
////    public Person(String name, int age) {
////        this.name = name;
////        this.age = age;
////    }
////
////    public String toString() {
////        return name + " " + age;
////    }
////
////    public void intro() {
////        System.out.println("I'm living on " + planet);
////    }
////
////    public void setAge(int age) {
////        this.age = age;
////    }
////
////    public String getName() {
////        return name;
////    }
////}

//public class MyClass {
//    public static void main(String args[]) {
//        Base b;
//        Derived d = new Derived();
//
//    }
//}
//
//class Base {
//    protected int x;
//
//    public Base(int x) {
//        this.x = x;
//    }
//    public void set(int x) {
//        this.x = x;
//    }
//}
//
//class Derived extends Base {
//    protected int y;
//
//    public Derived() {
//        super();
//        x = y = 0;
//    }
//    public void set(int x, int y) {
//        this.x = x;
//        this.y = y;
//    }
//}

public class MyClass {
    public static void main(String[] args) {
        ClassY y = new ClassY(4,5);
        System.out.println(y);
    }
}

class ClassX {
    private int x;
    public ClassX(int x) {
        this.x = x;
    }
    public String toString() {
        return "" + x;
    }
}

class ClassY extends ClassX {
    private int y;
    public ClassY(int x, int y) {
        super(x);
        this.y = y;
    }
    public String toString() {
        return super.toString() + " " + y;
    }
}