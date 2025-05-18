
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank(new DefaultBankAccountFactory());
        BankAccount checkingAccount = bank.createBankAccount("checking");
        BankAccount savingsAccount = bank.createBankAccount("savings");

        checkingAccount.depositCash(100);
        savingsAccount.withdrawCash(50);
    }
}