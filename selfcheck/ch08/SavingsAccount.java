package selfcheck.ch08;

class SavingsAccount implements Interest {
    String accountNumber;  // 계좌 번호
    double balance;        // 잔액
    double interestRate;   // 이자율
    double monthlyDeposit; // 매월 적금액
    // 생성자
    public SavingsAccount(String accountNumber, double initialBalance, double interestRate, double monthlyDeposit) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
        this.interestRate = interestRate;
        this.monthlyDeposit = monthlyDeposit;
    }
    // 입금 메서드 구현
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + "원이 입금됐습니다.");
        } else {
            System.out.println("입금액은 0보다 커야 합니다.");
        }
    }
    // 출금 메서드 구현
    public void withdraw(double amount) {
        System.out.println("적금 계좌에서는 출금할 수 없습니다.");
    }
    // 계좌 정보 출력 메서드 구현
    public void displayAccountInfo() {
        System.out.println("----- 계좌 정보 -----");
        System.out.println("계좌번호: " + accountNumber);
        System.out.println("잔액: " + balance + "원");
        System.out.println("이자율: " + (interestRate * 100) + "%");
        System.out.println("매월 적금액: " + monthlyDeposit + "원");
    }
    // 이자 계산 메서드 구현
    public void addInterest() {
        double interest = balance * interestRate;
        balance += interest;
        System.out.println("이자 " + interest + "원이 추가됐습니다.");
    }
    // 매월 적금액 추가 메서드
    public void addMonthlyDeposit() {
        balance += monthlyDeposit;
        System.out.println("매월 " + monthlyDeposit + "원을 입금합니다.");
    }
}
