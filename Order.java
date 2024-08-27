import java.util.ArrayList;
import java.util.List;

public abstract class Order {
    protected Customer customer;
    protected List<Pizza> pizzas;
    protected List<Beverage> beverages;

    public Order(Customer customer) {
        this.customer = customer;
        this.pizzas = new ArrayList<>();
        this.beverages = new ArrayList<>();
    }

    public void addPizza(Pizza pizza) {
        pizzas.add(pizza);
    }

    public void addBeverage(Beverage beverage) {
        beverages.add(beverage);
    }

    public abstract double calculateBill();

    public Customer getCustomer() {
        return customer;
    }

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Beverage> getBeverages() {
        return beverages;
    }
}
