package ChainOfResposibility;

public class AdvancedSupportHandler extends SupportHandler{
    @Override
    public void handle(String request){
        if(request.equalsIgnoreCase("Advanced")) {
            System.out.println("Request handled by: Advanced Support Handler");
        }
        else{
            System.out.println("Advanced Support Handler: Passing request to next handler.");
            super.handle(request);
        }
    }
}
