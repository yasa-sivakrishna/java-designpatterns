public class SavingsAccount implements BankAccount{
    @Override
    public void depositCash(double amount) {
        System.out.println("Deposit cash in savings account "+amount);
    }

    @Override
    public void withdrawCash(double amount) {
        System.out.println("Withdraw cash in savings account "+amount);
    }
}
