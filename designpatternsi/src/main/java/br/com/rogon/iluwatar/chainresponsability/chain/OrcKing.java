package br.com.rogon.iluwatar.chainresponsability.chain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import br.com.rogon.iluwatar.chainresponsability.handlers.OrcCommander;
import br.com.rogon.iluwatar.chainresponsability.handlers.OrcOfficer;
import br.com.rogon.iluwatar.chainresponsability.handlers.OrcSoldier;
import br.com.rogon.iluwatar.chainresponsability.handlers.RequestHandler;
import br.com.rogon.iluwatar.chainresponsability.request.Request;

public class OrcKing{
    private List<RequestHandler> handlers;

    public OrcKing(){
        buildChain();
    }

    private void buildChain(){
        handlers = Arrays.asList(new OrcCommander(), new OrcOfficer(), new OrcSoldier());
    }

    public void makeRequest(Request req){
        handlers
            .stream()
            .sorted(Comparator.comparing(RequestHandler::getPriority))
            .filter(handler -> handler.canHandleRequest(req))
            .findFirst()
            .ifPresent(handler -> handler.handle(req));
    }
}
