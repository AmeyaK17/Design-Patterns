package ChainOfResposibility;

public abstract class SupportHandler implements Handler{
    protected Handler nextHandler;
    @Override
    public void setNextHandler(Handler nextHandler){
        this.nextHandler = nextHandler;
    }

    @Override
    public void handle(String request){
        if(nextHandler != null){
            nextHandler.handle(request);
        }
        else{
            System.out.println("ERROR: Request cannot be handled at the moment!");
        }
    }
}
