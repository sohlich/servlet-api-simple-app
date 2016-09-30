package cz.sohlich.filter.base;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Radomir Sohlich on 9/30/16.
 */
public abstract class SimpleFilterBase implements Filter {

    protected final Logger log = LoggerFactory.getLogger(getClass());

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        log.info("Processing request");
        try {
            doFilter((HttpServletRequest) servletRequest, (HttpServletResponse)
                    servletResponse, filterChain);
        } catch (ClassCastException e) {
            log.error("Class cast error for response or request: ", e);
        }

    }

    @Override
    public void destroy() {

    }


    public abstract void doFilter(HttpServletRequest request,
                                  HttpServletResponse
                                          response, FilterChain chain) throws IOException, ServletException;

}
