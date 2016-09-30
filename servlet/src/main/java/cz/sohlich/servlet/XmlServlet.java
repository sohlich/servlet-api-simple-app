package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

/**
 * Created by Radomir Sohlich on 9/29/16.
 */
public class XmlServlet extends SimpleServletBase {

    @Override
    protected String servletOutput() {
        return "xml";
    }
}
