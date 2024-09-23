package ChainOfResposibility;

public class IntermediateSupportHandler extends SupportHandler{
    @Override
    public void handle(String request){
        if(request.equalsIgnoreCase("Intermediate")) {
            System.out.println("Request handled by: Intermediate Support Handler");
        }
        else{
            System.out.println("Intermediate Support Handler: Passing request to next handler.");
            super.handle(request);
        }
    }
}
