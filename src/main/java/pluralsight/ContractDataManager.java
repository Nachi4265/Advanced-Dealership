package pluralsight;

public class ContractDataManager {

//    Phase 2
//    Phase 2 should be the construction of your ContractDataManager.  The
//    saveContract() method will accept a Contract parameter, but you will need
//    to use instanceof to check the type of contract because the format of what you
//    write to the file changes depending on the contract type.

    public void saveContract(Contract contract){

        if(Contract instanceof SalesContract){
            //todo filewriter for sale
        }

        if(Contract instanceof LeaseContract){
            //todo filewriter for lease
        }


    }
}
