package com.imooc.passbook.security;

import antlr.StringUtils;
import com.imooc.passbook.constant.Constants;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Security Interceptor
 * validate merchant token
 */
@Component
public class AuthCheckInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response, Object handler) throws Exception {
        String token = request.getHeader(Constants.TOKEN_STRING);
        if (token.isEmpty()) {
            throw new Exception("No " + Constants.TOKEN_STRING + " in Header!");
        }
        if (!token.equals(Constants.TOKEN)) {
            throw new Exception("Wrong " + Constants.TOKEN_STRING + " in Header!");
        }
        AccessContext.setToken(token);
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request,
                           HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request,
                                HttpServletResponse response, Object handler, Exception ex) throws Exception {
        AccessContext.clearAccessKey();
    }
}
