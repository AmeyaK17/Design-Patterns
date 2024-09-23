package ChainOfResposibility;

public interface Handler {
    void setNextHandler(Handler nextHandler);
    void handle(String request);
}
