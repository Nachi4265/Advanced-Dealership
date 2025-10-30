package pluralsight;

public class LeaseContract extends Contract{

    private double endingValue; //(50% of the original price)
    private double leaseFee; // (7% of the original price)

    public LeaseContract(String contractDate, String customerName, String customerEmail,
                         String vehicleSold, double endingValue, double leaseFee) {
        super(contractDate, customerName, customerEmail, vehicleSold);
        this.endingValue = endingValue;
        this.leaseFee = leaseFee;
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
        //todo
    }

    @Override public double getTotalPrice(){
        //todo
    }


//• Monthly payment based on
//• All leases are financed at 4.0% for 36 months


}
