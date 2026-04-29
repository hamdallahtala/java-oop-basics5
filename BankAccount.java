public class BankAccount {
    private String owner;
    private double balance;

    public void setOwner(String owner) {
        this.owner = owner;

    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public String getOwner() {
        return owner;
    }
    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        balance = balance + amount;
        System.out.println("the new balance is " +balance );
        return balance;
    }
    public double WithDraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
            System.out.println("the new balance is : " + balance);
            return balance;
        }else{
            System.out.println("the amount is bigger than the balance");
        }
        return balance;

    }
    public String toString() {
        return "Owner: " + getOwner() + " , Balance : " + getBalance();
    }
}
