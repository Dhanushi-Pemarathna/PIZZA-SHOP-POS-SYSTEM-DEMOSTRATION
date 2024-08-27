public class DeliveryOrder extends Order {
    public DeliveryOrder(Customer customer) {
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

    @Override
    public void addPizza(Pizza pizza) {
        if (pizzas.size() + beverages.size() < 5) {
            super.addPizza(pizza);
        } else {
            System.out.println("Cannot add more items to a delivery order.");
        }
    }

    @Override
    public void addBeverage(Beverage beverage) {
        if (pizzas.size() + beverages.size() < 5) {
            super.addBeverage(beverage);
        } else {
            System.out.println("Cannot add more items to a delivery order.");
        }
    }
}
