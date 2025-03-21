public class SimpleAccount extends Account {
    @Override
    public boolean add(long amount) {
        super.setBalance(super.getBalance() + amount);
        return true;
    }

    @Override
    public boolean pay(long amount) {
        if (super.getBalance() >= amount) {
            super.setBalance(super.getBalance() - amount);
            return true;
        }
        return false;
    }

    @Override
    public boolean transfer(Account account, long amount) {
        if (this.pay(amount)) {
            if (account.add(amount)) {
                return true;
            } else {
                this.add(amount);
                return false;
            }
        }
        return false;
    }
}
