public class CheesePizza extends  Pizza{
    PizzaIngredientFactory ingredientFactory;


    public CheesePizza(PizzaIngredientFactory factory) {
        this.ingredientFactory = factory;
    }

    @Override
    void prepare() {
        System.out.println("\nPreparing " + name);

        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
