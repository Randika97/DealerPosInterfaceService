package com.integration.rest.config.rest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class GeneralPurporseInterceptor implements HandlerInterceptor{
    private final Logger LOG = LoggerFactory.getLogger(GeneralPurporseInterceptor.class);
    @Autowired
    private HttpSession session;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("in pre handle method of the interceptor");
        System.out.println("in pre handle method of the interceptor");
        long startTime = System.currentTimeMillis();
        request.setAttribute("executionTime", startTime);
//
//        if (request.getHeader("Auth") == null){
//            LOG.info("Authorization not sent.");
//            LOG.info("Validation NOK.");
//            return false;
//        }
//        else if (request.getHeader("Auth").equals("has"))    {
//            LOG.info("Validation OK.");
//            return true;
//        } else {
//            LOG.info("Validation NOK.");
//            return false;
//        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("in post handle method of the interceptor");
        System.out.println("in post handle method of the interceptor");
        long startTime = (Long) request.getAttribute("executionTime");
        LOG.info("Execution time for handling the request was: {} ms",
                System.currentTimeMillis() - startTime);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        LOG.info("in after complete method of the interceptor");
        System.out.println("in after complete method of the interceptor");
    }
}
