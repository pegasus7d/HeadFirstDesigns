public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new ChicagoPizzaIngredientFactory();

        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.name = "Chicago Style Cheese Pizza";
        }

        return pizza;
    }
}
