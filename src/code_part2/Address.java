package code_part2;

public class Address {

    private String street;
    private int number;
    private String Postal;

    public Address(String street, int number, String Postal) {
        this.street = street;
        this.number = number;
        this.Postal = Postal;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostal() {
        return Postal;
    }

    public void setPostal(String Postal) {
        this.Postal = Postal;
    }

    public String toString() {
        return street + " " + number + " " + Postal;
    }

}
