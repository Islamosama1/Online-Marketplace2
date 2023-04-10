public class Payment {
    private String customerCashNumber;
    private double amount;
    private String myCashNumber = "01092074839";

    public Payment(String customerCashNumber, double amount) {
        this.customerCashNumber = customerCashNumber;
        this.amount = amount;
    }

    public String getCustomerCashNumber() {
        return customerCashNumber;
    }

    public void setCustomerCashNumber(String customerCashNumber) {
        this.customerCashNumber = customerCashNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}