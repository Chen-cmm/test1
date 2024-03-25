package oop27;

public class Address {
    private String city;
    private String street;

    public Address() {
    }

    public Address(String city, String street) {
        this.city = city;
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null)return false;
        if (obj==this)return true;
        if (obj instanceof Address){
            Address addr = (Address) obj;
            if (this.city.equals(addr.city)&&this.street.equals(addr.street)){
                return true;
            }
        }
        return false;
    }
}
