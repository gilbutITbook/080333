package ch08_interface;

public class CheckingAccount implements BankAccount, Interest {
    String accountNumber; // 계좌 번호
    double balance;  // 잔액
    double interestRate; // 이자율
    // 생성자
    public CheckingAccount(String accountNumber, double initialBalance, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate; // 이지율 초기화
    }
    // 입금 메서드 구현
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금됐습니다.");
            System.out.println("잔액: " + balance + "원");
        } else {
            System.out.println("입금액은 0보다 커야 합니다.");
        }
    }
    // 출금 메서드 구현
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금됐습니다.");
            System.out.println("현재 잔액: " + balance + "원");
        } else {
            System.out.println("잔액이 부족해 출금할 수 없습니다.");
        }
    }
    // 계좌 정보 출력 메서드 구현
    public void displayAccountInfo() {
        System.out.println("----- 계좌 정보 -----");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("이자율: " + (interestRate * 100) + "%"); // 이자율 표시
    }
    // 이자 계산 메서드 구현
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("이자 " + interest + "원이 추가됐습니다.");
    }
}
