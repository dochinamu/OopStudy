public class MyClass {
    public static void main(String[] args) {
        ClassA a = new ClassA(5);
        ClassB b = new ClassB(7);
        computeTest(a, 8);
        computeTest(b, 8);
    }

    static void computeTest(ClassA a, int k) {
        System.out.println(a.compute(k));
    }


}

class ClassA {
    protected int x;
    public ClassA(int x) {
        this.x = x;
    }
    public int compute(int k) {
        return x + k;
    }
}

class ClassB extends ClassA{
    private int y;
    public ClassB(int y) {
        super(y);
        this.y = y;
    }

    public int compute(int k) {
        return x * y * k;
    }
}
