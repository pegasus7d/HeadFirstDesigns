public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        if (pizza == null) {
            System.out.println("Invalid type!");
            return null;
        }


        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        System.out.println(pizza);

        return pizza;

    }

    abstract Pizza createPizza(String type);
}
