package ch08_abstract;

class CheckingAccount extends BankAccount {
//    private double interestRate;

    // 생성자
    public CheckingAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
        //this.interestRate = interestRate;
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

/*    // 이자 계산 메서드
    public void applyInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("이자 " + interest + "원이 추가되었습니다. 현재 잔액: " + balance + "원");
    }*/
}