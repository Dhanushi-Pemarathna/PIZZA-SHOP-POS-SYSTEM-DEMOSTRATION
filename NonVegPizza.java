public class NonVegPizza extends Pizza {
    public NonVegPizza() {
        super("Non-Veg Pizza");
    }

    @Override
    public double getPrice() {
        return 800.0;
    }
}
