package CreationalPatterns.Prototype;

public class Address {

    public String street;
    public String City;

    public Address(String street, String city) {
        this.street = street;
        City = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }
}
