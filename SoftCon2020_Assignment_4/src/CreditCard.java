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
}

    // There are three different types of credit
    // cards: Regular credit card, Gold credit card, and Platinum credit card

class RegularCard extends CreditCard {

}

class GoldCard extends CreditCard{

}

class PlatinumCard extends CreditCard{
}



