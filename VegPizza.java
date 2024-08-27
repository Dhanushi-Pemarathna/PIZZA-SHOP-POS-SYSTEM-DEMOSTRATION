public class VegPizza extends Pizza {
    public VegPizza() {
        super("Veg Pizza");
    }

    @Override
    public double getPrice() {
        return 500.0;
    }
}
