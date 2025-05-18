public class DefaultBankAccountFactory implements BankAccountFactory{
    @Override
    public BankAccount createBankAccount(String accountType) {
        if("checking".equals(accountType)){
            return new CheckingAccount();
        }else if ("savings".equalsIgnoreCase(accountType)) {
            return new SavingsAccount();
        } else {
            throw new IllegalArgumentException("Invalid account type: " + accountType);
        }
    }
}
