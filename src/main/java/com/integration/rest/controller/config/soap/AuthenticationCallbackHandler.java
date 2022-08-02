package com.integration.rest.controller.config.soap;

import java.io.IOException;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;

import org.apache.cxf.interceptor.security.AuthenticationException;
import org.apache.wss4j.common.ext.WSPasswordCallback;

public class AuthenticationCallbackHandler implements CallbackHandler {

    WSPasswordCallback wsPasswordCallback = null;

    @Override
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException, AuthenticationException  {
        wsPasswordCallback = (WSPasswordCallback) callbacks[0];
        if(wsPasswordCallback.getIdentifier().equals("randika")) {
            // set the password on the callback. This will be compared to the password which was sent from the client
            wsPasswordCallback.setPassword("password");
        }
    }
}