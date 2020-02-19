public class Coffee extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Dripping Coffee");
    }

    @Override
    void addCondiments() {
        System.out.println("Addign sugar and milk");
    }

    @Override
    boolean customerWantsCondiments() {
        // String answer = getUserInput();
        return true;
    }
}
