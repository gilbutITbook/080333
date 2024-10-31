package ch08_abstract;

public abstract class BankAccount {
    // 공통 필드
    String accountNumber; // 계좌 번호
    double balance;  // 잔액
    // 생성자
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    // 추상 메서드(입출금)
    public abstract void withdraw(double amount);
    public abstract void deposit(double amount);

    // 계좌 정보 출력 메서드
    public void displayAccountInfo() {
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
    }

   // 잔액 조회 메서드
   public double getBalance() {
        return balance;
   }
}
