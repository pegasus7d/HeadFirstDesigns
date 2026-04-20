public abstract class Duck {
    Flybehaviour fb;
    QuackBehaviour qb;
    public Duck(){}


    public abstract void display();


    public void performFly(){
        fb.fly();
    }


    public void peformQuack(){
        qb.quack();
    }

    public void swim(){
        System.out.println("All Ducks can Swim");
    }


    public void setFlybehaviour(Flybehaviour fb){
        this.fb=fb;
    }


    public void setQuackBehaviour(QuackBehaviour qb){
        this.qb=qb;
    }
}
