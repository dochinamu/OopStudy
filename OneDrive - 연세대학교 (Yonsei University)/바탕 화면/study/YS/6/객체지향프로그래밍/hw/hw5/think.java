public class think {
    public static void main(String[] args) {
        class Person { }
        class Student extends Person { }
        class RegisteredStudent extends Student { }

        Person p = new Person();
        Student s = new Student();
        RegisteredStudent r = new RegisteredStudent();

        System.out.println(s instanceof Object);
        System.out.println(p instanceof RegisteredStudent);
        System.out.println(r instanceof Person);
        System.out.println(s instanceof Person);
    }
}

