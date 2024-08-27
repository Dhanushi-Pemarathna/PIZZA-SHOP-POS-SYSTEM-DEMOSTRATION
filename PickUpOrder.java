public class PickUpOrder extends Order {
    public PickUpOrder(Customer customer) {
        super(customer);
    }

    @Override
    public double calculateBill() {
        double total = 0;
        for (Pizza pizza : pizzas) {
            total += pizza.getPrice();
        }
        for (Beverage beverage : beverages) {
            total += beverage.getPrice();
        }
        if (total > 5000) {
            total *= 0.9; // 10% discount
        }
        return total;
    }
}
