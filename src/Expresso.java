public class Expresso extends Beverage{

    Expresso(){
        description="Expresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
