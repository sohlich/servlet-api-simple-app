package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

/**
 * Listener servlet registered via
 * {@link javax.servlet.ServletContextListener} interface
 * implemented by {@link cz.sohlich.app.ApplicationContextListener}
 * <p>
 * <p>
 * Created by Radomir Sohlich on 9/30/16.
 */
public class ListenerServlet extends SimpleServletBase {
    @Override
    protected String servletOutput() {
        return "listener";
    }
}
