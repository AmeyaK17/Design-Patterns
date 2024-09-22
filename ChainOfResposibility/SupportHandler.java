package ChainOfResposibility;

public abstract class SupportHandler implements Handler{
    @Override
    public void handle(String request, Handler nextHandler){
        if(nextHandler != null){
            nextHandler.handle(request, null);
        }
    }
}
