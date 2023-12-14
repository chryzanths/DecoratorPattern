public class GSave implements BankAccountDecorator{
    @Override
    public String showAccountType() {
        return null;
    }

    @Override
    public Double getInterestRate() {
        return 2.5;
    }

    @Override
    public Double getBalance() {
        return getBalance();
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
