import java.lang.reflect.Array;
import java.util.ArrayList;

abstract class CreditCard {

    // data of the owner
    private ArrayList ownerData;
    // serial number
    private String serialNumber;
    // security code of three digits
    private int securityCode;
    // expiration date
    private String expirationDate;
    // card limit
    private double cardLimit;

    public ArrayList getOwnerData(){
        return this.ownerData;
    };
    public String getSerialNumber(){
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

    public void setOwnerData(ArrayList ownerData) { this.ownerData = ownerData; }
    public void setSerialNumber(String serialNumber) { this.serialNumber = serialNumber;}
    public void setSecurityCode(int securityCode) { this.securityCode = securityCode;}
    public void setExpirationDate(String expirationDate) { this.expirationDate = expirationDate;}
    public void setCardLimit(double cardLimit) { this.cardLimit = cardLimit;}
}
    // There are three different types of credit
    // cards: Regular credit card, Gold credit card, and Platinum credit card

class RegularCard extends CreditCard {
    public RegularCard(ArrayList ownerData, String serialNumber, int securityCode, String expirationDate){
        setCardLimit(2000);
        setOwnerData(ownerData);
        setSerialNumber(serialNumber);
        setSecurityCode(securityCode);
        setExpirationDate(expirationDate);
    }
}
class GoldCard extends CreditCard{
    public GoldCard(ArrayList ownerData, String serialNumber, int securityCode, String expirationDate){
        setCardLimit(5000);
        setOwnerData(ownerData);
        setSerialNumber(serialNumber);
        setSecurityCode(securityCode);
        setExpirationDate(expirationDate);
    }
}
class PlatinumCard extends CreditCard{
    public PlatinumCard(ArrayList ownerData, String serialNumber, int securityCode, String expirationDate){
        setCardLimit(10000);
        setOwnerData(ownerData);
        setSerialNumber(serialNumber);
        setSecurityCode(securityCode);
        setExpirationDate(expirationDate);
    }
}



