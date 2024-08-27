public class Customer {
    private String name;
    private String address;
    private String telephoneNumber;
    private boolean isGoldCustomer;


    public Customer(String name, String address, String telephoneNumber, boolean isGoldCustomer){
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.isGoldCustomer = isGoldCustomer;
    }

    public String getName(){
        return name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public boolean getIsGoldCustomer() {
        return isGoldCustomer;
    }
}
