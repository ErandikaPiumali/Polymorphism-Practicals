import java.util.concurrent.Callable;

public class CentralBank {
    void leasingRate() {
        System.out.println("Below 30%");
    }
}
class CommercialBank extends CentralBank{
    @Override
    void leasingRate() {
        System.out.println("25%");
    }
    void housingloanRate(){
        System.out.println("25%");
    }
}
class CommercialLeasing extends CentralBank{
    @Override
    void leasingRate() {
        System.out.println(" 23%");
    }
}
class CommercialCredit extends CentralBank {
    @Override
    void leasingRate() {
        System.out.println(" 22%");}
        void housingloanRate(){
            System.out.println("20%");
        }
    }

class RateResult {
    public static void main(String[] args) {
        CentralBank c = new CentralBank();
        CentralBank cb = new CommercialBank();
        CentralBank cl = new CommercialLeasing();
        CentralBank cc = new CommercialCredit();
        c.leasingRate();
        cb.leasingRate();
        cl.leasingRate();
        cc.leasingRate();
        CommercialBank cbl = new CommercialBank();
        cbl.housingloanRate();
        CommercialCredit ccc = new CommercialCredit();
        ccc.housingloanRate();


    }
}


