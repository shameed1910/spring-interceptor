package com.example.interceptor.springinterceptors.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Component
public class OrderInterceptor implements HandlerInterceptor
{
    private Logger LOG = LoggerFactory.getLogger(OrderInterceptor.class);


    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        LOG.info("preHandle invoked.......{}:{}"+request.getRequestURI(), request.getMethod());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        LOG.info("postHandle invoked.......{}:{}"+request.getRequestURI(), request.getMethod());

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if(ex!=null){
            LOG.error("exception::"+ex.getMessage());
        }
        LOG.info("afterCompletion invoked.......{}:{}"+request.getRequestURI(), request.getMethod());
    }
}
