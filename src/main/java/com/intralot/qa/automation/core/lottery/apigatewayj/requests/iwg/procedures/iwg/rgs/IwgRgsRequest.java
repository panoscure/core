
package com.intralot.qa.automation.core.lottery.apigatewayj.requests.iwg.procedures.iwg.rgs;

public class IwgRgsRequest {

    private String method;
    private Params params;

    public String getMethod() {
        return method;
    }

    public IwgRgsRequest withMethod(String method) {
        this.method = method;
        return this;
    }

    public Params getParams() {
        return params;
    }

    public IwgRgsRequest withParams(Params params) {
        this.params = params;
        return this;
    }

}
