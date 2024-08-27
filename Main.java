public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nima;", "123 Colombo" , "12345678", false);
        GoldCustomer customer2 = new GoldCustomer("Jane Smith", "456 Baththaramulla", "555-5678");

        Pizza vegPizza = new VegPizza();
        vegPizza.addIngredient("Tomato");
        vegPizza.addIngredient("Cheese");

        Pizza nonVegPizza = new NonVegPizza();
        nonVegPizza.addIngredient("Chicken");
        nonVegPizza.addIngredient("Cheese");

        Beverage beverage = new Beverage("Coke", 50);

        DeliveryOrder deliveryOrder = new DeliveryOrder(customer1);
        deliveryOrder.addPizza(vegPizza);
        deliveryOrder.addBeverage(beverage);

        PickUpOrder pickUpOrder = new PickUpOrder(customer2);
        pickUpOrder.addPizza(nonVegPizza);

        Admin admin = new Admin();
        admin.addOrder(deliveryOrder);
        admin.addOrder(pickUpOrder);

        System.out.println("Total pizzas made: " + admin.getTotalPizzasMade());
        System.out.println("Bill for delivery order: " + deliveryOrder.calculateBill());
        System.out.println("Bill for pick-up order: " + pickUpOrder.calculateBill());

        customer2.promotionMessage();
    }
}
