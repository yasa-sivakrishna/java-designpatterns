public class Bank {
    private BankAccountFactory bankAccountFactory=new DefaultBankAccountFactory();
    public Bank(BankAccountFactory factory){
        factory=bankAccountFactory;
    }
    public BankAccount createBankAccount(String accountType){
       return bankAccountFactory.createBankAccount(accountType);
    }
}
