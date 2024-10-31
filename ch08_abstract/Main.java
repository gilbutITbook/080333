package ch08_abstract;

public class Main {
    public static void main(String[] args) {
        // 입출금 계좌 객체 생성
        CheckingAccount mySavings = new CheckingAccount("123-4567890", 100000);
        mySavings.displayAccountInfo();
        mySavings.withdraw(100000); // 출금
        mySavings.deposit(50000); // 입금

        //mySavings.applyInterest();


/*        System.out.println();

        // 당좌 계좌 생성
        CheckingAccount myChecking = new CheckingAccount("789-012", 500000, 100000);
        //myChecking.deposit(100000);
        myChecking.withdraw(600000);
        myChecking.displayAccountInfo();*/
    }
}
