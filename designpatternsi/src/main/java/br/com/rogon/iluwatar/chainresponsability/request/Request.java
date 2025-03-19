package br.com.rogon.iluwatar.chainresponsability.request;

import java.util.Objects;

public class Request {
    private RequestType requestType;
    private String requestDescription;
    private boolean handled;

    public Request(RequestType requestType, String requestDescription) {
        this.requestType = Objects.requireNonNull(requestType);
        this.requestDescription = Objects.requireNonNull(requestDescription);
    }

    public String getRequestDescription() {
        return requestDescription;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void markHandled(){
        this.handled = true;
    }

    public boolean isHandled() {
        return handled;
    }

    @Override
    public String toString() {
        return getRequestDescription();
    }
}
