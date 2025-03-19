package br.com.rogon.iluwatar.chainresponsability.handlers;

import br.com.rogon.iluwatar.chainresponsability.request.Request;
import br.com.rogon.iluwatar.chainresponsability.request.RequestType;

public class OrcSoldier implements RequestHandler {

    @Override
    public boolean canHandleRequest(Request req) {        
        return req.getRequestType() == RequestType.COLLECT_TAX;
    }

    @Override
    public int getPriority() {
        return 1;
    }

    @Override
    public void handle(Request req) {
        req.markHandled();
        System.out.println(name() + " handling request " + req);
        
    }

    @Override
    public String name() {
        return "Orc Soldier";
    }
    
}
