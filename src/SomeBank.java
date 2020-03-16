public class SomeBank implements Bank{
    private double balance;

    public SomeBank(double balance) {
        this.balance = balance;
    }

    @Override
    public float getRateOfInterest() throws LowBalanceException{
        float rate = 0;
        if (balance < 10000){
            throw new LowBalanceException("Low Balance");
        }
        if (balance>100000) return 6.5f;
        else if (balance > 50000 && balance <= 100000) return 5f;
        else if (balance > 25000 && balance <=50000) return 3f;
        else if (balance > 10000 && balance <= 25000) return 0f;
        return 0;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
