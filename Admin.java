import java.util.ArrayList;
import java.util.List;

public class Admin {
    private List<Order> orders;
    private int totalPizzasMade;

    public Admin() {
        this.orders = new ArrayList<>();
        this.totalPizzasMade = 0;
    }

    public void addOrder(Order order) {
        orders.add(order);
        totalPizzasMade += order.getPizzas().size();
    }

    public int getTotalPizzasMade() {
        return totalPizzasMade;
    }
}
