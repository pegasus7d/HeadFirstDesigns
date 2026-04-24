public class NYPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        if (type.equalsIgnoreCase("cheese")) {
            pizza = new CheesePizza(factory);
            pizza.name = "New York Style Cheese Pizza";
        }
        return pizza;
    }
}
