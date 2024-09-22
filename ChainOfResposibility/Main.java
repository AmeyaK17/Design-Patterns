package ChainOfResposibility;

public class Main {
    public static void main(String[] args) {
        Handler basicSupport = new BasicSupportHandler();
        Handler intermediateSupport = new IntermediateSupportHandler();
        Handler advancedSupport = new AdvancedSupportHandler();

        basicSupport.handle("Basic", intermediateSupport);

        basicSupport.handle("Intermediate", intermediateSupport);

        basicSupport.handle("Advanced", advancedSupport);

        basicSupport.handle("Unknown", intermediateSupport);
    }
}
