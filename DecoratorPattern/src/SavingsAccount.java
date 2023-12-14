public class SavingsAccount implements BankAccount{
    private String accountNumber;
    private String accountName;
    private Double balance;

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public String showAccountType() {
        return null;
    }

    @Override
    public Double getInterestRate() {
        return 1.0;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public Double showBenefits() {
        return null;
    }

    @Override
    public Double computeBalanceWithInterest() {
        double amount = getBalance();

    }

    @Override
    public String showInfo() {
        return null;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
