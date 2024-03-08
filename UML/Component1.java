abstract class ParentClass {
    int field1;
    static char field2;

    abstract void methodA();

    double methodB() {
        // 구현 내용
        return 0.0;
    }
}

class ChildClass extends ParentClass {
    void methodA() {
        // 구현 내용
    }

    void methodC() {
        // 구현 내용
    }
}