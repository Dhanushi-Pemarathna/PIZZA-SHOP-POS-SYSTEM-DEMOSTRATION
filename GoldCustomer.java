public class GoldCustomer extends Customer {
    public GoldCustomer(String name, String address, String telephoneNumber) {
        super(name, address, telephoneNumber, true);
    }

    public void promotionMessage() {
        System.out.println("Promotion message sent to " + getName());
    }
}
