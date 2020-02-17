public class RubberDuck extends Duck {

    public RubberDuck() {
        this.setQuackBehavior(new MuteQuack());
        this.setFlyBehavior(new FlyNoWay());
    }

    @Override
    void display() {
        System.out.println("i'm rubber duck\n");
    }

}
