package selfcheck.ch08;

public class SelfCheck08 {
    public static void main(String[] args) {
        // 적금 계좌 생성(이자율 5%, 매월 50,000원 적금)
        SavingsAccount mySavings = new SavingsAccount("987-6543210", 0, 0.05, 50000);
        mySavings.addMonthlyDeposit(); // 매월 적금액 추가
        mySavings.addInterest(); // 이자 계산 및 추가
        mySavings.displayAccountInfo();
    }
}
