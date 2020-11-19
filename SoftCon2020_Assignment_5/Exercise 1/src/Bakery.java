abstract class Bakery {
    boolean isBread;
    boolean isSweets;
    String bakeryName;
    String streetName;
    int streetNumber;
    int postalCode;
    String cityName;

    public boolean isBread() {
        return isBread;
    }
    public boolean isSweets() {
        return isSweets;
    }
    public String getBakeryName() {
        return bakeryName;
    }
    public String getStreetName() {
        return streetName;
    }
    public int getStreetNumber() {
        return streetNumber;
    }
    public int getPostalCode() {
        return postalCode;
    }
    public String getCityName() {
        return cityName;
    }
    public void setBread(boolean bread) {
        isBread = bread;
    }
    public void setSweets(boolean sweets) {
        isSweets = sweets;
    }
    public void setBakeryName(String bakeryName) {
        this.bakeryName = bakeryName;
    }
    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }
    public void setStreetNumber(int streetNumber) {
        this.streetNumber = streetNumber;
    }
    public void setPostalCode(int postalCode) {
        this.postalCode = postalCode;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * Prints the name of the bakery in the terminal
     */
    public void printName(){
        System.out.println(bakeryName);
    }


}

class NormalBakery extends Bakery{
    public NormalBakery(String bakeryName, String streetName, int streetNumber, int postalCode, String cityName){
        this.setBakeryName(bakeryName);
        this.setStreetName(streetName);
        this.setStreetNumber(streetNumber);
        this.setPostalCode(postalCode);
        this.setCityName(cityName);

        this.setBread(true);
        this.setSweets(true);
    }
}

class BreadBakery extends Bakery{
    public BreadBakery(String bakeryName, String streetName, int streetNumber, int postalCode, String cityName){
        this.setBakeryName(bakeryName);
        this.setStreetName(streetName);
        this.setStreetNumber(streetNumber);
        this.setPostalCode(postalCode);
        this.setCityName(cityName);

        this.setBread(true);
        this.setSweets(false);
    }
}

class SweetsBakery extends Bakery{
    public SweetsBakery(String bakeryName, String streetName, int streetNumber, int postalCode, String cityName){
        this.setBakeryName(bakeryName);
        this.setStreetName(streetName);
        this.setStreetNumber(streetNumber);
        this.setPostalCode(postalCode);
        this.setCityName(cityName);

        this.setBread(false);
        this.setSweets(true);
    }
}