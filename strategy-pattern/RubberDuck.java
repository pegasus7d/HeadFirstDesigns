public class RubberDuck extends Duck{
    RubberDuck(){
        fb=new FlyNoWay();
        qb=new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Rubber Duck");
    }
}
