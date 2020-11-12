import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;
abstract class CreditCard {

    // data of the owner
    private String ownerData;
    // serial number
    private int serialNumber;
    // security code of three digits
    private int securityCode;
    // expiration date
    private String expirationDate;
    // card limit
    private double cardLimit;

    public String getOwnerData(){
        return this.ownerData;
    };
    public int getSerialNumber(){
        return this.serialNumber;
    };
    public int getSecurityCode(){
        return this.securityCode;
    };
    public String getExpirationDate(){
        return this.expirationDate;
    };
    public double getCardLimit(){
        return this.cardLimit;
    };

    public void setOwnerData(String ownerData) { this.ownerData = ownerData; }
    public void setSerialNumber(int serialNumber) { this.serialNumber = serialNumber;}
    public void setSecurityCode() {
        this.securityCode = ThreadLocalRandom.current().nextInt(100, 999);}
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate;}
    public void setCardLimit(double cardLimit) { this.cardLimit = cardLimit;}
}
// There are three different types of credit
// cards: Regular credit card, Gold credit card, and Platinum credit card

class RegularCard extends CreditCard {
    public RegularCard(String ownerData, int serialNumber, String expirationDate){
        setCardLimit(2000);
        setOwnerData(ownerData);
        setSerialNumber(serialNumber);
        setSecurityCode();
        setExpirationDate(expirationDate);
    }
}
class GoldCard extends CreditCard{
    public GoldCard(String ownerData, int serialNumber, String expirationDate){
        setCardLimit(5000);
        setOwnerData(ownerData);
        setSerialNumber(serialNumber);
        setSecurityCode();
        setExpirationDate(expirationDate);
    }
}
class PlatinumCard extends CreditCard{
    public PlatinumCard(String ownerData, int serialNumber, String expirationDate){
        setCardLimit(10000);
        setOwnerData(ownerData);
        setSerialNumber(serialNumber);
        setSecurityCode();
        setExpirationDate(expirationDate);
    }
}

}



