package ch07;

public class AccessExample {
    public void publicMethod() {
        System.out.println("public 메서드");
    }
    protected void protectedMethod() {
        System.out.println("protected 메서드");
    }
    void defaultMethod() {
        System.out.println("default 메서드");
    }
    private void privateMethod() {
        System.out.println("private 메서드");
    }
}
