public class CreditCard {

    private String firstName;
    private char middleInitial;
    private String lastName;
    private long accountNumber;
    private int code;
    private double balance;
    private double creditLimit;

    public CreditCard(String firstName, char middleInitial, String lastName, long accountNumber, int code,
                      double balance, double creditLimit) {
        this.firstName = firstName;
        this.middleInitial = middleInitial;
        this.lastName = lastName;
        this.accountNumber = accountNumber;
        this.code = code;
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getBalance() {
        return balance;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public boolean purchase(double amount) {
        if(this.balance + amount  <= this.creditLimit) {
            this.balance += amount;
            return true;
        }
        else {
            return false;
        }
    }

    public void makePayment(double payment) {
        this.balance -= payment;
    }

    public String toString() {
        return String.format("Account #: %d, Name: %s %c %s, Balance: $%.2f, Credit Limit: $%.2f ", this.accountNumber, this.firstName, this.middleInitial, this.lastName, this.balance, this.creditLimit);
    }

}
