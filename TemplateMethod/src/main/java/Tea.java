public class Tea extends CaffeineBeverage {
    @Override
    void brew() {
        System.out.println("Steeping");
    }

    @Override
    void addCondiments() {
        System.out.println("Adding Lemon");
    }
}
