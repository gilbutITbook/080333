package ch08;

// Animal 클래스 상속
public class Dog extends Animal {
    String breed; // Dog 클래스에만 있는 필드

    // Dog 클래스에만 있는 메서드
    public void roll() {
        System.out.println(name + "가 바닥을 구릅니다."); // 부모 클래스의 name 필드 사용
    }

    // 8.2.2 메서드 오버로딩
    public void roll(int times) {
        System.out.println(name + "가 바닥을 " + times + "번 구릅니다."); // 부모 클래스의 name 필드 사용
    }



    // 8.2.4 super
    // Dog 클래스의 생성자
   public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
        System.out.println("품종: " + this.breed);
    }

    // 자식 클래스의 필드(부모 클래스와 동일한 이름)
    //String name = "강아지";
    public void displayNames() {
        System.out.println("자식 클래스 name: " + this.name);  // Dog 클래스의 name 필드
        System.out.println("부모 클래스 name: " + super.name);  // Animal 클래스의 name 필드
    }
}
