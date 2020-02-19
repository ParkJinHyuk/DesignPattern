public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) addCondiments();
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("boiling..");
    }

    void pourInCup() {
        System.out.println("pouring..");
    }

    boolean customerWantsCondiments() {
        return true;
    }
}
