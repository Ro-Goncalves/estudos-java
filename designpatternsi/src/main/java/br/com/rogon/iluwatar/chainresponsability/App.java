package br.com.rogon.iluwatar.chainresponsability;

import br.com.rogon.iluwatar.chainresponsability.chain.OrcKing;
import br.com.rogon.iluwatar.chainresponsability.request.Request;
import br.com.rogon.iluwatar.chainresponsability.request.RequestType;

public class App {
    public static void main(String[] args) {
        var king = new OrcKing();
        king.makeRequest(new Request(RequestType.DEFEND_CASTLE, "defend castle"));
        king.makeRequest(new Request(RequestType.TORTURE_PRISONER, "torture prisoner"));
        king.makeRequest(new Request(RequestType.COLLECT_TAX, "collect tax"));
    }
}
