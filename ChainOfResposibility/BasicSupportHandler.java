package ChainOfResposibility;

public class BasicSupportHandler extends SupportHandler{
    @Override
    public void handle(String request){
        if(request.equalsIgnoreCase("Basic")) {
            System.out.println("Request handled by: Basic Support Handler");
        }
        else{
            System.out.println("Basic Support Handler: Passing request to next handler.");
            super.handle(request);
        }
    }
}
