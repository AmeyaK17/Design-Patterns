package ChainOfResposibility;

public interface Handler {
    void handle(String request, Handler nextHandler);
}
