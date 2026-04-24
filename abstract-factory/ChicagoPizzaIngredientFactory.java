public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory{

    @Override
    public Cheese createCheese() {
        return new MozzarellaCheese();
    }

    @Override
    public Sauce createSauce() {
        return new PlumTomatoSauce();
    }

    @Override
    public Dough createDough() {
        return new ThickCrustDough();
    }
}
