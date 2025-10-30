package pluralsight;

public class LeaseContract extends Contract{

    private double endingValue; //(50% of the original price)
    private double leaseFee; // (7% of the original price)

    public LeaseContract(String contractDate, String customerName, String customerEmail,
                         Vehicle vehicleSold) {
        super(contractDate, customerName, customerEmail, vehicleSold);

        this.endingValue = vehicleSold.getPrice() / 2; // (50% of the original price)
        this.leaseFee = vehicleSold.getPrice() * 0.07; // (7% of the original price)
    }

    public double getEndingValue() {
        return endingValue;
    }

    public void setEndingValue(double endingValue) {
        this.endingValue = endingValue;
    }

    public double getLeaseFee() {
        return leaseFee;
    }

    public void setLeaseFee(double leaseFee) {
        this.leaseFee = leaseFee;
    }


    @Override public double getMonthlyPayment(){
        //All leases are financed at 4.0% for 36 months

        double leaseAmount = getTotalPrice();
        int leaseTerm = 36;
        double interestRate = 4/100;
        double totalAmount = (leaseAmount*interestRate)+ leaseAmount;

        double monthlyPayment = totalAmount / leaseTerm;

        return monthlyPayment;

    }

    @Override public double getTotalPrice() {
        double totalPrice = endingValue + leaseFee;
        return totalPrice;
    }
}
