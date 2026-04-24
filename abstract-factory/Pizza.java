public abstract class Pizza {
    String name;

    Dough dough;
    Sauce sauce;
    Cheese cheese;


    abstract void prepare();

    void bake() {
        System.out.println("Bake for 25 minutes at 180°C");
    }

    void cut() {
        System.out.println("Cutting pizza into slices");
    }

    void box() {
        System.out.println("Placing pizza in official box");
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Pizza: " + name +
                "\n Dough: " + dough +
                "\n Sauce: " + sauce +
                "\n Cheese: " + cheese;
    }
}
