package br.com.rogon.iluwatar.chainresponsability.handlers;

import br.com.rogon.iluwatar.chainresponsability.request.Request;

public interface RequestHandler {
    boolean canHandleRequest(Request req);
    int getPriority();
    void handle(Request req);
    String name();
}
