package cz.sohlich.filter;

import cz.sohlich.filter.base.SimpleFilterBase;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * InitializerFilter registered in context by
 * {@link cz.sohlich.app.ApplicationInitializer}.
 *
 * Created by Radomir Sohlich on 9/30/16.
 */
public class InitializerFilter extends SimpleFilterBase {
    @Override
    public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
        chain.doFilter(request, response);
    }
}
