public class ModelDuck extends Duck{
    ModelDuck(){
        fb=new FlyNoWay();
        qb=new Quack();
    }




    @Override
    public void display() {
        System.out.println("I am a model Duck ");
    }
}
