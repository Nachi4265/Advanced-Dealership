package pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class ContractDataManager {

//    Phase 2
//    Phase 2 should be the construction of your ContractDataManager.  The
//    saveContract() method will accept a Contract parameter, but you will need
//    to use instanceof to check the type of contract because the format of what you
//    write to the file changes depending on the contract type.

    public void saveContract(Contract contract){

        //If it's a Sales Contract
        if(contract instanceof SalesContract){
            try{
                FileWriter fileWriter = new FileWriter("Contracts.csv" , true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                //Casting our contract
              //Type of Variable _ varible name = (Cast Type) original type
                SalesContract sale = (SalesContract) contract;

                //Write the Sales Contract information
                String saleContractData=
                        "SALE"
                        + "|" + sale.getContractDate()
                        + "|" + sale.getCustomerName()
                        + "|" + sale.getCustomerEmail()
                        + "|" + sale.getVehicleSold().getVIN()
                        + "|" + sale.getVehicleSold().getYear()
                        + "|" + sale.getVehicleSold().getMake()
                        + "|" + sale.getVehicleSold().getModel()
                        + "|" + sale.getVehicleSold().getVehicleType()
                        + "|" + sale.getVehicleSold().getColor()
                        + "|" + sale.getVehicleSold().getOdometer()
                        + "|" + sale.getVehicleSold().getPrice()
                        + "|" + sale.getSalesTax()
                        + "|" + sale.getRecordingFee()
                        + "|" + sale.getProcessingFee()
                        + "|" + sale.getTotalPrice()
                        + "|" + sale.isFinance()
                        + "|" + sale.getMonthlyPayment();

                //Write our contract
                bufferedWriter.write(saleContractData);

                //Add a new line so it's not clumped together
                bufferedWriter.newLine();
                bufferedWriter.close();

            }catch (Exception e){
                e.printStackTrace();
            }
        }



        //If it's Lease Contract
        if(contract instanceof LeaseContract){
            try{
                FileWriter fileWriter = new FileWriter("Contracts.csv" ,true);
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                LeaseContract lease = (LeaseContract) contract;
                //Write the Sales Contract information
                String leaseContractData =

                            "LEASE"
                            + "|" + lease.getContractDate()
                            + "|" + lease.getCustomerName()
                            + "|" + lease.getCustomerEmail()
                            + "|" + lease.getVehicleSold().getVIN()
                            + "|" + lease.getVehicleSold().getYear()
                            + "|" + lease.getVehicleSold().getMake()
                            + "|" + lease.getVehicleSold().getModel()
                            + "|" + lease.getVehicleSold().getVehicleType()
                            + "|" + lease.getVehicleSold().getColor()
                            + "|" + lease.getVehicleSold().getOdometer()
                            + "|" + lease.getVehicleSold().getPrice()
                            + "|" + lease.getEndingValue()
                            + "|" + lease.getLeaseFee()
                            + "|" + lease.getTotalPrice()
                            + "|" + lease.getMonthlyPayment();

                bufferedWriter.write(leaseContractData);
                bufferedWriter.newLine();
                bufferedWriter.close();


            }catch (Exception e){
                e.printStackTrace();
            }
        }


    }
}
