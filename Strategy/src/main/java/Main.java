public class Main {
    public static void main(String[] args) {

        Duck redheadDuck = new RedHeadDuck();
        redheadDuck.display();
        redheadDuck.swim();
        redheadDuck.performFly();
        redheadDuck.performQuack();

        Duck rubberDuck = new RubberDuck();
        rubberDuck.display();
        rubberDuck.swim();
        rubberDuck.performFly();
        rubberDuck.performQuack();
    }
}
