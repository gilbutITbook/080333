package selfcheck.ch09;

public class SelfCheckCh09 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100000); // 초기 잔액 100,000원
        try {
            account.deposit(50000); // 50,000원 입금
            account.withdraw(200000); // 200,000원 출금 시도(잔액 부족)
        } catch (LowBalanceException e) {
            System.out.println("오류: " + e.getMessage());
        } finally {
            System.out.println("현재 잔액: " + account.getBalance() + "원");
        }
    }
}
