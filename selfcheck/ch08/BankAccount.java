package selfcheck.ch08;

public interface BankAccount {
    void withdraw(double amount); // 입금 메서드
    void deposit(double amount); // 출금 메서드
    void displayAccountInfo(); // 계좌 정보 출력 메서드
}
