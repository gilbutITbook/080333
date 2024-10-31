package ch07;

public class Car {
    // 클래스 변수
    static int countOfCars = 0; // 자동차 수량
    // 인스턴스 변수
    private String brand; // 브랜드
    private int year; // 연식
    private String color; // 색

    private int maxSpeed; // 최대 속도
    private String carNumber; // 차량번호

    // 기본 생성자
    public Car() {
        System.out.println("새로운 자동차 객체가 생성됐습니다.");
        this.carInfo();
        countOfCars++; // 객체가 생성될 때마다 자동차 수 1 증가
        countOfCarsInfo(); // 자동차 수량 확인 메서드 호출
    }

    // 매개변수가 1개 있는 생성자
    public Car(int maxSpeed) {
        this.maxSpeed =  maxSpeed;
        countOfCars++;
    }

    // 매개변수가 2개인 생성자
    public Car(String brand, int year) {
        System.out.println("새로운 자동차 객체가 생성됐습니다.");
        this.brand = brand;
        this.year = year;
        this.color = "white";
        this.carInfo();
        countOfCars++; // 객체가 생성될 때마다 자동차 수 1 증가
        countOfCarsInfo(); // 자동차 수량 확인 메서드 호출
    }
    // 매개변수가 3개인 생성자
    public Car(String brand, int year, String color) {
        System.out.println("새로운 자동차 객체가 생성됐습니다.");
        this.brand = brand;
        this.year = year;
        this.color = color;
        countOfCars++; // 객체가 생성될 때마다 자동차 수 1 증가
        countOfCarsInfo(); // 자동차 수량 확인 메서드 호출
    }

    // 인스턴스 메서드
    public void carInfo() {
        System.out.println("--- 자동차 정보 ---" );
        System.out.println("브랜드: " + brand);
        System.out.println("연식: " + year);
        System.out.println("색: " + color);
        //System.out.println("최대 속도: " + this.maxSpeed);
    }

    // 클래스 메서드
    public static void countOfCarsInfo() {
        System.out.println("자동차 수량: " + countOfCars);
    }


    // 게터 메서드
    public int getMaxSpeed() {
        return maxSpeed;
    }
    // 세터 메서드
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
