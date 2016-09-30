package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

/**
 * Created by Radomir Sohlich on 9/29/16.
 */
public class InitializerServlet extends SimpleServletBase {
    @Override
    protected String servletOutput() {
        return "initializer";
    }
}
