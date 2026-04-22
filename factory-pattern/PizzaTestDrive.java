public class PizzaTestDrive {
    public static void main(String[] args){


        PizzaStore nystore=new NYPizzaStore();
        nystore.orderPizza("cheese");

        PizzaStore chicagoStore=new ChicagoPizzaStore();
        chicagoStore.orderPizza("cheese");
    }
}
