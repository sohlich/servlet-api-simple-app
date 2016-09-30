package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

/**
 * InitializerServlet is registered by {@link javax.servlet.ServletContainerInitializer}
 * interface implmented in initializer module. This class must be included in
 * WAR package as JAR file in WEB-INF/lib folder as described in doc to
 * META-INF/services folder be read.
 *
 * Created by Radomir Sohlich on 9/29/16.
 */
public class InitializerServlet extends SimpleServletBase {
    @Override
    protected String servletOutput() {
        return "initializer";
    }
}
