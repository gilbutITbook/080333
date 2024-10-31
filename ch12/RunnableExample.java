package ch12;

public class RunnableExample {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("run!");
        runnable.run();
    }
}
