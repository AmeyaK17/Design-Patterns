package ChainOfResposibility;

public class Main {
    public static void main(String[] args) {
        Handler basicSupport = new BasicSupportHandler();
        Handler intermediateSupport = new IntermediateSupportHandler();
        Handler advancedSupport = new AdvancedSupportHandler();

        basicSupport.setNextHandler(intermediateSupport);
        intermediateSupport.setNextHandler(advancedSupport);

        basicSupport.handle("Basic");

        System.out.println();

        basicSupport.handle("Intermediate");

        System.out.println();

        basicSupport.handle("Advanced");

        System.out.println();

        basicSupport.handle("Unknown");
    }
}
