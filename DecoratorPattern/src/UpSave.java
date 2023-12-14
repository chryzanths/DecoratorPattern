public class UpSave implements BankAccountDecorator{

    private BankAccount bankAccount;

    public BankAccount getBankAccount() {
        return bankAccount;
    }

    @Override
    public String showAccountType() {
        return null;
    }

    @Override
    public Double getInterestRate() {
        return 4.0;
    }

    @Override
    public Double getBalance() {
        return null;
    }

    @Override
    public Double showBenefits() {
        return null;
    }

    @Override
    public Double computeBalanceWithInterest() {
        return null;
    }

    @Override
    public String showInfo() {
        return null;
    }

    @Override
    public void setBankAccount(BankAccount bankAccount) {

    }
}
