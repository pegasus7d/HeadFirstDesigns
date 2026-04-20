public class DuckSimulator {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.peformQuack();
        mallard.swim();

        Duck rubberduck = new RubberDuck();
        rubberduck.display();
        rubberduck.performFly();
        rubberduck.peformQuack();
        rubberduck.swim();



        Duck modelduck = new ModelDuck();
        modelduck.setFlybehaviour(new FlyRocketBehavior());
        modelduck.display();
        modelduck.performFly();
        modelduck.peformQuack();
        modelduck.swim();

        
    }
}
