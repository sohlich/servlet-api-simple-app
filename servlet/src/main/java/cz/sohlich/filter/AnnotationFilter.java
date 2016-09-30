package cz.sohlich.filter;

import cz.sohlich.filter.base.SimpleFilterBase;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Radomir Sohlich on 9/30/16.
 */
@WebFilter(filterName = "AnnotationFilter", urlPatterns = "/*")
public class AnnotationFilter extends SimpleFilterBase {


    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        log.info(request.getMethod() + " : " + request.getRequestURI());
        chain.doFilter(request, response);
    }
}
