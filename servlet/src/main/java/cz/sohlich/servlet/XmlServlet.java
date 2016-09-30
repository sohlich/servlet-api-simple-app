package cz.sohlich.servlet;

import cz.sohlich.servlet.base.SimpleServletBase;

/**
 *
 * Registered via descriptor.
 * See WEB-INF/web.xml descriptor
 *
 * Created by Radomir Sohlich on 9/29/16.
 */
public class XmlServlet extends SimpleServletBase {

    @Override
    protected String servletOutput() {
        return "xml";
    }
}
