public class RedHeadDuck extends Duck {

    public RedHeadDuck() {
        this.setQuackBehavior(new Quack());
        this.setFlyBehavior(new FlyWithWings());
    }

    @Override
    void display() {
        System.out.println("i'm redhead duck\n");
    }
}
