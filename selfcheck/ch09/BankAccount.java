package selfcheck.ch09;

class LowBalanceException extends Exception { // 사용자 정의 예외 클래스
    public LowBalanceException(String message) {
        super(message);
    }
}
class BankAccount { // 은행 계좌 클래스
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println(amount + "원이 입금됐습니다.");
        System.out.println("현재 잔액: " + balance + "원");
    }
    public void withdraw(double amount) throws LowBalanceException {
        System.out.println(amount + "원을 출금합니다.");
        if (amount > balance) {
            throw new LowBalanceException("잔액이 부족합니다.");
        }
        balance -= amount;
        System.out.println(amount + "원이 출금됐습니다.");
        System.out.println("현재 잔액: " + balance + "원");
    }
    public double getBalance() {
        return balance;
    }
}
