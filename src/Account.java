public abstract class Account {
    private long balance;

    public abstract boolean add(long amount);
    public abstract boolean pay(long amount);
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

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }
}
