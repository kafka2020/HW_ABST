public class CreditAccount extends Account {
    private final long limit;

    public CreditAccount(long limit) {
        this.limit = limit;
    }

    @Override
    public boolean add(long amount) {
        if (amount > Math.abs(super.getBalance())) {
            return false;
        }
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (Math.abs(super.getBalance() - amount) > limit) {
            return false;
        }
        super.setBalance(super.getBalance() - amount);
        return true;
    }

//    @Override
//    public boolean transfer(Account account, long amount) {
//        return false;
//    }
}
