package ch07;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(); // 기본 생성자로 객체 생성
        System.out.println(""); // 구분을 위해 추가
        Car myCar = new Car("Hyundai", 2025); // 매개변수가 2개인 생성자로 객체 생성
        System.out.println(""); // 구분을 위해 추가
        Car yourCar = new Car("Kia", 2025, "Black"); // 매개변수가 3개인 생성자로 객체 생성
        yourCar.carInfo();
        System.out.println(""); // 구분을 위해 추가
        Car.countOfCarsInfo(); // 클래스명으로 클래스 메서드 호출

        System.out.println(""); // 구분을 위해 추가

        Car newCar = new Car(250); // 객체 생성
        System.out.println("newCar의 최대 속도: " + newCar.getMaxSpeed());
        newCar.setMaxSpeed(300);
        System.out.println("변경 후 newCar의 최대 속도: " + newCar.getMaxSpeed());
    }
}
