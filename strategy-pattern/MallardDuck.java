public class MallardDuck extends Duck{
    public MallardDuck(){
        fb= new FlyWithWings();
        qb= new Quack();
    }

    @Override
    public void display() {
        System.out.println("I'm a Mallard Duck");
    }

}
