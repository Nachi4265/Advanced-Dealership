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

        if(Contract instanceof SalesContract){
            //todo filewriter for sale

            try{
                FileWriter fileWriter = new FileWriter("Contracts.csv");
                BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

                //Write the Sales Contract information
                String salesContract=
                        "SALE"
                        + "|" + contract.getContractDate()
                        + "|" + contract.getCustomerName()
                        + "|" + contract.getCustomerEmail()
                        + "|" + contract.getVehicleSold().getVIN()
                        + "|" + contract.getVehicleSold().getYear()
                        + "|" + contract.getVehicleSold().getMake()
                        + "|" + contract.getVehicleSold().getModel()
                        + "|" + contract.getVehicleSold().getVehicleType()
                        + "|" + contract.getVehicleSold().getColor()
                        + "|" + contract.getVehicleSold().getOdometer()
                        + "|" + contract.getVehicleSold().getPrice()
                        + "|" + 

            }catch (Exception e){
                e.printStackTrace();
            }
        }

        if(Contract instanceof LeaseContract){
            //todo filewriter for lease
        }


    }
}
