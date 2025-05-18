public class CheckingAccount implements BankAccount{
    @Override
    public void depositCash(double amount) {
        System.out.println("Deposit cash in checking account "+amount);
    }

    @Override
    public void withdrawCash(double amount) {
        System.out.println("Withdraw cash in checking account "+amount);
    }
}
