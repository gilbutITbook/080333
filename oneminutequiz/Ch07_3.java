package oneminutequiz;

public class Ch07_3 {
    public static void main(String[] args) {
        NewCar newCar = new NewCar("서울0가1111"); // 객체 생성
        System.out.println("newCar의 차량번호: " + newCar.getCarNumber());
        newCar.setCarNumber("서울1가1111");
        System.out.println("변경 후 newCar의 차량번호: " + newCar.getCarNumber());
    }
}

class NewCar {
    private String carNumber; // 차량번호
    // 생성자
    public NewCar(String carNumber) {
        this.carNumber = carNumber;
    }
    // 게터 메서드
    public String getCarNumber()  {
        return carNumber;
    }
    // 세터 메서드
    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }
}

