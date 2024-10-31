package ch08;

public class Main {
    public static void main(String[] args) {

      // 8.1 상속
/*
        Dog myDog = new Dog(); // 강아지 객체 생성
        Cat myCat = new Cat(); // 고양이 객체 생성

        // Dog 클래스 필드 초기화
        myDog.breed = "진돗개";
        myDog.name = "바둑이";
        myDog.age = 3;
        System.out.println(myDog.name + "는 " + myDog.breed + "이고, " + myDog.age + "살입니다.");

        // Cat 클래스 필드 초기화
        myCat.name = "나비";
        myCat.age = 2;
        System.out.println(myCat.name + "는 " + myCat.age + "살입니다.");
*/

/*
        Dog myDog = new Dog("바둑이", 3, "진돗개" ); // 강아지 객체 생성
        Cat myCat = new Cat("나비", 2 ); // 고양이 객체 생성
        System.out.println(myDog.name + "는 " + myDog.breed + "이고, " + myDog.age + "살입니다.");
*/

/*
        // 8.2.1 메서드 오버라이딩
        myDog.eat();
        myDog.roll();
        myCat.eat();
        myCat.rub();

        // 8.2.2 메서드 오버라이딩
        myDog.eat();
        myDog.roll(2);
        myCat.eat();
        myCat.rub();
*/

/*
      // 8.2.3 형변환
        Animal myAnimal = new Dog();
        myAnimal.name = "바둑이";
        myAnimal.eat(); // Animal 클래스의 eat() 메서드 호출
        Dog myDog = (Dog)myAnimal;
        myDog.roll();
        myAnimal = new Cat();
        myAnimal.name = "나비";
        myAnimal.eat(); // Cat 클래스의에 eat() 메서드 호출
        Cat myCat = (Cat)myAnimal;
        myCat.rub();

*/


        // 8.2.4 super
        Dog myDog = new Dog("바둑이", 3, "진돗개" ); // 강아지 객체 생성
        Cat myCat = new Cat("나비", 2 ); // 고양이 객체 생성
        myDog.eat();
        myDog.roll(2);
        myCat.eat();
        myCat.rub();

/*
        // 자식 클래스와 부모 클래스의 필드 출력
        myDog.displayNames();
        // 부모 클래스의 메서드 호출(부모 클래스의 name 필드 사용)
        myDog.printName();
*/



    }
}
