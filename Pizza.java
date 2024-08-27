import java.util.*;

public abstract class Pizza {
    protected String name;
    protected List<String> ingredients;

    public Pizza(String name) {
        this.name = name;
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(String ingredient) {
        ingredients.add(ingredient);
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public abstract double getPrice();
}
