package com.emails.client.connector;

import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

import static com.emails.client.utils.ApplicationProperties.getServiceUrl;

public class SOAPConnector extends WebServiceGatewaySupport {

    public Object callWebService(Object request) {
        return getWebServiceTemplate().marshalSendAndReceive(getServiceUrl(), request);
    }
}