package pluralsight;

import java.util.ArrayList;

public class SalesContract extends Contract {


    private double salesTax;   //•Sales Tax Amount (5%)
    private double recordingFee; //• Recording Fee ($100)
    private double processingFee; //• Processing fee ($295 for vehicles under $10,000 and $495 for all others
    private boolean finance;//• Monthly payment (if financed) based on
                            //    All loans are at 4.25% for 48 months if the price is $10,000 or more
                            //• Otherwise they are at 5.25% for 24 month


    public SalesContract(String contractDate, String customerName, String customerEmail, String vehicleSold, double salesTax, double recordingFee, double processingFee, boolean finance) {
        super(contractDate, customerName, customerEmail, vehicleSold);
        this.salesTax = salesTax;
        this.recordingFee = recordingFee;
        this.processingFee = processingFee;
        this.finance = finance;
    }

    public double getSalesTax() {
        return salesTax;
    }

    public void setSalesTax(double salesTax) {
        this.salesTax = salesTax;
    }

    public double getRecordingFee() {
        return recordingFee;
    }

    public void setRecordingFee(double recordingFee) {
        this.recordingFee = recordingFee;
    }

    public double getProcessingFee() {
        return processingFee;
    }

    public void setProcessingFee(double processingFee) {
        this.processingFee = processingFee;
    }

    public boolean isFinance() {
        return finance;
    }

    public void setFinance(boolean finance) {
        this.finance = finance;
    }

    @Override public double getMonthlyPayment(){
        //• All loans are at 4.25% for 48 months if the price is $10,000 or more
        //• Otherwise they are at 5.25% for 24 month

        //if you want to finance here are your options
        //if the vehicles price is more than 10,000 the loan is for 48 months at 4.25%
        //if NOT (else) The loan is for 24 months at 5.25%

        //Do I need an instance of dealership to take a look at my vehicles price?

        if(finance = true){
            if(getVehicleSold().getPrice()>10_000){
                

            }

        }
        return monthlyPayment;
    }

    @Override public double getTotalPrice(){
        //todo
    }

}
